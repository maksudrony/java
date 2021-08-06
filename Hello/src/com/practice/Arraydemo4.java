package com.practice;

public class Arraydemo4 {//reverse in one way
public static void main(String[] args) {
	Arraydemo4 demo= new Arraydemo4();
	
	int a[]= new int[10];
	for(int i=a.length-1; i>0;i--) {
		System.out.println(a[i]);
	}
}
	Arraydemo4() throws ArrayIndexOutOfBoundsException{
		int d[]= {1,2,3,4,5,6,7};
		for(int i=d.length-1; i>=0;i--) {
			System.out.println(d[i]);
		}
	}
}

