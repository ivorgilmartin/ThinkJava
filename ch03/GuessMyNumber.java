import java.util.Random;
import java.util.Scanner;

/**
 * "Guess My Number" game.
 */
public class GuessMyNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number, guess, diff;
        Random random = new Random();

        // generate a random number between 1 and 100
        number = random.nextInt(100) + 1;
        // System.out.println(number);

        // prompt the user
        System.out.println(
                "I'm thinking of a number between 1 and 100\n" + "(including both). Can you guess what it is?");
        System.out.print("Type a number: ");

        // read input, compute and display difference
        guess = in.nextInt();
        diff = Math.abs(number - guess); // from Appendix C
        System.out.println("Your guess is: " + guess);
        System.out.println("The number I was thinking of is: " + number);
        System.out.println("You were off by: " + diff);

    }

}
