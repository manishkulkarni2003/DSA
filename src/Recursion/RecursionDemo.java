package Recursion;

public class RecursionDemo {
	public static void main(String[] args) {
	//function ,memory management 
		message();
		//a function is calling another function
		
	}
	//write  a function that prints hello world 
	
	static void message() {
		System.out.println("Hello world");
		message1();
	}
	static void message1() {
		System.out.println("Hello world");
		message2();
	}
	static void message2() {
		System.out.println("Hello world");
		message3();
	}
	static void message3() {
		System.out.println("Hello world");
		message4();
	}
	static void message4() {
		System.out.println("Hello world");
	}
}
