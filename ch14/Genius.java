import java.util.ArrayList;

/**
 * Extends Player and overrides the play method.
 * @author ivorgilmartin
 */
public class Genius extends Player{
    private Hand hand;

    /**
     * Constructs a Genius player with an empty hand.
     */
    public Genius(String name) {
        super(name);
        this.hand = new Hand(name);
    }

    /**
     * Plays an eight first, then highest,
     * or else draws.
     */
    public Card play(Eights eights, Card prev) {
        Card card = searchForEight();
        if(card != null) {
            return card;
        }
        rankSort();
        card = searchForMatch(prev);
        if (card == null) {
            card = drawForMatch(eights, prev);
        }
        return card;
    }

    /**
     * Sorts the cards by rank descending.
     */
    public void rankSort() {
        Hand hand = getHand();
        Hand ranked = new Hand("Ranked");
        for(int i = 13; i > 0; i--) {
            for(int j = 0; j < hand.size(); j++) {
                if(hand.getCard(j).getRank() == i) {
                    ranked.addCard(hand.getCard(j));
                }
            }
        }
        for(int k = 0; k < ranked.size(); k++) {
            Card temp = ranked.getCard(k);
            hand.addCard(temp);
            hand.popCard(0);
        }
    }

    /**
     * Returns an eight or null.
     */
    public Card searchForEight() {
        for (int i = 0; i < hand.size(); i++) {
            Card card = hand.getCard(i);
            if (card.getRank() == 8) {
                return hand.popCard(i);
            }
        }
        return null;
    }

    /**
     * Sorts the cards in descending order
     * (in place) using selection sort.
     */
    public void sort() {
        // find the highest card at or to the right of i
        // swap the ith card and the highest card found
        Hand hand = getHand();
        for(int i = 0; i < hand.size(); i++) {
            int index = indexHighest(i + 1, hand.size());
            hand.swapCards(i, index);
        }
    }

    /**
     * Finds the index of the lowest card
     * between low and high inclusive.
     */
    public int indexLowest(int low, int high) {
        Hand hand = getHand();
        int index = low - 1;
        for(int i = low ; i < high; i++) {
            if(hand.getCard(index).compareTo(hand.getCard(i)) == 1) {
                index = i;
            }
        }
        return index;
    }

    /**
     * Finds the index of the highest card
     * between low and high inclusive.
     */
    public int indexHighest(int low, int high) {// works! leave it alone!
        Hand hand = getHand();
        int index = low - 1;
        for(int i = low; i < high; i++) {
            if(hand.getCard(index).compareTo(hand.getCard(i)) == -1) {
                index = i;
            }
        }
        return index;
    }





}
