package com.practice;

public class Employee extends Manager {
	public static void main(String[] args) {
		Employee emp= new Employee();
		emp.salary=100;
		System.out.println("employee salary is "+ emp.salary);
		Manager mg=new Manager();
		//mg.salary2=50;
		System.out.println("manager salary is " + mg.salary2);
	}

}
