/**
 * Checks to see if Fermat's theorem holds.
 */
public class Fermat {

    public static void checkFermat(int a, int b, int c, int n) {
        if (n > 2 && Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn't work.");
        }
    }

    public static void main(String[] args) {
        checkFermat(1, 2, 3, 3);
    }

}
