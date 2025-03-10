package cognizant.mathsDsa;

import java.util.Scanner;

public class perfectNumber {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number to Check the Perfect Number");
		int n=sc.nextInt();
		if(perfectNum(n)) {
			System.out.println(n+"Is a Perfect Number");
		}
		else {
			System.out.println(n+"Is not a Perfect Number");
		}
		
		
	}
	public static boolean perfectNum(int n) {
		int sum=0;
		int temp =n;
		for(int i=1;i<=n-1;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		return temp==sum;
	}
}
