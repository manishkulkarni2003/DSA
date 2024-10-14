package com.conditonals.assignment;

import java.util.Scanner;


public class Factorial {
	
	 public static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return n+factorial(n-1);
		}
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//
//        // Prompt the user to enter a number
        System.out.println("Enter a number to calculate its factorial:");
        int input = sc.nextInt();
        
        int result =factorial(input);
        
        System.out.println(result);
//        
//        // Initialize the result as 1 (since factorial of 0 is 1)
//        int result = 1;
//        int count = input;
//
//        // Factorial calculation using a while loop
//        while (count > 0) {
//            result *= count;  // Multiply result by current count
//            count--;          // Decrease count by 1
//        }
//
//        // Print the calculated factorial
//        System.out.println("The factorial of " + input + " is: " + result);
//        
//        // Close the scanner
        sc.close();
    	
    	
    }
}
