package com.conditonals.assignment;

import java.util.Scanner;

public class areaOfCircle {
	//area of circle is pie r sqaure
	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		
		double r =sc.nextDouble();
		
		double pi=3.14;
		
		double res= pi * r * r;
		
		System.out.println("Area of circle is "+res);
		
		
		
		
		
		
	}
}
