package org.dsa.string;

import java.util.*;

/**
 * Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.
 *
 * If the fractional part is repeating, enclose the repeating part in parentheses.
 *
 * If multiple answers are possible, return any of them.
 *
 * It is guaranteed that the length of the answer string is less than 104 for all the given inputs.
 *
 *
 *
 * Example 1:
 * Input: numerator = 1, denominator = 2
 * Output: "0.5"
 *
 * Example 2:
 * Input: numerator = 2, denominator = 1
 * Output: "2"
 *
 * Example 3:
 * Input: numerator = 4, denominator = 333
 * Output: "0.(012)"*/
public class FractiontoRecurringDecimal {
    public static void main(String[] args) {

        System.out.println(" ----------------- " + fractionToDecimal(4,333));
    }
    public static String fractionToDecimal(int numerator, int denominator) {

        if (numerator ==0) return "0";

        StringBuilder sb = new StringBuilder();

        long num = (long) numerator;
        long den = (long) denominator;

        if (numerator*denominator <0){
            sb.append("-");
        }
        long digit = num /den;
        long rem = num % den;
        sb.append(digit);
        if (rem == 0){
            return sb.toString();
        }

        sb.append(".");
        Map<Long, Integer> set = new HashMap<>();

        while (rem != 0){

            if (set.containsKey(rem)){
                int index =set.get(rem);
                sb.insert(index, "(");
//                sb.append(rem);
                sb.append(")");
                break;
            }
            set.put(rem , sb.length());
            rem = rem*10;
            sb.append(rem/den);
            rem = rem%den;

        }

        return sb.toString();






    }
}
