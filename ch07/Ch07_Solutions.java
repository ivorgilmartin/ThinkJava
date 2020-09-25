/**
 * Solutions to chapter 7 exercises.
 * @author ivorgilmartin
 *
 */
public class Ch07_Solutions {

    /**
     * 7.2 Returns an approximation of the square root of the parameter. 
     */
    public static double squareRoot(double a) {
        double answer = a / 2;
        double temp;
        do {
            temp = answer;
            answer = (temp + a / temp) / 2;
        } while (Math.abs(temp - answer) >= 0.0001);
        return answer;
    }


    /**
     * 7.3 Iterative version of method that raises x to the power n.
     */
    public static double power(double x, int n) {
        double answer = x;
        if(n == 0) return 1; // early return
        if(n == 1) return x;
        while(n > 1) {
            answer = answer*x;
            n--;
        }
        return answer;
    }


    /**
     * 7.4 Iterative version of factorial method. 
     */
    public static int factorial(int n) {
        int answer = 1;
        if (n == 0 || n == 1) return answer;
        while(n > 1) {
            answer = answer*(n);
            n--;
        }
        return answer;
    }

    /**
     * 7.5.1 Estimates  e^x using the infinite series expansion.
     */
    public static double myexp(double x, int n) {
        double answer = 0;
        double ith;
        int i = 0;
        while(i < n) {
            ith = Math.pow(x, i)/factorial(i);
            answer += ith;
            i++;
        }
        return answer;
    }

    /**
     * 7.5.2 More efficient version of myexp method.
     */
    public static double efficient(double x, int n) {
        double answer = 1;
        double nth = 1;
        int i = 1;
        while(i < n) {
            nth = nth*(x/i);
            answer += nth;
            i++;
        }
        return answer;
    }

    /**
     * 7.5.3 Takes a parameter, x, and displays x, myexp(x), and Math.exp(x).
     */
    public static void check(double x, int n) {
        //System.out.println(x + "\t" + myexp(x, n) + "\t" + Math.exp(x));
        System.out.println(x + "\t" + efficient(x, n) + "\t" + Math.exp(x));
    }

    /**
     * 7.6 Evaluates exp(-x^2) using the infinite series expansion.
     */
    public static double gauss(double x, int n) {
        double answer = 1;
        double num = 1; // numerator
        double den = 1; // denominator
        int i = 1;
        while(i < n) {
            num = num*(x*x);
            den = -den*(2*i - i);
            answer += num/den;
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(squareRoot(16.0));
        System.out.println(power(2.0, 3));
        System.out.println(factorial(3));
        check(1.0, 5);

        double i = 0.1;
        while(i <= 100.0) {
            check(i, 5);
            i *=  10;
        }

        i = -0.1;
        while(i >= -100.0) {
            check(i, 5);
            i *=  10;
        }

        double x = -10;
        int n = 5;
        System.out.println(gauss(x, n));	
    }



}
