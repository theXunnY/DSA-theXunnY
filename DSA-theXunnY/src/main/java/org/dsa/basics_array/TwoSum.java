package org.dsa.basics_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.*/
public class TwoSum {
    public static void main(String[] args) {
        /**
         * Input: nums = [2,7,11,15], target = 9
         * Output: [0,1]
         * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/

        int [] nums = {2,7,11,15};
        int target =9;

        int[] first = sumUsingHashMap(nums, target);
        System.out.println("Two sum using HashMap : " +Arrays.toString(first));

    }


    private static int[] sumUsingHashMap(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0 ;i<nums.length; i++){
            int prev = target - nums[i];
            if (map.containsKey(prev)){
                return new int[]{map.get(prev), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
