package com.exception;

public class ThrowDemo {
public static void main(String[] args) {
	

	try {
	int a=5;
	int b=0;
	if(b==0) {
		throw new Exception("cant devided by zero");
	}
	int c=a/b;
	System.out.println(c);
}
catch (Exception e) {
	System.out.println("exception is"+ e);
}
}	
}
