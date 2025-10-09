package org.patterns;

/**
 *      1
 *      1 2
 *      1 2 3
 *      1 2 3 4
 *
 * */

public class NumberIncreasingPyramid {
    public static void main(String[] args) {
        int row =4;
        int n=1;
        for (int i=0; i<row; i++){
            for (int j=0; j<=i; j++){
                System.out.print(n+ " ");
            }
            System.out.println();
            n++;
        }
    }
}
