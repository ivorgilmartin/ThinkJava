import java.util.Arrays;

/**
 * Card class modified for chapter 12 exercises.
 * Modifications have JavaDoc comments. 
 * @author ivorgilmartin
 */
public class Card {

    public static final String[] RANKS = {
            null, "Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"};

    public static final String[] SUITS = {
            "Clubs", "Diamonds", "Hearts", "Spades"};

    private final int rank;

    private final int suit;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String toString() {
        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }

    public int getSuit() {
        return this.suit;
    }

    /**
     * Returns a fully populated array of Cards. 
     */
    public static Card[] makeDeck() {
        Card[] cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards[index] = new Card(rank, suit);
                index++;
            }
        }
        return cards;
    }

    /**
     * Prints a given card array.
     */
    public static void printDeck(Card[] cards) {
        for (int i = 0; i < cards.length; i++) {
            System.out.println(cards[i]);
        }
    }

    /**
     * Ranks Aces higher than Kings.
     */
    public int compareTo(Card that) {
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        }
        if (this.rank == 1) { 
            return 1;
        }
        if (this.rank < that.rank) {
            return -1;
        }
        if (this.rank > that.rank) {
            return 1;
        }
        return 0;
    }

    /**
     * Returns a histogram of the suits in a Card array.
     */
    public static int[] suitHist(Card[] cards) {
        int[] hist = new int[4];
        for(Card card : cards) {
            hist[card.getSuit()]++;
        }
        return hist;
    }

    /**
     * Returns true if a given Card array contains a flush.
     */
    public static boolean hasFlush(Card[] cards) {
        for(int val : suitHist(cards)) {
            if( val > 4) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Card[] deck = makeDeck();

        System.out.println(deck[0]);
        System.out.println(deck[12]);
        System.out.println(deck[0].compareTo(deck[12]));

        System.out.println(Arrays.toString(suitHist(deck)));
        System.out.println(hasFlush(deck));

        Card[] hand = new Card[5];       
        for(int i = 0; i < 5; i++) {
            hand[i] = deck[i*12];
            System.out.println(hand[i]);
        }

        System.out.println(hasFlush(hand));

    }


}
