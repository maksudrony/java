package com.search;

public class BinarySearch {
	// Time complexity - O (log n)     // order of log n

	public int binarySearch(int[] a, int key) { // in iterative way
		int low = 0;
		int high = a.length - 1;

		while (low <= high) {
			int mid = (high + low) / 2;

			if (a[mid] == key) {
				return mid; // key kooto number index a ase seta return korbe
			}
			if (key < a[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	public int binarySearchRecursive(int []a, int low, int high, int key) { // in recursive way
		
		 if(low==high) {
			 if(a[low]==key) {
				return low;
			 }
				else {
					return 0;
				}
			 }
			 else {
				int mid=(low+high)/2;
				 if(key==a[mid]) {
					 return mid;
				 }
					 else if(key< a[mid]) { 
					 return binarySearchRecursive(a, low, mid-1, key);
					 }
				 
				 else {
					 return binarySearchRecursive(a, mid+1, high, key);
				 
			 }
			 
			 } 
	 }
	void binarySearchRecursive(){
		int[] a = { 1, 10, 20, 47, 59, 65, 75, 88, 99 };
		int low = 0;
		int high = a.length-1 ;

		System.out.println("at index number - "+binarySearchRecursive(a, low, high, 99));
		System.out.println("at index number - "+binarySearchRecursive(a, low, high, 1));
	}

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int[] a = { 1, 10, 20, 47, 59, 65, 75, 88, 99 };
		System.out.println("at index number - "+bs.binarySearch(a, 65));
		

		bs.binarySearchRecursive();
	}
}
