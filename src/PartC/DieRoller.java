package PartC;
import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        System.out.println("Welcome to your first round of this dice rolling game!");
        boolean done = false;
        boolean validInput = false;
        boolean triple = false;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int roll = 1;
        System.out.println("Roll        Die1        Die2        Die3        Sum");
        System.out.println("---------------------------------------------------");
        do {
            validInput = false;
            do {

                int die1 = rand.nextInt(6) + 1;
                int die2 = rand.nextInt(6) + 1;
                int die3 = rand.nextInt(6) + 1;
                int sum = die1 + die2 + die3;
                System.out.printf("%d           %d           %d           %d           %d", roll, die1, die2, die3, sum);
                System.out.print("\n");
                roll++;
                triple = (die1 == die2 && die2 == die3);
            } while (!triple);

            System.out.println("Do you want to play again? Enter \"y\" for yes and \"n\" for no");
            do {
                String userInput = input.nextLine();
                if (userInput.equals("y")) {
                    validInput = true;
                }
                else if (userInput.equals("n")) {
                    done = true;
                    validInput = true;
                }
                else {
                    System.out.println("Invalid input of " + userInput + ". Please try again.");
                }
            } while (!validInput);
        } while (!done);
    }
}
