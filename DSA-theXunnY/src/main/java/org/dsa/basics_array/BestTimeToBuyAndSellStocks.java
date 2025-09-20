package org.dsa.basics_array;

/***
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.**/
public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        /**
         * Input: prices = [7,1,5,3,6,4]
         * Output: 5
         * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
         * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.*/

        int[] nums = {7, 1, 5, 3, 6, 4};
        int profit = bestTime(nums) ;
        System.out.println("the Max profit we can get is :"+ profit);
    }

    private static int bestTime(int[] nums) {
        int maxProfit =0;
        int buy=nums[0];

        int bestBuy=0;
        int bestSell =0;

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] < buy){
                buy = nums[i];
                bestBuy=i;
            }
            int sell=nums[i];
            int profit = sell - buy;

            if (maxProfit < profit){
                maxProfit=profit;

                bestSell =i;
            }
        }

        System.out.println("to get the max profit we need to buy at index : " + bestBuy);
        System.out.println("to get the max profit we need to sell at index : " + bestSell);
        return maxProfit;
    }

}
