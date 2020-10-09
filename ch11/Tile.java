/**
 * A class that represents Scrabble tiles.
 * @author ivorgilmartin
 */
public class Tile {

    private char letter;
    private int value;

    /**
     * Constructs a Tile object with given values.
     */
    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    /**
     * Prints a tile in a simple format.
     */
    public static void printTile(Tile tile) {
        System.out.println(tile.letter + ": " + tile.value);
    }

    /**
     * Creates and displays a tile with the letter Z and the value 10.
     */
    public static void testTile() {
        Tile z = new Tile('z', 10);
        printTile(z);
    }

    /**
     * Returns a String representation of the tile.
     */
    public String toString() {
        return String.format(this.letter + ": %02d\n", this.value);
    }

    /**
     * Tests whether two tiles are equivalent.
     */
    public boolean equals(Tile that) {
        return this.letter == that.letter && this.value == that.value;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
