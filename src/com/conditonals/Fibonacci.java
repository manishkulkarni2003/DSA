package com.conditonals;

import java.util.Scanner;

public class Fibonacci {
	//Q3 -->fibonacci series ex:0+1=1,1+1=2
	//find the nth fibonacci number 
	public static void main(String[] args) {
		System.out.println("Enter the NUmber for the fibonacci series");
		
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int p=0;//previous index 
		int i =1;//current index
		
		int count =2;
		
		while(count<=n) {
			int temp=i; //i is stored in temp variable
			i=i+p; //we added current index and previous index 
			p=temp;//then we stored the value in temp and temp is stored in the p varaible and 
			count++; //count is incremented till the n is satisfied 
			
		}
		System.out.println(i);
		
	
	}
	
	
	
	
}
