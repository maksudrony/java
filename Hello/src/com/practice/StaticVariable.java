package com.practice;

public class StaticVariable {// with constructor
	static String company= "google";
	String gname;
	int gage;
	
	StaticVariable(){
		this("Rony");
	}
	StaticVariable(String name){
		this(name, 25);
	}
	StaticVariable(String name, int age){
		this.gname= name;
		this.gage= age;
		System.out.println(gname + gage + company);
		
	}
	
	public static void main(String[] args) {
		StaticVariable st= new StaticVariable();
		//st.display();
	}

}
