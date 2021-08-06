package com.practice;


public class Calculator {
	int instanceVariable;
	String name;
	public Integer add ( Integer arg1,Integer arg2) {
		 Integer result = arg1 + arg2;
		return result;
	}
	
	public static void main(String[] args) {
		Calculator cal= new Calculator();
		System.out.println(cal.instanceVariable);
		System.out.println(cal.name);
		int result= cal.add (10,30);
		System.out.print("Result of addition is " + result);
		
		
		
		
	}
	

}
