import java.util.Scanner;

/**
 * Converts seconds to hours, minutes, and seconds.
*/

public class SecondConverter {
	
	public static void main(String[] args) {
		int input, temp, hours, minutes, seconds;
		final int SEC_PER_HR = 3600;
		final int SEC_PER_MIN = 60;
		Scanner in = new Scanner(System.in);
		
		// prompt the user for input
		System.out.print("Enter seconds: ");
		
		// read an integer from the keyboard 
		input = in.nextInt();
		
		// calculate the result
		hours = input / SEC_PER_HR;
		temp = input % SEC_PER_HR;
		minutes = temp / SEC_PER_MIN;
		seconds = input % SEC_PER_MIN;
		
		// display the output
		System.out.printf
		("%d seconds = %d hours, %d minutes, and %d seconds \n",
				input, hours, minutes, seconds);
		
		in.close();
	}

}
