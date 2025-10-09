package org.patterns;
/**
 *      1
 *      0 1
 *      1 0 1
 *      0 1 0 1
 *
 * */
public class ZeroOneTriangle {

    public static void main(String[] args) {
        int row=4;
        boolean one = true;
        for (int i=0; i<row; i++){
            if (i %2 != 0){
                one=false;
            }else{
                one = true;
            }
            for (int j=0; j<=i; j++){
                if (one){
                    System.out.print(1+" ");
                    one =!one;
                }else {
                    System.out.print(0 +" ");
                    one =!one;
                }
            }
            System.out.println();
        }
    }
}
