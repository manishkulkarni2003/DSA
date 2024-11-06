package Recursion;

public class FibonacciRecursion {
	public static void main(String[] args) {
		
		System.out.println(fibo(4));
	
	}
	static int fibo(int n) { //n=4
		//base condition
		if(n<2) {
			return n;
		}
		
		return fibo(n-1)+fibo(n-2); 
		//this is not tail recursion
		}
}
