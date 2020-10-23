/**
 * Contains recursive methods.
 * @author ivorgilmartin
 *
 */
public class RecursiveMethods {

    /**
     * Finds product of integers from  m to n.
     * @param m - lower integer 
     * @param n - upper integer
     * @return integer product
     */
    public static int prod(int m, int n) {
        if (m == n) {
            return n;
        } else {
            return n*prod(m, n - 1);
        }
    }

    /**
     * Returns the sum of odd integers from 1 to n.
     * @param n - a positive odd integer
     * @return integer sum
     */
    public static int oddSum(int n) {
        if(n % 2 == 0 || n < 0) return -1;
        if(n == 1)return n;
        else {
            return n + oddSum(n - 2);
        }
    }

    /**
     * Implements the Ackermann function.
     * @param m - non negative integer
     * @param n - non negative integer
     * @return the value of the function
     */
    public static int ack(int m, int n) {
        if(m < 0 || n < 0) return 0;
        if(m == 0) return n + 1;
        if(m > 0 && n == 0) return ack(m - 1, 1);
        if(m > 0 && n > 0) return ack(m - 1, ack(m, n - 1));
        else return 0;
    }

    /**
     * Raises x to the power n.
     * @param x - a value
     * @param n - exponent
     * @return the value of x to the power n
     */
    public static double power(double x, int n) {
        if(n == 0) return 1;
        if(n == 1) return x;
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(prod(1, 4));
        System.out.println(power(2,2));
        System.out.println(ack(3, 1));
        System.out.println(oddSum(5));
    }
}