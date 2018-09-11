package main;

import java.util.Scanner;

public class StringAppendSuffix {

    public static void main(String[] args){

        System.out.println("Enter the String and the integer: ");

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        int nLastCharacter = scanner.nextInt();

        int stringLength = inputString.length();
        String suffix = inputString.substring(stringLength-nLastCharacter);
        for (int i=1; i <= nLastCharacter; i++){
            inputString = inputString + suffix;
        }

        System.out.println(inputString);
    }
}
