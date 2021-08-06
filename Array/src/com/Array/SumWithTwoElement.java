package com.Array;

import java.util.Arrays;
//Given an array of integers, return pair of numbers such that they add up to a specific target
//since array[0]+ array[1]= 2 + 7 = 9, return {2,7} 
public class SumWithTwoElement {
	
	public int[] sumOfTwoValues(int[] arr, int target) {// interview questions
        // Sorting and Two Pointer
        Arrays.sort(arr); // 0 2 6 7 10 11, A Java program to sort an array of integers in ascending order.
        int left = 0;
        int right = arr.length - 1;
        int[] result = new int[2];
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                result[0] = arr[left];
                result[1] = arr[right];
                return result;
            } else if(sum < target){
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }
	public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

	public static void main(String[] args) {
		SumWithTwoElement sum= new SumWithTwoElement();
		int a[]= {11, 2, 0, 10, 7, 6};
		sum.sumOfTwoValues(a, 9);
		sum.printArray(sum.sumOfTwoValues(a, 9));
	}
}
