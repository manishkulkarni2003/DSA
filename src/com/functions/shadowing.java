package com.functions;
import java.util.Arrays;
public class shadowing {
	
	static int x=10;
	public static void main(String[] args) {
		int x=15;
		System.out.println(x);//prints 15
		
		fun();//prints 10
		args(2,3,45,5,56,6,6,6);
		//any no of arguments we can take
		multipleArgs(1,2,"Manish","janya");
		
	}
	static void fun() {
		System.out.println(x);
	}
	//varible arguments 
	//spread operator
	static void args(int ...v) {
		System.out.println(Arrays.toString(v));
	}
	static void multipleArgs(int a,int b,String...v) {
		System.out.println(a+b+"v");
	}
}
