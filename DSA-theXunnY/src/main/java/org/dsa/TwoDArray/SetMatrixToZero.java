package org.dsa.TwoDArray;

import java.util.Arrays;

/**
 * given abd m*n integer matrix , if an element is 0 set the entire row and column to 0
 * you must do it in place
 *
 * Input: matrix = [[1,1,1],
 *                  [1,0,1],
                    [1,1,1]]
 * Output:         [[1,0,1],
 *                  [0,0,0],
 *                  [1,0,1]]*/
public class SetMatrixToZero {
    public static void main(String[] args) {
//        int[][] matrix = {
//                {1,1,1},
//                {1,0,1},
//                {1,1,1}
//        };
        int[][] matrix ={{0,1,2,0},
                         {3,4,5,2},
                         {1,3,1,5}};

//        int[][] matrix ={{0,1}};

        int r = matrix.length;
        int c = matrix[0].length;
        boolean[] rowZero = new boolean[r];
        boolean[] colZero = new boolean[c];


  for (int row=0; row< matrix.length; row++){
      for (int col=0; col<matrix[row].length; col++){
          if (matrix[row][col] == 0){
                rowZero[row] =true;
                colZero[col] =true;
          }

      }
  }

  for (int row=0; row< matrix.length; row++){
      for (int col=0; col<matrix[row].length ;  col++){
          if (rowZero[row] || colZero[col]){
              matrix[row][col] =0;
          }
      }
  }



       for (int row=0; row<matrix.length; row++){
           for (int col=0; col< matrix[row].length; col++){
               System.out.print(matrix[row][col] + " ");
           }
           System.out.println();
       }


    }
}
/**
 * Approach: Using auxiliary row and column markers
 *
 * Step 1: First Pass (Marking)
 * - Create two boolean arrays:
 *      rowZero[] of size = number of rows
 *      colZero[] of size = number of columns
 * - Traverse the entire matrix.
 * - Whenever matrix[row][col] == 0:
 *      → Mark rowZero[row] = true
 *      → Mark colZero[col] = true
 *
 * Step 2: Second Pass (Setting zeroes)
 * - Traverse the matrix again.
 * - For each element matrix[row][col]:
 *      → If rowZero[row] == true OR colZero[col] == true
 *      → Set matrix[row][col] = 0
 *
 * Why this works:
 * - In the first pass, we only "record" which rows/columns should be zeroed
 *   without modifying the matrix immediately.
 * - In the second pass, we update all affected elements in one go.
 *
 * Time Complexity: O(m * n)   (two full passes over the matrix)
 * Space Complexity: O(m + n) (extra boolean arrays for rows and columns)
 */
