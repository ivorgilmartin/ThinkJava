/**
 * Encapsulate previous code in a method that takes parameters.
 */
public class Date {
	
	public static void printEuropean(String day, int date, String month, int year) {
		System.out.println(day + " " + date + " " + month + " " + year);
	}
	
	public static void printAmerican(String day, String month, int date,  int year) {
		System.out.println(day + ", " + month + " " + date +", " + year);
	}
	
	public static void main(String[] args) {		
		String day, month;
		int date, year;
		
		day = "Tuesday";
		date = 17;
		month = "July";
		year = 2020;
		
		printEuropean(day, date, month, year);
		printAmerican(day, month, date, year);
		
		
	}

}
