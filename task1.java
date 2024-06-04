import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        boolean playAgain = true;
        int maxAttempts = 8;
        int totalRounds = 0;
        int totalAttempts = 0;
        
        System.out.println("----WELCOME TO THE GAME----");
        System.out.println(" -----GUESS THE NUMBER-----");

        while (playAgain) {
            int num = rand.nextInt(0,100);
            int attempts = 0;
            boolean correctGuess = false;

            System.out.println("You have a total of " + maxAttempts + " chances to guess the number.");

            while (attempts < maxAttempts && !correctGuess) {
                System.out.print("Enter your guess (0-100): ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == num) {
                    System.out.println("Congratulations!! You guessed it right...The number is " + guess );
                    correctGuess = true;
                } 
                else if (guess < num) {
                    System.out.println("Try something higher");
                } 
                else {
                    System.out.println("Try something lower");
                }
            }

            if (!correctGuess) {
                System.out.println("OOPS!! you ran out of attempts...The correct number was " + num );
            }

            totalRounds++;
            totalAttempts += attempts;
            
            System.out.print("Do you want to guess the number again??? (yes/no): ");
            playAgain = sc.next().equalsIgnoreCase("yes");
        }

        System.out.println("Total rounds played: " + totalRounds);
        System.out.println("Total attempts: " + totalAttempts);

        sc.close();
    }
}
