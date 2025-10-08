package org.dsa.binarySearch;

import java.util.Arrays;

/**
 * You're given:
 *
 * An array of spells, where each element is a power of a spell.
 * An array of potions, where each element is a strength of a potion.
 * A success threshold (a long integer).
 *
 * Your goal:
 * For each spell, count how many potions can combine with it (i.e., spell * potion ≥ success).*/
public class SuccessfulPairsofSpellsandPotions {

    public static void main(String[] args) {
       int[] spells ={5};
       int[] potions={1,2};
        int success =20;
        int[] ans = successfulPairs(spells, potions, success);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
       Arrays.sort(potions);
       System.out.println(Arrays.toString(potions));
       int n = spells.length;
       int m = potions.length;

       int[] ans = new int[n];

       for (int i=0; i<n; i++){
           long pair = (success + spells[i] -1) / spells[i];
           int index = binarySearch(potions, pair);
           if (index != -1){
               int pairs = potions.length-index;
               ans[i] = pairs;
           }else{
               ans[i] =0;
           }
       }
    return ans;

    }
    public static int binarySearch(int[] potions, long target){
        int start =0, end = potions.length-1;
        int ans =-1;
        while (start <= end){
            int mid = start + (end-start)/2;

            if (potions[mid] >= target ){
                ans = mid;
                end=mid-1;
            }else {
                start =mid+1;
            }

        }
        return ans;
    }
}

