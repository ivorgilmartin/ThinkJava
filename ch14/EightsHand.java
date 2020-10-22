/**
 * Extends Hand and provides scoreHand method.
 * @author ivorgilmartin
 */
public class EightsHand extends Hand{
    /**
     * Constructs an empty Eights hand.
     */    
    public EightsHand(String label) {
        super(label);
    }

    /**
     * Calculates the hands' score (penalty points).
     */
    public int scoreHand() {
        int sum = 0;
        for (int i = 0; i < size(); i++) {
            Card card = getCard(i);
            int rank = card.getRank();
            if (rank == 8) {
                sum -= 20;
            } else if (rank > 10) {
                sum -= 10;
            } else {
                sum -= rank;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        EightsHand hand = new EightsHand("EightsHand");
        Deck deck = new Deck("deck");
        deck.shuffle();

        deck.deal(hand, 5);
        hand.display();
        System.out.println("size: " + hand.size());
        System.out.println("score: " + hand.scoreHand());
    }

}
