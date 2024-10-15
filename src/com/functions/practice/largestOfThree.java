package com.functions.practice;
import java.util.Scanner;
public class largestOfThree {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		int first =sc.nextInt();
		System.out.println("Enter the Second Number");
		int Second =sc.nextInt();
		System.out.println("Enter the Third Number");
		int Third =sc.nextInt();
		
		big3(first,Second,Third);
		
		
		
	}
	
	static void big3(int a ,int b,int c ) {
		if(a>b && a>c) {
			System.out.println(a+":is the Greatest Number");
		}
		else if(b>a&&b>c) {
			System.out.println(b+":is the Greatest Number");
		}
		else {
			System.out.println(c+":is the Greatest NUmber");
		}
		
		if(a<b&&a<c) {
			System.out.println(a+":is the Smallest Number");
		}
		else if(b<a&&b<c) {
			System.out.println(b+":is the Smallest Number");
		}
		else {
			System.out.println(c+":is the Smallest Number");
		}
	}
	
}
