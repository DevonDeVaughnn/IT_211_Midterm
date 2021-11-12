package IT_211_Midterm;

import java.util.Random;
import java.util.Scanner;

public class GuessingMidterm {
    public static void main(String[] args) {

        Random random = new Random();
        int secretNum = random.nextInt(100);
        int userAttempts = 0;
        Scanner input = new Scanner(System.in);
        int attempt;
        boolean stop = false;

        while (!stop && userAttempts <= 10) {
            System.out.println("Can you guess what number, between 1 - 100, I am thinking of? ");
            attempt = input.nextInt();

            userAttempts++;
            if (attempt == secretNum) {
                stop = true;

                System.out.println("Wow good job! It only took you " + userAttempts + " tries.");
                if (userAttempts == 1) {
                    System.out.println("Wow FIRST TRY! Are you part computer?");
                    userAttempts = 0;

                }
                System.out.println(
                        "Would you like to play again champion? Enter Y to continue of any other key to stop.");
                char cont = input.next().charAt(0);
                if (cont == 'y' || cont == 'Y') {
                    stop = false;
                    userAttempts = 0;
                    secretNum = random.nextInt(100);
                } else {
                    stop = true;
                    System.out.println("Thank you for playing.");
                }

            } else if (attempt < secretNum) {
                System.out.println("Close but so far. Your guess is too low.");
            } else {
                System.out.println("Slow down there, Your guess is too high.");
            }
            if (userAttempts == 10) {
                System.out.println(
                        "Sorry you ran out of tries. Would you like to try again? Enter 'Y' to continue or any other key to exit.");
                String cont = input.next();
                if (cont.equals("y") || cont.equals("Y")) {
                    stop = false;
                    userAttempts = 0;
                    secretNum = random.nextInt(100);
                } else {
                    stop = true;
                }

            }
        }

    }
}