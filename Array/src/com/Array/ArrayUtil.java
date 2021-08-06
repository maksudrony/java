package com.Array;



	import java.util.Arrays;
	import java.util.HashMap;
	import java.util.Map;


	public class ArrayUtil {
		public void printArray(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }

	    public int findMinimum(int[] arr) {
	        // edge case
	        if (arr == null || arr.length == 0) {
	            throw new IllegalArgumentException("Invalid input");
	        }

	        int min = arr[0]; // min will hold the minimum of array
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }
	        return min;
	    }

	    public void reverse(int[] numbers, int start, int end) {
	        while (start < end) {
	            int temp = numbers[start];
	            numbers[start] = numbers[end];
	            numbers[end] = temp;
	            start++;
	            end--;
	        }
	    }

	    public static int[] twoSum(int[] numbers, int target) {
	        int[] result = new int[2];
	        Map<Integer, Integer> map = new HashMap<>();

	        for (int i = 0; i < numbers.length; i++) {
	            if (!map.containsKey(target - numbers[i])) {
	                map.put(numbers[i], i);
	            } else {
	                result[1] = i;
	                result[0] = map.get(target - numbers[i]);
	                return result;
	            }
	        }
	        throw new IllegalArgumentException("Two numbers not found");
	    }

	  

	    public void arrayDemo() {
	        int[] arr = {11, 2, 0, 10, 7, 6};
	        int[] result = twoSumII(arr, 9);
	        printArray(result);
	    }

	    public static void main(String[] args) {
	        ArrayUtil arrUtil = new ArrayUtil();
	        arrUtil.arrayDemo();
	    }

	}


