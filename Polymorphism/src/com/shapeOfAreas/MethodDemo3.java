package com.shapeOfAreas;

public class MethodDemo3 {// different type of parameters...
	public void area (String n) {
		System.out.println("print the string");
		
	}
	public void area (int a) {
		System.out.println("print the integer");
	}
public static void main(String[] args) {
	MethodDemo3 m= new MethodDemo3();
	m.area("s");
	m.area(12);
}
}
