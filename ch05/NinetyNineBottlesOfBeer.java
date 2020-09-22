/**
 * Displays the entire lyrics of "99 Bottles of Beer".
 */
public class NinetyNineBottlesOfBeer {

    public static void lastVerse() {
        System.out.println("No bottles of beer on the wall,\n" + "no bottles of beer,\n"
                + "ya' can't take one down, ya' can't pass it around,\n"
                + "'cause there are no more bottles of beer on the wall!");
    }

    public static void verses(int n) {
        if (n > 0) {
            System.out.println(n + " bottles of beer on the wall,\n" + n + " bottles of beer,\n"
                    + "ya' take one down, ya' pass it around,\n" + (n - 1) + " bottles of beer on the wall!");
            System.out.println();
            verses(n - 1);
        }
    }

    public static void song(int n) {
        verses(n);
        lastVerse();
    }

    public static void main(String[] args) {
        song(99);
    }

}
