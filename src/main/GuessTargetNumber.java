package main;

import java.util.Random;
import java.util.Scanner;

public class GuessTargetNumber {
    /**
     * A program that helps you guess a target random number by telling that the number entered by you is greater or smaller .
     * */

    public static void main(String[] args){

        Random random = new Random();
        int targetNumber = random.nextInt(100)+1;
        int guessedNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Try to guess target number (given: target number is between 1 to 100)");

        do{
            System.out.println("Enter number: ");
            guessedNumber = scanner.nextInt();
            if (guessedNumber > targetNumber)
                System.out.println("Number guessed is MORE than target number.");
            else if (guessedNumber < targetNumber)
                System.out.println("Number guessed is LESS than target number.");
            else if (guessedNumber == targetNumber)
                System.out.println("Number guessed is EQUAL to target number.");
            else
                System.out.println("Wrong Entry");
        }while (guessedNumber != targetNumber);

    }
}
