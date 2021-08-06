package com.practice;

public class Helloworld {
	public void nonstaticTest(){
		System.out.println("non static method");
	}
	public static void staticTest(){
		System.out.println("static method");
		
	} 
public static void main(String[] args) {
	Helloworld helloworldObject = new Helloworld();
	System.out.println("HELLO WORLD");
	staticTest();
	helloworldObject.nonstaticTest();
	
	
}
}
