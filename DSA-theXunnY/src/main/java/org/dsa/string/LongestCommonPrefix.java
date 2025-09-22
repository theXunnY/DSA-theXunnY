package org.dsa.string;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string ""
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings..*/
public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] str = {"dog","racecar","car"};

        String ans = longestCommonPrefix(str);
        System.out.println(ans);

    }

    private static String longestCommonPrefix(String[] str) {

        String common =str[0];

   for (int i=1; i< str.length; i++){
       while (!str[i].startsWith(common)){
           common = common.substring(0, common.length()-1);
           if (common.isEmpty()){
               return "";
           }
       }
   }
        return common;
    }
}
