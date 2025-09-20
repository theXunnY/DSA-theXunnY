package org.dsa.basics_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it
 *
 * Example 1:
 *
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * Example 2:
 *
 * Input: numRows = 1
 * Output: [[1]]*/
public class PascalsTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows want in pascals triangle");
        int rowNum=sc.nextInt();

        List<List<Integer>> triangle = pascalsTriangle(rowNum);


//PRINTING THE PASCALS TRIANGLE
        for (int row = 0; row <triangle.size() ; row++) {
            for (int space =triangle.size()-row; space>=0; space--){
                System.out.print(" ");
            }
            for (int num=0; num<triangle.get(row).size(); num++){
                System.out.print(triangle.get(row).get(num ) + " ");
            }
            System.out.println();
        }

    }

    private static List<List<Integer>> pascalsTriangle(int row) {
        List<List<Integer>> ans= new ArrayList<>();

        for (int i = 0; i <row ; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int j=1; j<i; j++ ){
                int val = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                list.add(val);
            }
            if (i>0){
                list.add(1);
            }
            ans.add(list);
        }
        return ans;
    }
}
