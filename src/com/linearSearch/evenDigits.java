package com.linearSearch;

public class evenDigits {
	public static void main(String[] args) {
	
		int[] arr= {4,7,22,43,66};
		System.out.println(findEvenNum(arr));
		
		
	}
	static int findEvenNum(int[] nums) {
		int count =0;
		for(int num:nums) {
			if(even(num)) {
				count++;
			}
		}
		return count;
		
	}
	//function to check wheather a number is even or not
	static boolean even(int num) {
		if(num%2==0) {
			return true;
		}
		return false;
	}
}
