package com.practice;


public class String_demo {
	public static void main(String[] args) {
		String s1= "happy";
		System.out.println("The main string is "+ s1);
		s1= s1.concat(" learning");// concatenate means eksathe jora lagano; 
		System.out.println("The main string is "+ s1);
		
		String s2= "edureka";// s2 and s3 er moddhe alphabets er diffrence show korbe;
		String s3= "edurfka";
		String s4= "";
		System.out.println("Comparison of two strings is "+ (s2.compareTo(s3)));
		System.out.println("s2 is empty= "+ s2.isEmpty());
		System.out.println("s4 is empty= "+ s4.isEmpty());
		System.out.println(s2.toUpperCase()); //converting to the uppercase;
		
		int a= 50;
		//System.out.println(String.valueOf(a));
		String s= String.valueOf(a); //string er value print er jonno;
		System.out.println(s);
		
		//System.out.println(s2.replace('e', 'E'));
		String replace= s2.replace('e', 'E');// for replacing characters;
		System.out.println(replace);
		
		System.out.println("check if the string contains letter d= "+replace.contains("d"));
		String x= "my name is rony";
		String y= "my name is ranvir";
		System.out.println("the equality of x and y is " +x.equals(y));
		System.out.println(x.charAt(1));// it returns the character;
		System.out.println(y.endsWith("r"));// it returns true or false by checking the last character
		
	}

}
