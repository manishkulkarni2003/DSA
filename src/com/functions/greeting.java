package com.functions;

public class greeting {
	public static void main(String[] args) {
		greetings();
		
		goodMorning("Manish");
		
		
	}
	static void greetings() {
		System.out.println("Hello world");
		
	}
	static void goodMorning(String name) {
		System.out.println("Hello"+" "+name+" "+"Good Morning");
	}
}
