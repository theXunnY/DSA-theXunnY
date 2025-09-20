package org.dsa.basics_array;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 *  */
public class ContainsDuplicate {
    public static void main(String[] args) {
        /**
         * Input: nums = [1,2,3,1]
         * Output: true
         * Explanation: The element 1 occurs at the indices 0 and 3.*/

        int[] nums = {1,2,3,1};
        if (containsDuplicate(nums)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums){
            if (set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
