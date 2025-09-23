package org.dsa.string;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string s, find the length of the longest substring without duplicate characters.
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 */

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s ="aaabccabccbb";

        System.out.println(substring(s));
    }

    private static int substring(String s) {
        Set<Character> set = new HashSet<>();

        int start=0;
        int end=0;
        int bestStart=0;
        int max=0;
        for (; end<s.length(); end++){
            char c =s.charAt(end);
            while (set.contains(c)){
                set.remove(s.charAt(start++));
            }
            set.add(c);

            if (end-start+1 > max){
                max = end-start+1;
                bestStart=start;
            }
        }

        String ans = s.substring(bestStart, bestStart+max);
        System.out.println(ans);
        return ans.length();
    }
}
