package org.dsa.arrays;
/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining.
 *
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
 * Example 2:
 *
 * Input: height = [4,2,0,3,2,5]
 * Output: 9
 * */
public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height ={0,1,0,2,1,0,1,3,2,1,2,1};
        int n = height.length;

        int[] left= new int[n];
        int[] right= new int[n];
        int leftMax=0;
        int rightMax=0;

        for (int i = 0; i <n ; i++) {
            rightMax = Math.max(rightMax, height[n-i-1]);
            leftMax = Math.max(leftMax, height[i]);
            left[i] =leftMax;
            right[n-i-1] = rightMax;
        }

        int ans=0;

        for (int i = 0; i <n ; i++) {
            int val = Math.min(left[i], right[i]) - height[i];
            ans +=val;
        }
        System.out.println(ans);
    }
}
