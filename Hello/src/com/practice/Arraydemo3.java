package com.practice;

//import java.util.*;

public class Arraydemo3 {
	public static void main(String[] args) {
		Arraydemo3 sc = new Arraydemo3();
		sc.array(0);
		}
	Arraydemo3() {//constructor dye korsi
		int d[] = new int[10];
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
	}
	
public void array(int j) {//method dye korsi
	int []a= {3,12,18,16,16,89,2,3,1,10};
	for( j=0; j<a.length; j++) {
		System.out.println(a[j]);
	}
	}
}
