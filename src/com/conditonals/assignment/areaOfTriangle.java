package com.conditonals.assignment;

import java.util.Scanner;

public class areaOfTriangle {
	//Area of a Triangle, A = 1/2 × b × h
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the breadth of the triangle");
		
		int b =sc.nextInt();
		System.out.println("Enter the Height of the triangle");
		int h =sc.nextInt();
		
		double result =0.5*b*h;
		
		System.out.println("Area of triangle is "+result);
		
		
		
		
		}
}
