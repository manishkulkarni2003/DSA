package com.functions;
import java.util.Scanner;
public class function {
	
	public static int Sum(int a,int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two Numbers to perform operation of Sum:");
		int num1 =sc.nextInt();		
		int num2 =sc.nextInt();
		
		System.out.print("The sum of two Numbers is ");
		System.out.println(Sum(num1,num2));
		
	}
}

