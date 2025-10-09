package org.patterns;
/**
 *           1
 *          2 2
 *         3 3 3
 *        4 4 4 4
 *
 * */
public class NumberTriangle {
    public static void main(String[] args) {
            int row=4, col=4;
            int n=1;
            for (int i=0; i<row; i++){

                for (int space=row-i; space>0; space--){
                    System.out.print(" ");
                }
                for (int num=0; num<=i; num++){
                    System.out.print(n +" ");
                }
                System.out.println();
                n++;
            }
    }
}
