import java.util.Random;
import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to Guess the Number game!");
        System.out.println("Try to guess a number between 1 and 100.");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = input.nextInt();
            
            if (guess < numberToGuess) {
                System.out.println("Try guessing a higher number.");
            } else if (guess > numberToGuess) {
                System.out.println("Try guessing a lower number.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the correct number: " + numberToGuess);
            }
        }
        input.close();
    }
}