package com.conditonals;

import java.util.Scanner;

public class loops {
	public static void main(String[] args) {
		//print number from 1 to 5
		
		//basic syntax of forloop
//		for(int i=1;i<=5;i++) {
//			System.out.println(i);
//		}
//		
//		String msg ="Hello world";
//		for(int i=0;i<=msg.length();i++) {
//			System.out.println(msg);
//			
//		}
//		
//		Scanner sc =new Scanner(System.in);
//		int n =sc.nextInt();
//		
//		for(int i=1;i<=n;i++) {
//			System.out.println(i);
//			
//		}
		
		//while loop syntax 
		
		int num =1;
		while(num<=5) {
			num++;
			System.out.println(num);
			
		}
		
		//do while loop
		int n =0;
		do {
			System.out.println(n);
			n++;
			
		}while(n<=5);
		
	}
}
