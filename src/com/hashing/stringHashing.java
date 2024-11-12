package com.hashing;

import java.util.Scanner;
public class stringHashing {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the String");
		String s =sc.next();
		
		int[] hash =new int[26];
		
		for(int i=0;i<s.length();i++) { 
			hash[s.charAt(i)-'a']++;
		}
		System.out.println("Enter the queries");
		int q ;
		q=sc.nextInt();
		while(q-->0) {
			char c ;
			c=sc.next().charAt(0);
			System.out.println(hash[c-'a']);
		}
	}
}
