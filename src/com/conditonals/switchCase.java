package com.conditonals;
import java.util.Scanner;
public class switchCase {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Choose Your Fruit");
		String fruit =sc.next();
		
		switch(fruit){
		case "Mango":
			System.out.println("King of fruits");
			break;
		case "Apple":
			System.out.println("A Apple a day keeps the doctor Away");
			break;
		case "Orange":
			System.out.println("A Sour and Good Fruit");
			break;
			
		default:
			System.out.println("All fruits are generally good");
			
			
		}
	}
}
