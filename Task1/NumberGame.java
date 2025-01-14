import java.util.Random;
import java.util.Scanner;

class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int roundsWon = 0;  
  
        do {
            int num = r.nextInt(100); 
            int attemptsLeft = 10;  
            boolean isGuessed = false;  

            System.out.println("New round started!You need to guess a secret number");

            // Game loop for guessing the number
            while (attemptsLeft > 0 && !isGuessed) {
                System.out.print("Enter a number between 0-99: ");
                int n = sc.nextInt();
                String feedback = "";

                if (n == num) {
                    feedback = "Correct!";
                    isGuessed = true; 
                } else if (n > num) {
                    feedback = "Too High";
                } else {
                    feedback = "Too Low";
                }

                attemptsLeft--;  
                System.out.println(feedback);
                System.out.println("Attempts remaining: " + attemptsLeft);
            }

            
            if (isGuessed) {
                System.out.println("Congratulations, you've guessed the number");
                roundsWon++;  
            } else {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + num);
            }

            
            System.out.print("Do you want to play another round? (yes/no): ");
            sc.nextLine();  
            String playAgain = sc.nextLine();

            
            if (playAgain.equalsIgnoreCase("no")) {
                break;
            }

        } while (true);  
        System.out.println("Game over! You won " + roundsWon + " rounds.");
        sc.close();
    }
}