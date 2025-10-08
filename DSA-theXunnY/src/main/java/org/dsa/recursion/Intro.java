package org.dsa.recursion;

public class Intro {
    public static void main(String[] args) {
        //recursion means a function calling itself is known as recursion
            printNumber(5);
        int sum =  sumOfNNaturalNum(5);
        System.out.println("sum is : " + sum);
    }

    private static int sumOfNNaturalNum(int i) {
        if (i==1) return 1;     //base condition

        //body of the method
        int sum = i;

        sum = sum + sumOfNNaturalNum(i-1);      //recursive calls

        return sum;         //return values

    }

    private static void printNumber(int i) {
        if (i ==0){
            return;
        }
        printNumber(i-1);
        System.out.println(i);
    }
}
