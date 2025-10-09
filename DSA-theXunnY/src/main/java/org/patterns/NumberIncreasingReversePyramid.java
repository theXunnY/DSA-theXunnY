package org.patterns;

/**
 *  1 2 3 4
 *  1 2 3
 *  1 2
 *  1
 *
 * */
public class NumberIncreasingReversePyramid {
    public static void main(String[] args) {
     int row=4;

     for (int i=0; i<row; i++){
         int n=1;
         for (int j=i; j<row; j++){
             System.out.print(n++ + " ");
         }
         System.out.println();
     }

    }
}
