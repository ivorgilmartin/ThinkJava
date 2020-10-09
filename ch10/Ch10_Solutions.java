import java.math.BigInteger;

/**
 * Solutions to chapter 10 exercises.
 * @author ivorgilmartin
 */
public class Ch10_Solutions {

    /**
     * BigInteger version of pow method.
     */
    public static BigInteger pow(int x, int n) {
        if (n == 0)
            return BigInteger.valueOf(1);
        // find x to the n/2 recursively
        BigInteger t = pow(x, n / 2);
        // if n is even, the result is t squared
        // if n is odd, the result is t squared times x
        if (n % 2 == 0) {
            return t.multiply(t);
        } else {
            return t.multiply(t).multiply(BigInteger.valueOf(x));
        }

    }

    public static void main(String[] args) {
        int x = 10;
        int n = 100;
        System.out.println(pow(x, n));
    }

}
