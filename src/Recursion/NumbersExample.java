package Recursion;
//Yeh hai Aam Zindagi
public class NumbersExample {
	public static void main(String[] args) {
	
		//write a function that takes in a number 
		//and prints first 5 numbers :1 2 3 4 5
		print(1);
		//a function is calling another function inside a function
		
		}
	static void print(int n) {
		System.out.println(n);
		print2(2);
	}
	static void print2(int n) {
		System.out.println(n);
		print3(3);
	}
	static void print3(int n) {
		
		System.out.println(n);
		print4(4);
	}
	static void print4(int n) {
		System.out.println(n);
	}
}
