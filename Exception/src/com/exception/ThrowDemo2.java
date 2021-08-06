package com.exception;
//throw keyword followed by an instance and throws keyword followed by a class;
//throw keyword method a use kora hoy and throws keyword method ee signature dye use kora hoy
//throw keyword ekta exception throw korte pare and throws keyword multi exception thow korte pare
public class ThrowDemo2 {
public static int divide(int a, int b) throws Exception {
	int c= a/b;
	return c;
	
}	

	public static void main(String[] args) {
		try {
			ThrowDemo2 th=new ThrowDemo2();
			int ans= divide(5,0);// or, int ans= th.divide(5,0); ekhane th.divide use korle static way te show
			                        //korte bolto;
			System.out.println(ans);
		}
		
	catch(Exception e){
		System.out.println("exception is "+ e);
		
	}	
	}
}


