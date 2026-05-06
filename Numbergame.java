import java.util.Scanner;
import java.util.Random;

class Numbergame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int totalScore = 0;
        String playAgain;

        do {
            int number = rand.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 5;
            boolean guessedCorrectly = false;

            System.out.println("\nGuess the number (1-100)");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess > number) {
                    System.out.println("Too high.");
                } 
                else if (guess < number) {
                    System.out.println("Too low.");
                } 
                else {
                    System.out.println("Correct!");
                    guessedCorrectly = true;
                    totalScore += (maxAttempts - attempts + 1);
                    break;
                }
            }

            if (!guessedCorrectly) {
                System.out.println("You lost! Number was: " + number);
            }

            System.out.println("Score: " + totalScore);

            System.out.print("Play again? (yes/no): ");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Final Score: " + totalScore);
        sc.close();
    }
}
