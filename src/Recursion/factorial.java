package Recursion;

public class factorial {
public static void main(String[] args) {
	
	System.out.println(FactorialRecursive(5));
	
}
static void Factorial(int n) {
	int res =1;
	for(int i=1;i<=n;i++) {
		res=res*i;
	}
	System.out.println(res);
}
static int FactorialRecursive(int n) {
	if(n==1) {
		return 1;
	}
	return n* FactorialRecursive(n-1);
}
}
