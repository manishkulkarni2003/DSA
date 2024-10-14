package com.conditonals.assignment;

import java.util.Scanner;
public class areaOfRectangle {
	
	// res =length *breadth
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the Length of the rectangle");
		int length =sc.nextInt();
		
		System.out.println("Enter the Breadth if the rectangle");
		int breadth =sc.nextInt();
		
		int result =length*breadth;
		
		System.out.println("The Area of the Rectangle is :"+result);
		
		
	}
}
