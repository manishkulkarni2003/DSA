package cognizant.mathsDsa;
//Chocolate Distribution
//Story: Sam bought N chocolates and wants to 
//distribute them equally among his friends. If he has F f
//riends, he wants to know two things:
//
//How many chocolates each friend will get
//How many chocolates will be left after equal distribution
//Write a program to help Sam.
//
//Input:
//Two integers N (total chocolates) and F (number of friends)
//
//Output:
//Two numbers — chocolates per friend and remaining chocolates
//
//Example:
//
//makefile
//Copy
//Edit
//Input: 25 4  
//Output: 6 1  



public class chocolateDist {
	public static void main(String[] args) {
		
		chocoDistribution(25, 4);
		
		
	}
	
	public static void chocoDistribution(int n,int f) {
		
		if(f==0) {
			System.out.println("The no of Chocolates cannot be Divided By Zero");
		}
		
		
		int rem=n%f;
		int res=n/f;
		
		System.out.println("The Chocolates per friend will be :"+res+" "+"And the Remaining Chocolates wll be:"+rem);
		
		
		
	}
}
