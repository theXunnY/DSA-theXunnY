package org.dsa.recursion.Classic;

public class PowerOfNumber {
    public static void main(String[] args) {
        int num=2 , pow =5;
//        int power = power(num, pow);
//        System.out.println(power);
    }

    private static int power(int num, int pow) {
        if (pow ==1) return 1;

        int poww = num * num;
        power(num, pow-1);
        return 0;
    }
}
