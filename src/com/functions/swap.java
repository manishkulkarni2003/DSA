package com.functions;

public class swap {
	public static void main(String[] args) {
		
		
		//swap numbers code
		int a =10;
		int b=15;
		
		swap(a,b);
		System.out.println(a+" "+b);
		
		//in java we dont have call by reference 
		//we have only call by value
		
		System.out.println();
	}
	static void swap(int a ,int b) {
		int temp =a;
		a=b;
		b=temp;
		
	}
}
