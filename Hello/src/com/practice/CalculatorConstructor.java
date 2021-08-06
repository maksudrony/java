package com.practice;

public class CalculatorConstructor {
	int instanceVariable;
	//int value;
	String sName;
	int sroll;
	CalculatorConstructor(int value1, int value2){// constructor with 2 parameters;
		System.out.println("value2 of the 2 parameters "+ value2);
		
	}
	 CalculatorConstructor(int value){//constructor with 1 parameter;
		int result= value + value;
		System.out.println("result of one parameter is "+ result);
		
	}
	 //constructor chain starts from here..
	 CalculatorConstructor(){
		 this("ranvir");
	 }
	 CalculatorConstructor(String name){
		 this(name, 70);
	 }
	 CalculatorConstructor(String name, int roll){
		 this.sName= name;
		 this.sroll= roll;
		 System.out.println("student name is " +sName);
		 System.out.println("student roll is " +sroll);
		// add(this);
	 }
	 /*void add(Calculator c) {
		 System.out.println("printing the add method taking calculator as parameter");
		 
	 }*/
	public static void main(String[] args) {
	CalculatorConstructor cal= new CalculatorConstructor(5);
	CalculatorConstructor cal2= new CalculatorConstructor(5, 20);
	CalculatorConstructor st= new CalculatorConstructor();//object for constructor chain;
    
	//System.out.println(cal);
}
}
