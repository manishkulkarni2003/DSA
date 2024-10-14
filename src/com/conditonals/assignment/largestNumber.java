package com.conditonals.assignment;

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible value
        
        while (true) {
            System.out.println("Enter an integer (0 to stop):");
            
            int input = sc.nextInt();
            
            if (input == 0) {
                break; // Exit the loop when the user enters 0
            }
            
            // Update max if the current input is larger than the current max
            if (input > max) {
                max = input;
            }
        }
        
        // Check if max was updated (i.e., the user entered at least one number)
        if (max == Integer.MIN_VALUE) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("The largest number is: " + max);
        }
    }
}
