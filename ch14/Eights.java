import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Eights class modified for ch14 exercises.
 * Creates an ArrayList of Players and includes a method 
 * playGames that plays the game multiple times.(comment out 
 * play().waitForUser() to play games automatically).
 * @author ivorgilmartin
 */
public class Eights {
    private ArrayList<Player> players;
    private Hand drawPile;
    private Hand discardPile;
    private Scanner in;

    /**
     * Initializes the state of the game.
     */
    public Eights() {
        players = new ArrayList<Player>();
        players.add(0, new Player("Allen"));
        players.add(1, new Player("Chris"));
        players.add(2, new Genius("Ivor"));
        Deck deck = new Deck("Deck");
        deck.shuffle();

        // deal cards to each player
        int handSize = 5;
        for(int i = 0; i < players.size(); i++) {
            deck.deal(players.get(i).getHand(), handSize);
        }

        // turn one card face up
        discardPile = new Hand("Discards");
        deck.deal(discardPile, 1);

        // put the rest of the deck face down
        drawPile = new Hand("Draw pile");
        deck.dealAll(drawPile);

        // create the scanner we'll use to wait for the user
        in = new Scanner(System.in);
    }


    /**
     * Returns true if either hand is empty.
     */
    public boolean isDone() {
        boolean isDone = false;
        for(int i = 0; i < players.size(); i++) {
            if (players.get(i).getHand().empty()) {
                return !isDone;
            }
        }
        return isDone;
    }

    /**
     * Moves cards from the discard pile to the draw pile and shuffles.
     */
    public void reshuffle() {
        // save the top card
        Card prev = discardPile.popCard();

        // move the rest of the cards
        discardPile.dealAll(drawPile);

        // put the top card back
        discardPile.addCard(prev);

        // shuffle the draw pile
        drawPile.shuffle();
    }

    /**
     * Returns a card from the draw pile.
     */
    public Card draw() {
        if (drawPile.empty()) {
            reshuffle();
        }
        return drawPile.popCard();
    }

    /**
     * Switches players.
     */
    public Player nextPlayer(Player current) {
        int index = players.indexOf(current);
        if (index + 1 < players.size()) {
            return players.get(index + 1);
        } else {
            return players.get(0);
        }
    }
    /**
     * Displays the state of the game.
     */
    public void displayState() {
        for(int i = 0; i < players.size(); i++) {
            players.get(i).display();
        }
        discardPile.display();
        System.out.print("Draw pile: ");
        System.out.println(drawPile.size() + " cards");
    }

    /**
     * Waits for the user to press enter.
     */
    public void waitForUser() {
        in.nextLine();
    }

    /**
     * One player takes a turn.
     */    
    public void takeTurn(Player player) {
        Card prev = discardPile.last();
        Card next = player.play(this, prev);
        discardPile.addCard(next);

        System.out.println(player.getName() + " plays " + next);
        System.out.println();
    }

    /**
     * Plays the game.
     */
    public void play() {
        Player player = players.get(0);

        // keep playing until there's a winner
        while (!isDone()) {
            displayState();
            waitForUser();
            takeTurn(player);
            player = nextPlayer(player);
        }

        // display the final score
        for(int i = 0; i < players.size(); i++) {
            players.get(i).displayScore();
        }
    }

    /**
     * Plays the game n times and keeps track 
     * of how many times each player wins.
     */
    public static void playGames(int n) {
        Eights game = new Eights();
        int size = game.players.size();
        int[] wins = new int[size];
        for(int i = 1; i <= n; i++) {
            game = new Eights();
            game.play();
            for(int j = 0; j < size; j++) {
                if(game.players.get(j).score() == 0) {
                    wins[j]++;
                } 
            }
        }
        System.out.println(Arrays.toString(wins));
    }

    /**
     * Creates the game and runs it.
     */
    public static void main(String[] args) {
        Eights game = new Eights();
        game.play();

    }

}
