package org.dsa.basics_array;

import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 5, 1, 1};
        System.out.println("ORIGNAL ARRAY : " + Arrays.toString(arr));

        int[] next = find(arr);

        System.out.println("NEXT PERMUTATION : "+Arrays.toString(next));
    }

    private static int[] find(int[] arr) {
        //find the pivot
        int i= arr.length-2;
       while (i>=0 && arr[i] >= arr[i+1]){
           i--;
       }

       //find the value greater than the pivot index
        if(i>=0){
            int j = arr.length-1;
            while(j>=0 && arr[i] >= arr[j]){
                j--;
            }
            //swap the just greater value with the pivot index value
            int temp = arr[i];
            arr[i] =arr[j];
            arr[j] = temp;
        }

        //reverse the array after the pivot index
        int start=i+1;
        int end = arr.length-1;
        while (start<end){
            int temp = arr[start];
            arr[start] =arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    return arr;
    }
}
/***
 *  THIS PROBLEM CAN BE SOLVED IN JUST THREE STEPS
 *          1) FIND THE PIVOT INDEX WHERE I< I+1
 *          2) FIND THE VALUE JUST GREATER THAN THE PIVOT INDEX VALUE AND SWAP IT WITH THE PIVOT INDEX VALUE
 *          3) REVERSE THE ARRAY AFTER THE PIVOT
 */
