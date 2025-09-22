package org.dsa.string;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
 * non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        if (isPalindrome(s.toLowerCase())){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    private static boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()){
            if (Character.isAlphabetic(c) || Character.isDigit(c) ){
                sb.append(c);
            }
        }

        int start=0;
        int end=sb.length()-1;

        while (start<end){
            if (sb.charAt(start) != sb.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
