package com.functions.practice;
import java.util.Scanner;

public class palindrome {
	
	public static boolean isPalindrome(String str) {
		str =str.replaceAll("[^A-Za-z0-9]", "").toLowerCase(); 
		
		int left =0;
		int right =str.length()-1;
		
		while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;  // Move left pointer right
            right--; // Move right pointer left
        }

        // Step 4: If loop completes, it's a palindrome
        return true;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		 System.out.println("Enter a string: ");
		 
		 String input =sc.nextLine();
		 if (isPalindrome(input)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }
	        
	       sc.close();
	       
		
		
		
	}
}