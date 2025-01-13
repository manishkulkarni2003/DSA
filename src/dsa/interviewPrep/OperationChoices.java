package dsa.interviewPrep;

import java.util.Scanner;

public class OperationChoices {
	public static void main(String[] args) {
	
		
		System.out.println("Enter the Operation Values from 1 to 4");
		System.out.println("Enter Operation"+" "+"c:");
		try (Scanner sc = new Scanner(System.in)) {
			int c=sc.nextInt();
			System.out.println("Enter the Value of a:");
			int a =sc.nextInt();
			System.out.println("Enter the Value of b:");
			int b=sc.nextInt();
			
			System.out.println("The Answer is:");
			
			System.out.println(OperationChoice(c,a,b));
		}
	
	}
	
	public static int OperationChoice(int c,int a,int b) {
		int res=0;
		
		switch(c) {
		case 1:
			res=a+b;
			break;
			
		case 2:
			res=a-b;
			break;
		
		case 3:
			res=a*b;
			break;
		case 4:
			res=a/b;
			break;
		}
		return res;
				
			
	}
}
