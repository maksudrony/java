package com.practice;
import java.util.ArrayList;
import java.util.Iterator;
/*An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. It is called an
  "iterator" because "iterating" is the technical term for looping.
To use an Iterator, you must import it from the java.util package.*/
public class Main {

	public static void main(String[] args) {

		// Make a collection
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		Iterator<String> it = cars.iterator(); // Get the iterator
		System.out.println(it.next());// Print the first item by using next() method
		System.out.println();
		while(it.hasNext()) { // while loop for iterate the collection
			                // To loop through a collection, use the hasNext() and next() methods of the Iterator
			  System.out.println("the loop starts from "+ it.next());
			}
		removeMethod();
		}
	 public static void removeMethod() { // thats used to remove the items
		    ArrayList<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(12);
		    numbers.add(8);
		    numbers.add(2);
		    numbers.add(23);
		    Iterator<Integer> it = numbers.iterator();
		    while(it.hasNext()) {
		      Integer i = it.next();
		      if(i < 10) {
		        it.remove();  //thats used to remove the items
		      }
		    }
		    System.out.println(numbers);
		  }
	
}

