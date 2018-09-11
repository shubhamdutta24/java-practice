package main;

import java.util.Scanner;

public class TomAndJerry {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if(number>20 && number<30){
            if(number%2==1){
                System.out.println("Tom");
            }else{
                System.out.println("Jerry");
            }
        }
    }

}
