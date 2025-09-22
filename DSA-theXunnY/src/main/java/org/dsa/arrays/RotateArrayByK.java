package org.dsa.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

// * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.*/
public class RotateArrayByK {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6,7};
        int k=3;
        k=k% nums.length;

        rev(nums, 0, nums.length-1);
        rev(nums, 0, k-1);
        rev(nums, k, nums.length-1);
        System.out.println(Arrays.toString(nums));

    }


    public static void rev(int[] nums, int start, int end) {
        while (start<end){
            int temp = nums[start];
            nums[start]= nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}

/**
           STEPS TO ROTATE ARRAY BY K
           1) REVERSE THR  FULL ARRAY
           2) REVERSE ARRAY FROM 0 TO K-1
           3) REVERSE ARRAY FROM K T0 N(ARRAY LENGTH)
 */


