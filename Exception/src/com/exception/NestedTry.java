package com.exception;

public class NestedTry {// 2 ta block jodi alada vabe 2 ta error show kore tahole amra nested try use korbo..
public static void main(String[] args) {
	try {
	try {
		int a=7;
		int b=0;
		int c;
		System.out.println(c=a/b);
	}
	catch(ArithmeticException ex){
		System.out.println("print the exception "+ ex.getMessage());
		}
	try {
		int []d= {1,2,3};
		System.out.println(d[5]);
	}
	catch(ArrayIndexOutOfBoundsException ex){
		System.out.println("array index out of bound exception");
		}
	}
	catch( Exception e){
		System.out.println("generic exception handler");
			
	}
}
}
