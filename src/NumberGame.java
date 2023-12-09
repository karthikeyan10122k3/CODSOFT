import java.util.Random;
import java.util.Scanner;
import static java.lang.Math.abs;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter no of Attempts : ");
        int totalAttempts = sc.nextInt();
        sc.nextLine();

        String choice ;
        boolean guessed = false;

        do {
            int randomNumber = random.nextInt(100);

            for (int attempt = 1; attempt <= totalAttempts; attempt++) {

                System.out.print("Enter a Number (1 to 100) attempt " + attempt + " : ");
                int userInput = sc.nextInt();
                sc.nextLine();

                if (userInput == randomNumber) {
                    System.out.println("Congratulations!, You Won!");
                    System.out.println("Your Score: " + ((double) (totalAttempts - attempt) / totalAttempts) * 100 + "% \n");
                    guessed = true;
                    break;
                }
                else if (userInput < randomNumber) {
                    if (abs(userInput - randomNumber) < 30) {
                        System.out.println(" Low!");
                    } else if (abs(userInput - randomNumber) > 30) {
                        System.out.println("Too Low!");
                    }
                } else {
                    if (abs(userInput - randomNumber) < 30) {
                        System.out.println(" High!");
                    } else if (abs(userInput - randomNumber) > 30) {
                        System.out.println("Too High!");
                    }
                }
            }
                if (!guessed){
                    System.out.println("Sorry, you lost. Your Score : 0%" );
                    System.out.println("The correct number was: " + randomNumber +"\n");
                }

                System.out.println("Do you want to play again? (Yes or No)");
                choice = sc.nextLine();

        } while (choice.equals("Yes"));

        System.out.println("Bye!, Thank you for Playing!");
    }
}
