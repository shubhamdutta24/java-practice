package main;

import java.util.Scanner;

public class VowelAndConsonantChecker {

    public static void main(String[] args){

        System.out.println("Enter a word: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        scanner.close();

        int length = word.length();
        char[] charArrayOfWord = word.toCharArray();

        for(int i=0; i<length; i++){
            /**/
            if(charArrayOfWord[i]=='a'||charArrayOfWord[i]=='e'||charArrayOfWord[i]=='i'||charArrayOfWord[i]=='o'||
                    charArrayOfWord[i]=='u'||charArrayOfWord[i]=='A'||charArrayOfWord[i]=='E'||charArrayOfWord[i]=='I'||
                    charArrayOfWord[i]=='O'||charArrayOfWord[i]=='U')
                System.out.print("Vowel ");
            else if(charArrayOfWord[i]>'A' && charArrayOfWord[i]<='Z' || charArrayOfWord[i]>'a' && charArrayOfWord[i]<='z')
                System.out.print("Consonant ");
            else
                System.out.print("Error!NotLetter ");
        }
    }
}
