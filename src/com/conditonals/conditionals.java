package com.conditonals;

public class conditionals {
	public static void main(String[] args) {
		//basic syntax for conditions
		
		
//		int age =34;
//		if(age>18) {
//			System.out.println("You are eligible to drive");
//			
//		}
//		else {
//			System.out.println("You are not eligible to drive");		}
//	}
		int salary =25000;
		if(salary <=10000) {
			salary+=3000;
			System.out.println("Your Bonus is :"+salary);
			
		}
		else if(salary >=25000) {
			salary+=4000;
			System.out.println("Your Bonus is :"+salary);
			
		}
		else {
			salary+=5000;
			System.out.println("Your Bonus is :"+salary);
			
		}
		
		
	}
		
}
