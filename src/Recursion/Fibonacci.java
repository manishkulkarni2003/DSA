package Recursion;

public class Fibonacci {
	public static void main(String[] args) {
		Fibo(10);
		
	}
	static void Fibo(int n) {
		int res=0;
		for(int i=1;i<=n;i++) {
			res=res+1;
		}
		System.out.println(res);
	}
}
