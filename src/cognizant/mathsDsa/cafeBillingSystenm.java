package cognizant.mathsDsa;
import java.util.*;
//Café Billing System
//Story: A café owner wants a simple billing system. 
//Each customer’s bill includes:
//
//Price of an item
//Quantity of items ordered
//5% tax on the total bill
//Write a program to calculate the final bill amount after tax.
//
//Input:
//Two integers: price (price per item) and quantity (number of items)
//
//Output:
//Final bill amount rounded to two decimal places
//
//Example:
//
//makefile
//Copy
//Edit
//Input: 100 3  
//Output: 315.00  
public class cafeBillingSystenm {
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the Price of the Item");
		Scanner sc=new Scanner(System.in);
		
		int price=sc.nextInt();
		System.out.println("Enter the Quantity of the Product");
		int quantity=sc.nextInt();
		double tax=5.0/100;
		int res=(price*quantity);
		double totalBill=res+(res*tax);//300+300*5.0/100=15
		System.out.println("Total Bill would be :"+totalBill);
		
	}
	
	
}
