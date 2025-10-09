package org.patterns;
/**
 *      * * * * *
 *      *       *
 *      *       *
 *      *       *
 *      * * * * *
 *
 *          =5*5
 * */
public class SquareHollow {
    public static void main(String[] args) {
        int row =5;
        int col= 5;

        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if (i==0 || i==4){
                    System.out.print("* ");
                }else{
                    if (j==0 || j==4){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }

    }
}
