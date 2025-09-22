package org.dsa.string;
/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * anagrams =  same character order may be different*/
public class ValidAnagrams {
    public static void main(String[] args) {
        String s ="anagram", t="nagaram";

        if (isAnagram(s, t)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        int [] freq = new int[26];

        for (char c : s.toCharArray()){
            freq[c-'a']++;
        }
        for (char c : t.toCharArray()){
            freq[c-'a']--;
        }

        for (int i : freq){
            if (i != 0){
                return false;
            }
        }

        return true;

    }

}
