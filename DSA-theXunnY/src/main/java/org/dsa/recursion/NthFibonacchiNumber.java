package org.dsa.recursion;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class NthFibonacchiNumber {
    public static void main(String[] args) {
        System.out.println(fiboNUmbers(6));

    }

    private static int fiboNUmbers(int i) {

        if (i < 2){
            return i;
        }

        return fiboNUmbers(i-1) + fiboNUmbers(i-2);
    }
}
