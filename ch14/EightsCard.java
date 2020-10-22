/**
 * Extends Card and provides match and scoreCard methods.
 * @author ivorgilmartin
 *
 */
public class EightsCard extends Card{

    /**
     * Constructs an EightsCard of the given rank and suit.
     */    
    public EightsCard(int rank, int suit) {
        super(rank, suit);
    }

    /**
     * Checks whether two cards match.
     */
    public boolean match(Card card) {
        if (this.getSuit() == card.getSuit()) {
            return true;
        }
        if (this.getRank() == card.getRank()) {
            return true;
        }
        if (this.getRank() == 8) {
            return true;
        }
        return false;
    }


    /**
     * Calculates the card's score (penalty points).
     */
    public int score() {
        int score = 0;
        int rank = getRank();
        if (rank == 8) {
            score -= 20;
        } else if (rank > 10) {
            score -= 10;
        } else {
            score -= rank;
        }
        return score;
    }    

    public static void main(String[] args) {
        EightsCard card = new EightsCard(8,0);
        Card other = new Card(1, 1);

        System.out.println(card);
        System.out.println(other);
        System.out.println(card.match(other));
    }

}
