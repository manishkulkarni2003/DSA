package dsa.interviewPrep;
//The function Accepts two Integers n,m as Arguments
//Find the Sum of All numbers In range of 1 to m
//That Are Not Divisible by n .Return difference between Sum of Integers 
//not Divisible by n with sum of Numbers Divisible by n

public class differenceOfSum {
	
	
	public static void main(String[] args) {
			
		int m=20;
		int n=4;
		System.out.println(differenceOfSumbetween(m,n));
		
		
	}
	static int differenceOfSumbetween(int m,int n) {
		
		int sum1=0;
		int sum2=0;
		
		for(int i =1;i<=m;i++) {
			if(i%n==0) {
				sum1+=i;
			}else {
				sum2+=i;
			}
			
		}
		return Math.abs(sum1-sum2);
	}
		
}
