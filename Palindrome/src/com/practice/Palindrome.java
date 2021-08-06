package com.practice;

public class Palindrome {
	
	public boolean checkPalindrome(String word) {
	char[] c=word.toCharArray();
	int start=0;
	int end= word.length()-1; //int end= c.length-1;
	while(start < end) {
		if(c[start]!=c[end]) {
			return false;
		}
		start++;
		end--;
	}
	return true;
		
		
	}
	
	
	
	
	
public static void main(String[] args) {
	Palindrome pal= new Palindrome();
	String k= "madam";
	pal.checkPalindrome(k);
	System.out.println("is it palindrome- "+ pal.checkPalindrome(k));
}
}
