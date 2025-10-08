package org.dsa.recursion;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        System.out.print("Enter a number : " );
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = sumOfN(num);
        System.out.println("Sum of number till " + num+  " is : " + sum);
    }

    private static int sumOfN(int num) {
        if (num==1){
            return 1;
        }
        int sum = num + sumOfN(num-1);
        return sum;
    }
}
