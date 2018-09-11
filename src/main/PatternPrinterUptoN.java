package main;

import java.util.Scanner;

public class PatternPrinterUptoN {

    public static void main(String[] args){
        System.out.println("Enter a number(Except 0): ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        for (int i=1; i<=n; i++)
            for(int j=1; j<=i; j++)
                System.out.printf("%d ",i);
        System.out.print("\n");
    }
}
