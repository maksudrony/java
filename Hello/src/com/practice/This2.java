package com.practice;
class Message{
	int age;
	Message(){
		this("rony");
		System.out.println("welcome to my home");
	}
	Message(String n){
		this(n, 25);
//System.out.println(n);	
}
Message(String n, int age){
	System.out.println(n + age);
}
}
public class This2 {
public static void main(String[] args) {
	Message m= new Message();
}
}
