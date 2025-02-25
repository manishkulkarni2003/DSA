package cognizant.mathsDsa;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		
		System.out.println("Enter the Number for the fibonaaci series");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int p=0;
		int i=1;
		
		int count =2;
		
		while(count<=n) {
			int temp =i;
			i=i+p;
			p=temp;
			count++;
			
			
		}
		System.out.println(i);
		
		fiboseries(9);
		
		
		}
	
	public static void fiboseries(int n) {
		int first=0;
		int second =1;
		
		for(int count=2;count<n;count++) {
			int next =first+second;
			System.out.println(" "+next);
			first=second;
			second=next;
			
		}
		
		
	}
	
	
}
