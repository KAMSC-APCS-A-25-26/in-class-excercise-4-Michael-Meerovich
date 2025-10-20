import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // TODO: Prompt the user with a welcome message
        System.out.println ("Welcome to the Guessing Game!");
        // TODO: Generate a random secret number between 1 and 100 (inclusive)
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int num=rand.nextInt(100)+1, guess;
        System.out.println ("I'm thinking of a number between 1 and 100");
        // TODO: Use a do...while loop to read guesses until correct
        do
        {
            System.out.print ("Enter your guess: ");
            guess = sc.nextInt ();
            if (guess < num)
            {
                System.out.println ("Too low! Try again.");
            }
            else if (guess > num)
            {
                System.out.println ("Too high! Try again.");
            }
            else
            {
                System.out.println ("You got it!");
            }
        } while (guess != num);
        // TODO: Print "Too low" / "Too high" / "You got it!" accordingly
        // TODO: Use Scanner for input
    }
}
