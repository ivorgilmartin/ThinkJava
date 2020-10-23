/**
 * Contains methods that return values.
 *  @author ivorgilmartin
 */
public class ValueMethods {

    /**
     * Returns a value of type double.
     */
    public static double valueMethod() {
        double value = 0.0;
        return value;
    }

    /**
     * Tests whether n is divisible by m.
     * @param n - number to be divided
     * @param m - dividing number
     * @return true if divisible, false otherwise
     */
    public static boolean isDivisible(int n, int m) {
        return n % m == 0;
    }

    /**
     * Determines whether a triangle can be formed with sides a, b and c.
     * @param a - length of side a
     * @param b - length of side b
     * @param c - length of side c
     * @return true if a triangle can be formed, false otherwise
     */
    public static boolean isTriangle(int a, int b, int c) {
        if (a > b + c)
            return false;
        if (b > a + c)
            return false;
        if (c > a + b)
            return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(valueMethod());
        System.out.println(isDivisible(4, 1));
        System.out.println(isTriangle(1, 2, 3));
    }

}
