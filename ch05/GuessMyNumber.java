import java.util.Random;
import java.util.Scanner;

/**
 * "Guess My Number" game.
 */
public class GuessMyNumber {

    public static void start() {
        System.out.println(
                "I'm thinking of a number between 1 and 100\n" + "(including both). Can you guess what it is?");
    }

    public static void scanGuess(Scanner in, int answer) {
        System.out.print("Enter a number: ");

        int guess = in.nextInt();

        if (guess == answer) {
            System.out.println("correct");
            return;
        }

        if (guess > answer) {
            System.out.println("too high");
            scanGuess(in, answer);
        }

        if (guess < answer) {
            System.out.println("too low");
            scanGuess(in, answer);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int answer = random.nextInt(100) + 1;
        // System.out.println(answer);
        start();
        scanGuess(in, answer);
        
        in.close();
    }

}
