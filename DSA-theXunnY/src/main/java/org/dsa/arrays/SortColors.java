package org.dsa.arrays;

import java.util.Arrays;

/** Leetcode 75
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 *
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 *
 * You must solve this problem without using the library's sort function.*/
public class SortColors {

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
//        mergeSort(nums);
        douchNotation(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void douchNotation(int[] nums) {
        int s=0, m=0, e=nums.length-1;


        while (m<=e){
            if (nums[m]==0){
            swap(nums, s, m);
            s++;
            m++;
            } else if (nums[m] ==1) {
                m++;
            }else{
                swap(nums, m, e);
                e--;
                m++;
            }

        }
    }
    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    private static void mergeSort(int[] nums) {
       if (nums.length <=1){
           return;
       }

       int m = nums.length/2;

       int[] first = Arrays.copyOfRange(nums, 0, m);
       int[] second = Arrays.copyOfRange(nums, m, nums.length);

       mergeSort(first);
       mergeSort(second);

       merge(nums, first,second);
    }

    private static void merge(int[] nums, int[] first, int[] second) {
        int f=0, s=0, m=0;

        while (f< first.length && s<second.length){
            if (first[f] < second[s]){
                nums[m++] = first[f++];
            }else {
                nums[m++] =second[s++];
            }
        }

        while (f<first.length){
            nums[m++] =first[f++];
        }
        while (s<second.length){
            nums[m++] = second[s++];
        }
    }
}
/*
           SORT 1, 2,AND 0'S
           IN THIS PROBLEM WE CAN SOLVE IT USING MULTIPLE SOLUTIONS
           BUT WE WILL BE USING MERGE SORT AND DUTCH NOTATION FLAG



           1) MERGE SORT-
           A CLASSIC DIVIDE AND CONQUER METHOD HERE WE DIVIDE THE ARRAY INTO SMALLER CHUNKS

           2) DUTCH NOTATION FLAG -
               -VERY EASY AS COMPARE TO MERGE SORT
               -SUPPOSE WE HAVE A ARRAY ONLY CONSISTING OF ,0,1 AND 2's WE NEED TO SORT THIS ARRAY
               - WHAT WE CAN DO
                   -1) take a pointer as start=0 (for 0 ), mid=0 (for 1), end=arr.len-1 (for 2);
                   -2) take a while loop and run till the m<end
                   -3) check if arr[mid]==0; if yes swap it with the arr[start] and increase the start & mid
                   -4) check if arr[mid[==2 if yes swap it with the arr[end] and decrease end and increase start;
                   -5) if none of the above is true then increase the mid that means at mid there is 1
  */
