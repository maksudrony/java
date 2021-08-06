package com.practice;

import java.util.*;

public class Arraydemo5 {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		Arraydemo5 dm = new Arraydemo5();
		Scanner sc = new Scanner(System.in);// created scanner object to take input from console
		System.out.println("give the size of an array");
		int n = sc.nextInt();
		byte b=127;// range -128 to 127
		int i, j;
		int d[] = new int[n];
		int a[] = new int[d.length];
		System.out.println("give the input of the array boxes");
		for (i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}
		for (i = 0; i < n; i++) {
			System.out.println(d[i]);
			}
		
		int temp;
		//for(i=0; i<d.length; i++) {
		for (j = a.length-1; j >= 0; j--) {
			temp = d[i];
			d[i] = a[j];
			a[j] = temp;
		}
		//}
		
		for (j = 0; j > a.length; j++) {
			System.out.println(a[j]);
		}

	}
}


