package com.functions;
import java.util.Scanner;

public class primeNumber {
	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=in.nextInt();
		
		System.out.println(isPrime(5));
		
	}
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		int c=2;
		while(c*c<=n) {
			if(n%c==0) {
				return false;
			}
			c++;
		}
		return c*c >n;
	}
}
