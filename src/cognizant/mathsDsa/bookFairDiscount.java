package cognizant.mathsDsa;

import java.util.Scanner;

//Book Fair Discount
//Story: A book fair is offering discounts based on 
//the total purchase amount:
//
//10% discount if the total bill is above ₹1000
//5% discount if the total bill is between ₹500 and ₹1000
//No discount if the total bill is below ₹500
//Write a program to calculate the final 
//amount after applying the discount.
//
//Input:
//Total bill amount as an integer B
//
//Output:
//Final payable amount rounded to two decimal places
//
//Example:
//
//yaml
//Copy
//Edit
//Input: 1200  
//Output: 1080.00  
public class bookFairDiscount {
	
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the Amount");
	
	int amount =sc.nextInt();
	
	if(amount>1000) {
		double discount =10.0/100;
		double totalBill=amount-(amount*discount);
		System.out.println("The Total Bill Payable is :"+totalBill);
	}else if(amount>=500 && amount<=1000) {
		double discount =5.0/100;
		double totalBill=amount-(amount*discount);
		System.out.println("The total Bill payable is :"+totalBill);
	}else if(amount<500) {
		
		System.out.println("Total Bill payable is:"+amount);
	}
	
	
	}
}
