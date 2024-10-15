package com.functions;

public class methodoverloading {
	public static void main(String[] args) {
		
		fun("Manish","janya");
		fun("manish","janya","smsk");
		
		System.out.println(override(4,3));
		
	}
		
	//method Overloading same function name but different parameters
	static void fun(String a,String b) {
		System.out.println(a+" "+b);
		
	}
	static void fun(String a ,String b,String c) {
		System.out.println(a+" "+b+" "+c);
	}
	
	//method overriding
	
	static int override(int a ,int b) {
		return a +b;
	}
	
	
}
