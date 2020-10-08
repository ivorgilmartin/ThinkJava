import java.util.Arrays;
import java.util.Random;

/**
 * Solutions to chapter 8 exercises.
 * @author ivorgilmartin
 */
public class Ch08_Solutions {

    /**
     * 8.1.1 Returns a new array that contains the elements of a raised to power n.
     */
    public static double[] powArray(double[] a, double n) {
        double[] b = new double[a.length];
        for(int i = 0; i < a.length; i++) {
            b[i] = Math.pow(a[i], n);
        }
        return b;
    }

    /**
     * 8.1.2 Returns a histogram with given number of counters.
     */
    public static int[] histogram(int[] scores, int counters) {
        int[] count = new int[counters];
        for(int score : scores) {
            count[score]++;
        }
        return count;
    }

    /**
     * 8.4 Returns the index of the largest element in array.
     */
    public static int indexOfMax(int[] a) {
        int max = a[0];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
                index = i;
            }
        }
        return index;
    }

    /**
     * 8.5 Sieve of Eratosthenes
     */
    public static boolean[] sieve(int n) {
        boolean[] b = new boolean[n];
        for(int i = 0; i < n; i++) {
            b[i] = true;
        }
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = i;
        }
        for(int i = 2; i < Math.sqrt(n); i++) {
            for(int j = 2*i; j < n; j += i) {
                if(b[j] == true)b[j] = false;
            }
        }
        return b;
    }

    /**
     * 8.6 Checks if the numbers in the array are all factors of n.
     */
    public static boolean areFactors(int n, int[] a) {
        boolean areFactors = true;
        for(int i = 0; i < a.length; i++) {
            if(n % a[i] != 0) areFactors = false;
        }
        return areFactors;
    }

    /**
     * 8.7 Checks if the numbers in the array are all prime and their product is n.
     */
    public static boolean arePrimeFactors(int n, int[] a) {
        int product = product(a); // see product() below
        int max = maxVal(a);      // see maxVal() below
        boolean[] sieve = sieve(max + 1);
        if(product != n) return false;
        for(int element:a) {
            if(sieve[element] != true) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns maximum value in array.
     */
    public static int maxVal(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    /**
     * Reduces an int array to the product of its elements.
     */
    public static int product(int[] a) { // see Fruit.banana()
        int product = 1;	// accumulator
        int i = 0;		// index	
        while (i < a.length) {
            product = product * a[i];
            i++;
        }
        return product;
    }

    /**
     * 8.8.1 Recursive method that returns maximum value between two indices.
     */
    public static int maxInRange(int[] a, int lowIndex, int highIndex) {
        int max = a[lowIndex];
        if(lowIndex == highIndex) return max;
        while(lowIndex < highIndex) {
            if(max <= a[lowIndex + 1]) {
                max = a[lowIndex + 1];
                maxInRange(a, lowIndex + 1, highIndex);
            }else maxInRange(a, lowIndex + 1, highIndex);
            lowIndex++;
        }
        return max;
    }

    /**
     * Iterative method that returns maximum value between two indices.
     */
    public static int maxInRangeIterative(int[] a, int lowIndex, int highIndex) {
        int max = a[lowIndex];
        for (int i = lowIndex; i < highIndex + 1; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    } 

    /**
     * 8.8.2 Uses maxInRange to find and return the largest element.
     */
    public static int max(int[] a) {
        return maxInRange(a, 0, a.length - 1);
    }

    public static void main(String[] args) {
        Random random = new Random();
        int size = 10;    	
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(a));

        int lowIndex = a.length/2;
        int highIndex = a.length - 1;
        int rec = maxInRange(a, lowIndex, highIndex);
        System.out.println("maxInRange " + rec);
        int it = maxInRangeIterative(a, lowIndex, highIndex);
        System.out.println("maxInRangeIterative " + it);

        int maxVal = maxVal(a);
        System.out.println("maxVal " + maxVal);
        int max = max(a);
        System.out.println("max " + max);

    }


}
