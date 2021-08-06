package com.practice;

public class StringBuffer { //string buffer means mutable string like the string can be changeable:
	
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("welcome");
		StringBuffer s=sb.append("!!!"); //append method means concatenate the given string with the old string;
		
		String sb= sb.insert (0, 'f');
		System.out.println(sb);
		sb.replace(0, 2, "WEL");
	}
	
	
}
