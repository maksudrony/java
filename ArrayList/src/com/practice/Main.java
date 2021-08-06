package com.practice;
/*The ArrayList class is a resizable array, which can be found in the java.util package.
The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you
 want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed
 from an ArrayList whenever you want.
  */
import java.util.ArrayList; // imported the arrayList class
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
	    ArrayList<String> cars = new ArrayList<String>(); // created an array List object
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    System.out.println(cars.get(0));// To access an element in the ArrayList, use the get() method and refer to the index number
	    cars.set(3, "Opel");//To modify an element, use the set() method and refer to the index number
	    System.out.println(cars);
	    cars.remove(0); //remove() method to remove an element refer to the index number4
	    System.out.println(cars);
	    System.out.println("arrayList size is "+ cars.size()); // size() method
	    
	    arrayListWithLoop();
	    sortString();
	    sortInterger();
	  }

	private static void sortInterger() {
		 
			    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
			    myNumbers.add(33);
			    myNumbers.add(15);
			    myNumbers.add(20);
			    myNumbers.add(34);
			    myNumbers.add(8);
			    myNumbers.add(12);

			    Collections.sort(myNumbers);  // Sort myNumbers
/*The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion,
 manipulation, and deletion.*/
			    for(int i=0; i< myNumbers.size(); i++) {
			    	System.out.print(myNumbers.get(i)+ " ");
			    }
			    System.out.println();
		
	}

	private static void sortString() {
		ArrayList<String> cars = new ArrayList<String>(); // created an array List object
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    cars.sort(null);;
	    System.out.println(cars);
		
	}

	private static void arrayListWithLoop() {
		ArrayList<Integer> myNumbers = new ArrayList<Integer>(); 
	    myNumbers.add(10);
	    myNumbers.add(15);
	    myNumbers.add(20);
	    myNumbers.add(25);
	   /* for (int i : myNumbers) {
	      System.out.println(i);
	    }*/
	    for(int i=0; i< myNumbers.size(); i++) { // for loop diyeo kora jay
	    	System.out.print("loop diye print korsi- "+myNumbers.get(i)+ " ");
	    }
	    System.out.println("\n");
	    System.out.println("loop chara print korsi- " +myNumbers);// for loop chara korsi, r uporer ta for loop dye ..2 vabei kora jay
		
	}
}
