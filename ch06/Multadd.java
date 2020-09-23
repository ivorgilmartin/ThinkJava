/**
 * Contains methods that use the "multadd" operation.
 * @author ivorgilmartin
 *
 */
public class Multadd {

    /**
     * Takes three parameters a, b, and c. Returns a * b + c
     * @param a - a value
     * @param b - a value
     * @param c - a value
     * @return the value of a * b + c
     */
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    /**
     * Uses "multAdd" to sum x multiplied by e to the power -x, plus the square
     * root of 1 minus e to the power -x 
     * @param x - a value
     * @return the value of the exponential expression 
     */
    public static double expSum(double x) {
        double a = x;
        double b = Math.exp(-x);
        double c = Math.sqrt(1 - b);
        return multadd(a,b,c);
    }

    public static void main(String[] args) {
        double multadd = multadd(1.0, 2.0, 3.0);
        System.out.println(multadd);

        double a = 1.0;
        double b = Math.sin(Math.PI/4);
        double c = Math.cos(Math.PI/4)/2;
        double result = multadd(a,b,c);
        System.out.println(result);

        b = Math.log(10);
        c = Math.log(20);
        System.out.println(multadd(a,b,c));

        System.out.println(expSum(90));
    }

}
