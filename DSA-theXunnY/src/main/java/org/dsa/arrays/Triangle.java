package org.dsa.arrays;

/***
 * 120. Triangle
 * Given a triangle array, return the minimum path sum from top to bottom.
 *
 * For each step, you may move to an adjacent number of the row below. More formally, if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.
 *
 *
 *
 * Example 1:
 *
 * Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
 * Output: 11
 * Explanation: The triangle looks like:
 *    2
 *   3 4
 *  6 5 7
 * 4 1 8 3
 * The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).
 * Example 2:
 *
 * Input: triangle = [[-10]]
 * Output: -10
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Triangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));
        System.out.println(minimumTotal(triangle));
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] nums = new int[n];

        //initialize our array with the last row of the triangle
        for (int i = 0; i < n; i++) {
            nums[i] = triangle.get(n - 1).get(i);
        }

        for (int row = n - 2; row >= 0; row--) {
            for (int col = 0; col <= row; col++) {
                nums[col] = triangle.get(row).get(col) + Math.min(nums[col], nums[col + 1]);
            }
        }

        return nums[0];
    }
}

    /**
     * High-level idea (what the algorithm does)
     *
     * We compute the minimum path sum bottom-up.
     *
     * Start from the last row (base case): the minimum sum to reach the bottom from each element of the last row is the element itself.
     *
     * Move one row up at a time. For each element in the current row, its minimum path sum = value + min(minSumOfLeftChild, minSumOfRightChild).
     *
     * Store those minimum sums into a single 1-D array (nums) so we reuse space and finally nums[0] contains the overall minimum.
     *
     * This converts a triangle of size n into O(n) space DP that runs in O(n^2) time.*/
