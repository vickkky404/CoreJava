import java.util.Random;
import java.util.Scanner;

public class GuessDGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String playAgain;


        do {
            int number = rand.nextInt(100) + 1;
            int guess;
            int attempts = 0;

            System.out.println("Welcome to Guess the Number!");
            System.out.println("I’ve picked a number between 1 and 100. Start guessing!");

            while (true) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("Correct! You got it in " + attempts + " attempts.");
                    break;  // Exit the guessing loop
                } else if (guess > number) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }
            }


            System.out.print("Play again? (yes/no): ");
            sc.nextLine();
            playAgain = sc.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing! Goodbye.");
        sc.close();
    }
}