package Recursion;
//Yeh hai Mentos Zindagi
public class NumbersRecursion {
	public static void main(String[] args) {
	
		print(1);
	
	}
	//Recursion a Function is calling itself
	
	static void print(int n) {
		//Base condition
		//if Base Condition is not given 
		//stack will be fulled(Stack overflow error)
		//function is infinitely till error calls itself
		if(n==5) {
			System.out.println(5);
			return;
		}
		System.out.println(n);
		//this function is calling again and again
		//but it will take memory for every function call
		print(n+1);
		//this is called tail recursion
	}
}
