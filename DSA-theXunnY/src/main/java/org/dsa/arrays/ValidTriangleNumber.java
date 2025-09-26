package org.dsa.arrays;

import java.util.Arrays;

/**
 * You are given an integer array nums. Your task is to find how many combinations of three numbers from this array can form a valid triangle.
 *
 * For three sides to form a valid triangle, they must satisfy the triangle inequality theorem: the sum of any two sides must be greater than the third side. Specifically, if we have three sides a, b, and c, they can form a triangle if and only if:
 *
 * a + b > c
 * a + c > b
 * b + c > a
 * You need to count all possible triplets (groups of three numbers) from the array that satisfy this condition. The same element at different positions can be part of different triplets, but you cannot use the same array element multiple times within a single triplet.
 *
 * For example, if nums = [2, 2, 3, 4], the valid triplets that can form triangles are:
 *
 * (2, 3, 4) at indices (0, 2, 3)
 * (2, 3, 4) at indices (1, 2, 3)
 * (2, 2, 3) at indices (0, 1, 2)
 * So the answer would be 3.*/

public class ValidTriangleNumber {
    public static void main(String[] args) {
        int[] nums = {4,2,3,4};
          //          2 3 4 4
/***                  2+3>4
 *                    2+4>4
 *                    3+2>4
 *                    3+4>4
 *                    4+4>2
 *                    4+4>3
    */

        int ans = count(nums);
        System.out.println(ans);
    }


    private static int count(int[] nums) {
        Arrays.sort(nums);

        int arrayLength = nums.length;
        int triangleCount = 0;

        // Fix the largest side and find valid pairs for the other two sides
        for (int largestIndex = arrayLength - 1; largestIndex >= 2; largestIndex--) {
            int left = 0;
            int right = largestIndex - 1;

            // Use two pointers to find all valid pairs
            while (left < right) {
                // Check if current pair forms a valid triangle with the largest side
                if (nums[left] + nums[right] > nums[largestIndex]) {
                    // All elements between left and right form valid triangles
                    // because array is sorted and nums[left+1...right] are all greater than nums[left]
                    triangleCount += right - left;
                    right--;
                } else {
                    // Sum is too small, need a larger value
                    left++;
                }
            }
        }

        return triangleCount;
    }
}
