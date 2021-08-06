package com.encap;
/*Encapsulation is one of the four fundamental OOP concepts. The other three are inheritance, polymorphism, and
 *  abstraction. Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the 
 *  data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from 
 *  other classes, and can be accessed only through the methods of their current class. Therefore, it is also 
 *  known as data hiding.
To achieve encapsulation in Java −
Declare the variables of a class as private.
Provide public setter and getter methods to modify and view the variables values.*/
/*
 * 
Create a class and demonstrate proper encapsulation techniques
the class will be called Printer
It will simulate a real Computer Printer
It should have fields for the toner Level, number of pages printed, and
also whether its a duplex printer (capable of printing on both sides of the paper).
Add methods to fill up the toner (up to a maximum of 100%), another method to
simulate printing a page (which should increase the number of pages printed).
Decide on the scope, whether to use constructors, and anything else you think is needed.
 */
public class Main {
	 public static void main(String[] args) {
	       
	        Printer printer = new Printer(50, false);
	        System.out.println("Initial page count = " + printer.getPagesPrinted());
	        int pagesPrinted = printer.printPages(4);
	        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
	        pagesPrinted = printer.printPages(2);
	        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
	        System.out.println("Adding 50% to tonerLevel with a new total of " + printer.addToner(50) + "% tonerLevel");
	    }
}
