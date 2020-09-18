import java.util.Scanner;

/**
 * Converts Celsius to Fahrenheit.
 */
public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		double c, f;
		Scanner in = new Scanner(System.in);
		
		// prompt the user and get the value
		System.out.print("Enter celsius: ");
		c = in.nextDouble();
		
		// calculate the result
		f = (c * 9.0/5.0) + 32.0;
		
		// format the output to one decimal place
		System.out.printf("%.1f C = %.1f F", c, f);
		
		in.close(); // prevent resource leak
		
	}

}
