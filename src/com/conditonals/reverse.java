package com.conditonals;

public class reverse {
	
	public static void main(String[] args) {
		int n =23597;//given input
		
		int res =0; //the result is initially 0
		while(n>0) {
			int rem =n%10; //now the remainder is 7
			n/=10;//n=n/10;-->removed 7 and stored in res
			
			res=res*10+rem;//initially res=0 so res =0*10+7=7
			//res =7*10+rem=9=>79
			//res =79*10+5=795
			//.....
			//.......
			//res =79532
			
			
		}
		System.out.println(res);
		
	}
}
