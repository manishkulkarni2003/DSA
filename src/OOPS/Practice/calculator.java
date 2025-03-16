package OOPS.Practice;
import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number :");
		int a=sc.nextInt();
		System.out.println("Enter the Second Number");
		int b=sc.nextInt();
		
		System.out.println("Choose Operation:");
		System.out.println("+");
		System.out.println("-");
		System.out.println("*");
		System.out.println("/");
		System.out.println("%");
		
		String choose=sc.next();
		int res=0;
		switch(choose) {
		case "+":
			res=a+b;
			break;
		case "-":
			res=a-b;
			break;
			
		case "*":
			res=a*b;
			break;
		case "/":
			if(b!=0) {
				res=a/b;
				
			}else {
				System.out.println("Error:Division By Zero is Not Allowed");
				sc.close();
			}
			break;
			
		case "%":
			res=a%b;
			break;
			
		default:
			System.out.println("Invalid Operation");
		}
		
		System.out.println("The result is :"+res);
			
			
			
					
			
		
		
		
		
	}
}
