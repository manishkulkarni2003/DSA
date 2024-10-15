package com.functions;

public class greeting {
	public static void main(String[] args) {
		greetings();
		
		goodMorning("Manish");
		
		System.out.println("The celcius degree of the farenheit is "+celcius(100.1));
		
	}
	static double celcius(double f){
		return (f-32)*0.5555;
		//in void functions we cannot return the value is given from this function
		
	}
	
	static void greetings() {
		System.out.println("Hello world");
		
	}
	static void goodMorning(String name) {
		System.out.println("Hello"+" "+name+" "+"Good Morning");
	}
}
