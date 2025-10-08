package org.dsa.recursion;

public class CheckPalindrome {
    public static void main(String[] args) {
        String s = "raacecar";

        if (isPalindrome(s, 0, s.length()-1)){
            System.out.println("Yes string is palindrome");
        }else{
            System.out.println("No string is not palindrome");
        }
    }

    private static boolean isPalindrome(String s, int start, int end) {
        if (start>=end) return true;

        if (s.charAt(start) != s.charAt(end)) return false;

        return isPalindrome(s, start+1, end-1);
    }
}
