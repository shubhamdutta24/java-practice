package main;

import java.util.Scanner;

public class CharacterType {
    /**
     * takes a character as input,
     * checks if it ia a smallcase letter, capital letter, a digit or a special character
     * */
    public static int checkCharType(char input){

       // Scanner scanner = new Scanner(System.in);
       // System.out.println("Enter a Character : ");
       // char input = scanner.next().charAt(0);
        //scanner.close();

        if(input >='a' && input <= 'z'){
            System.out.println("Small case Letter.");
            return 1;
        }
        else if(input >='A' && input <= 'Z'){
            System.out.println("Capital Letter.");
            return 2;
        }
        else if(input >='0' && input <= '9'){
            System.out.println("A Digit.");
            return 3;
        }
        else{
            System.out.println("Special Character.");
            return 4;
        }
    }
}
