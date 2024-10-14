//package com.conditonals;
//
//import java.util.Scanner;
//
//public class calculator {
//	//Q5-->calculator program 
//	//take input from user till user does not press x
//	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		
//		int res=0;
//		while(true) {
//			//take the operator as input 
//			System.out.print("Enter the Operator ");
//			char op=sc.next().trim().charAt(0);
//			System.out.println();
//			if(op=='+' ||op=='-' ||op=='*' ||op=='/'||op=='%') {
//				System.out.print("Enter two numbers");
//				
//				int num1 =sc.nextInt();
//				int num2 =sc.nextInt();
//				System.out.println();
//				
//				
//				if(op=='+') {
//					res=num1+num2;
//					
//				}
//				if(op=='-') {
//					res=num1-num2;
//					
//				}
//				if(op=='*') {
//					res=num1*num2;
//					
//				}
//				if(op=='/') {
//					if(num2 !=0) {
//						res=num1/num2;
//					}
//					
//					
//				}
//				if(op=='%') {
//					
//					res=num1%num2;
//					
//				}
//				
//				}else if(op=='x' ||op=='X') {
//					System.out.println("Invalid Operation");
//				}
//			System.out.println(res);
//		}
//		
//		
//	}
//}
