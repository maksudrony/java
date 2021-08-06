package com.shapeOfAreas;
/*There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism.
We can perform polymorphism in java by method overloading and method overriding.

1. If we overload a static method in Java, it is the example of compile time polymorphism.
2. Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is 
resolved at runtime rather than compile-time. */

public class MethodDemo { //method overloading
	public double area(int a, int b) {
		double result= 0.5*a*b;
		return result;
	}
	 public double area(int r) {
		 double result2= 3.14* r* r;
		 return result2;
		 
	 }
public static void main(String[] args) {
	 
	MethodDemo m= new MethodDemo();
	double result= m.area(3, 4);
	double result2= m.area(2);
	System.out.println("area of triangle is "+ result);
	System.out.println("area of circle is "+ result2);


}
}
