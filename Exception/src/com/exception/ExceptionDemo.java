package com.exception;

public class ExceptionDemo {
public static void main(String[] args) {
	try {
		int a=7;
		int b=0;
		int c;
		int []d= {1,2,3};
		
		System.out.println(c=a/b);
		System.out.println(d[6]);
	}
	catch(ArithmeticException ex){
		System.out.println("print the exception "+ ex.getMessage());
		}
	catch(ArrayIndexOutOfBoundsException ex){
		System.out.println("array index out of bound exception");
		}
	catch( Exception e){
		System.out.println("generic exception handler");
		
		
	}
	
	}
	
}
