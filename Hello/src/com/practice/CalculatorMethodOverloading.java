package com.practice;

public class CalculatorMethodOverloading {
	int instanceVariable;

	public int add(int arg1, int arg2) {
		arg1= 100;
		int result = arg1+arg2;
		return result;
	}
	public int addanotherparameter(int arg1, int arg2, int arg3) { //method return kore 
		int result = arg1+arg2+arg3;
		return result;
		
	}
	public CalculatorMethodOverloading() { //constructor value return kore na..constructor er vtoreo object er result print kora jay;
		                                   //constructor thakle age constructor er value ta nibe erpor oi ta print korbe .. 
		                                   //r jodi main method a value declare kora thake tahole main method er tai nibe..
		                              
		instanceVariable=1000;
		//this.instanceVariable= 1000; //ekhane this. uporer instance variable reffer kore ..dui vabei hoy.
	}
	
	public static void main(String[] args) {
		CalculatorMethodOverloading normalCal= new CalculatorMethodOverloading();
		CalculatorMethodOverloading scientificCal= new CalculatorMethodOverloading();
		System.out.println("the instance value (from constructor) before initialize in main method of normal cal is "+ normalCal.instanceVariable);
		System.out.println("the instance value (from constructor) before initialize in main method of scientific cal is "+ scientificCal.instanceVariable);

		normalCal.instanceVariable=10;
		scientificCal.instanceVariable=100;
		System.out.println("the instance value of normal cal is "+ normalCal.instanceVariable);
		System.out.println("the instance value of scientific cal is "+ scientificCal.instanceVariable);

		
		
		
		
		
		CalculatorMethodOverloading cal= new CalculatorMethodOverloading();
		int arg1= 10;
		int arg2= 30;
		int arg3= 40;
		System.out.println("result before passing the value "+ arg1);
		int result=cal.add( arg1,arg2 );
		System.out.println("result after passing the value to add method "+ arg1);//change i made here , didnt reflect the upper non static method;
		System.out.println("the final result is " + result);
		
		int addanotherparameterofResult= cal.addanotherparameter(arg1, arg2, arg3);//here i added another parameter;
		System.out.println("result of three parameter is "+ addanotherparameterofResult);
	}
}
