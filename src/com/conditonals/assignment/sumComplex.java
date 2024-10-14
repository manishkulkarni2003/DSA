package com.conditonals.assignment;

import java.util.Scanner;
public class sumComplex {
	//Take integer inputs till the user enters 0 and
   //print the sum of all numbers (HINT: while loop)
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
		int res = 0;
		while(true) {
			System.out.println("enter the integer");
			
			int input =sc.nextInt();
			if(input ==0) {
				break;
				
			}
			res+=input;//res=res+input;
			
			
		}
		System.out.println(res);
	}
}
