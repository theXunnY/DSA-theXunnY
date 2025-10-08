package org.dsa.recursion;

import java.util.Scanner;

public class FactorialOfN {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = factorial(num);

        System.out.println("The factorial of number "+num+ " is : " + fact);
    }

    private static int factorial(int num) {
        if (num ==1){
            return 1;
        }

        int fact = num * factorial(num-1);
        return fact;
    }
}
