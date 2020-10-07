import java.math.BigInteger;

/**
 * BigInteger version of factorial method.
 * @author ivorgilmartin
 */
public class Big {

    /**
     * BigInteger version of factorial method.
     */
    public static BigInteger factorial(int n) {
        BigInteger answer = BigInteger.valueOf(1);
        if (n == 0 || n == 1)
            return answer;
        while (n > 1) {
            answer = answer.multiply(BigInteger.valueOf(n));
            n--;
        }
        return answer;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 30; i++) {
            System.out.println(i + "\t" + factorial(i));
        }
    }

}
