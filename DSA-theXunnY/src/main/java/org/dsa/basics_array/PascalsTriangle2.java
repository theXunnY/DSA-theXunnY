package org.dsa.basics_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 * */
public class PascalsTriangle2 {
    public static void main(String[] args) {

        System.out.print("Enter number if rows : ");
        Scanner sc= new Scanner(System.in);
        int rowNum = sc.nextInt();
        List<Integer> list = pascalsTriangle(rowNum);
        System.out.println("Ans : " + list);
        System.out.println("------------------------------");
        List<Integer> optimised = lastRowOfPascalTriangle(rowNum);
        System.out.println("Ans of second Way : "  + optimised);
    }

    private static List<Integer> lastRowOfPascalTriangle(int rowNum) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        for (int i=1; i<=rowNum; i++){
            for (int j=ans.size()-1; j>0; j--){
                int val = ans.get(j-1) + ans.get(j);
                ans.set(j, val);
            }
            ans.add(1);
        }
        return ans;
    }

    private static List<Integer> pascalsTriangle(int rowNum) {
        List<List<Integer>> ans= new ArrayList<>();

        for (int row=0; row<=rowNum; row++){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int col = 1; col<row; col++){
                int val = ans.get(row-1).get(col-1)+  ans.get(row-1).get(col);
                list.add(val);
            }
            if (row>0){
                list.add(1);
            }
            ans.add(list);
        }
        return ans.get(ans.size()-1);
    }
}
