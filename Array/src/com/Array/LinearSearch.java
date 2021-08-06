package com.Array;
// search the given key
public class LinearSearch {
	public int searchElement(int [] array, int key, int n){
		for(int i=0; i<n; i++) {
			if(array[i]==key) {
				return i;// koto number index a ase seta show korbe 
			}
		}
		return -1;// -1 false er moto kaj kore
		
	}
	       
public static void main(String[] args) {
	LinearSearch ls= new LinearSearch();
	int []a= {5, 10, 15, 20, 25, 30, 35, 40, 45};
	
	System.out.println(ls.searchElement(a, 60, 9));
	System.out.println(ls.searchElement(a, 50, 9));
	System.out.println("in index number "+ls.searchElement(a, 40, 9));
}
}
