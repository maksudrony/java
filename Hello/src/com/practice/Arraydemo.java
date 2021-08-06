package com.practice;


public class Arraydemo {
		
	public static void main(String[] args) {
		//int array[]= new int[5];
		int array[]= {2, 4, 6, 8, 10};// one dimensional array;
		int [][] multidimensionalarray= {
				{1,2},
				{3,4},
				{5,6}
		}; // here row is 3 and column is 2;
		
		System.out.println(array[0]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		//System.out.println(array[5]); // array indexoutofboundsexception coz we got only array size of 5;
		System.out.println("multi dimensional array length is " + multidimensionalarray.length);
	    System.out.println("multi dimensional array length of index is "+ multidimensionalarray[2].length);
	    System.out.println("multi dimensional array first index value is " + multidimensionalarray[0][1]);
		System.out.println("multi dimensional array 2nd index value is " + multidimensionalarray[1][0]);
		System.out.println("multi dimensional array 3rd index value is " + multidimensionalarray[1][1]);
		System.out.println("multi dimensional array 4th index value is " + multidimensionalarray[2][1]);


	}

}
