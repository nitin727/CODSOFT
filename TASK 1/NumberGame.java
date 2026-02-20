import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        String playAgain;

        System.out.println("=== Number Guessing Game ===");

        do {
            int number = random.nextInt(100) + 1; // 1 to 100
            int attemptsLeft = 7;
            boolean guessed = false;

            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("You have " + attemptsLeft + " attempts.");

            while (attemptsLeft > 0) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("✅ Correct! You guessed the number.");
                    guessed = true;
                    totalScore += attemptsLeft * 10; // score logic
                    break;
                } 
                else if (guess < number) {
                    System.out.println("📉 Too low!");
                } 
                else {
                    System.out.println("📈 Too high!");
                }

                attemptsLeft--;
                System.out.println("Attempts left: " + attemptsLeft);
            }

            if (!guessed) {
                System.out.println("❌ You lost! Number was: " + number);
            } else {
                System.out.println("🏆 Round score added!");
            }

            System.out.println("Total Score: " + totalScore);

            System.out.print("\nPlay again? (yes/no): ");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("\nThanks for playing!");
        sc.close();
    }
}
