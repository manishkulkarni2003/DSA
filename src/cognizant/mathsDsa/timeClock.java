package cognizant.mathsDsa;

import java.util.Scanner;

//Story: A time traveler’s clock only shows the 
//total number of minutes passed since midnight. 
//Help the traveler convert it into a proper HH:MM format.
//
//Input:
//An integer M representing the number of minutes
//passed since midnight (0 ≤ M < 1440)
//
//Output:
//A string in HH:MM format (24-hour clock)
//
//Example:
//
//makefile
//Copy
//Edit
//Input: 75  
//Output: 01:15  
public class timeClock {
	
	public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Minutes passed After the Midnight");
	
	int minutes=sc.nextInt();
	
	if(minutes<0 || minutes>=1440) {
		System.out.println("Invalid Minutes");
		return;
	}
	
	int hours =minutes/60;
	int mins=minutes%60;
	
	System.out.println("Time in HH:MM format is "+hours+":"+mins);
	
	
	
	}
	
	
	
}
