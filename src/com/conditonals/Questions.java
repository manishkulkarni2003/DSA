package com.conditonals;

import java.util.Scanner;

public class Questions {

	public static void main(String[] args) {
		
		//Q1 find the Largest of 3 NUmbers 
		
//		Scanner sc =new Scanner(System.in);
//		
//		System.out.println("Enter 3 Numbers");
//		
//		int  a =sc.nextInt();
//		int  b =sc.nextInt();
//		int  c =sc.nextInt();
//		
//		if(a>b && a>c) {
//			System.out.println(a+": is the Greatest Number ");
//			
//		}
//		else if(b>a&& b>c) {
//			System.out.println(b+":is the greatest Number ");
//			
//		}
//		else {
//			System.out.println(c+":is the greatest Number");
//			
//		}
		
	
	
	//Q2-->Check if the character is uppercase or lower case
	
	System.out.println("Enter the Character:");
	Scanner in =new Scanner(System.in);
	
	char ch =in.next().trim().charAt(0);
	
//	This is an if condition that checks if the character ch is a lowercase letter.
//
//	'a' and 'z' are the ASCII values of the lowercase letters 'a' and 'z'.
//	If ch is within this range, it means it is a lowercase letter.
	if(ch>='a' && ch <='z') {
		System.out.println("LowerCase");
	}
	else {
		System.out.println("UpperCase");
	}
	
	System.out.print(ch);
	
	
	
	}
	
	
}
