package com.shapeOfAreas;

public class MethodDemo2 {// method overloading
	public void area(int a, int b) {
		double result= 0.5* a* b;
		System.out.println("area of triangle"+result);
	}
	public void area(int r) {
		double result2= 3.14* r* r;
		System.out.println("area of circle"+result2);
	}
public static void main(String[] args) {
	MethodDemo2 m= new MethodDemo2();
	m.area(3,4);
	m.area(2);
}
}
