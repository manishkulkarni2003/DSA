package cognizant.stringsDsa;

import java.util.Scanner;

public class AciiValue {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the Character and Get their Ascii Value");
		
		String input =sc.next();
		char ch =input.charAt(0);
		
		System.out.println((int) ch);
		value();
	
	}
	
	public static void value() {
		char c='e';
		int ascii=c;//typecasting 
		System.out.println("Ascii Value"+ascii);
		
	}
}
