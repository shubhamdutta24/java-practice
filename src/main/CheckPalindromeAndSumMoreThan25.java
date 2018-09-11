package main;

import java.util.Scanner;

public class CheckPalindromeAndSumMoreThan25 {

//    public static void main(String[] args){
//        /**
//         * This functions checks if the entered integer is palindrome or not.
//         * If true it tells weather the sum of the even digits in it is more than 25 or less.
//         * */
//
//        checkPalindromeAndSumOfEvenNumbers();
//
//    }

    public boolean checkPalindromeAndSumOfEvenNumbers (int input){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        long number = scanner.nextLong();
//        scanner.close();

        boolean check = isPalindrome(input);

        if(!check){
            System.out.printf("%d is not palindrome\n",input);
            return false;
        }else{
            int sum = sumEven(input);
            if (sum>25){
                System.out.printf("%d is palindrome and the sum of even numbers is greater than 25\n",input);
                return true;
            }else{
                System.out.printf("%d is palindrome and sum of even numbers is less than 25\n",input);
                return true;
            }
        }

    }

    public static boolean isPalindrome(long number) {
        /**
         * Returns boolian value TRUE if the entered number is palindrome, and FALSE if it is not.
         */
        boolean isPalindrome = false;
        long image = number;
        long reverseImage = 0;
        while(image>0){
            reverseImage = reverseImage*10 + image%10;
            image = image/10;
        }
        if (reverseImage==number)
            isPalindrome = true;
        return isPalindrome;
    }
    public static int sumEven(long number){
        /**
         * Returns the sum of all the even digits present in the entered integer.
         * */
        int sumOfEven=0;
        while (number>0){
            sumOfEven = sumOfEven + (int)number%10;
            number = number/10;
        }
        return sumOfEven;
    }
}
