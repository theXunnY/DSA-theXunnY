package org.patterns;

/**
 *      |       1
 *      |     2 1 2
 *      |   3 2 1 2 3
 *      | 4 3 2 1 2 3 4
 *
 * */
public class PalindromeTriangle {
    public static void main(String[] args) {

        int row=4;

        for (int i=0; i<row; i++){
            int n=row+1;
            for (int space= row-i; space>0; space--){
                System.out.print("  ");
                n--;
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print(" " +n-- );
            }
            int left=2;
            for (int k=n; k<=i-1; k++ ){

                System.out.print(" " + left++ );
            }
            System.out.println();
        }
    }
}
