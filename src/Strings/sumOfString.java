package Strings;

import java.util.Arrays;

public class sumOfString {
	
	public static void main(String[] args) {
		
		String str ="aet2wr4";
		
		System.out.println(sum(str));
		
		
	}
	
	
	
	public static String sum(String str) {
		// To store the sum of digits
		int digitSum =0;
		 // To store characters that are not digits
		StringBuilder nonDigits =new StringBuilder();
		
		// Loop through the string
		for(int i =0;i<str.length();i++) {
			char ch =str.charAt(i);
			// If character is a digit, add its value to digitSum
			if(Character.isDigit(ch)) {
				digitSum+=ch-'0';
			}
			else {
				 // Otherwise, append it to nonDigits
				nonDigits.append(ch);
			}
		}
		// Sort the non-digit characters
		char[] sortedChars =nonDigits.toString().toCharArray();
		Arrays.sort(sortedChars);
		
		StringBuilder res =new StringBuilder(new String(sortedChars));
		  // Append digit sum if it is greater than 0
		if(digitSum>0) {
			res.append(digitSum);
		}
		
		return res.toString();
				
		
		
	}
}
