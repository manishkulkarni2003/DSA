package OOPS.Practice;
import java.io.IOException;
import java.util.Scanner;

class test1{
	public void input(int age) {
		
		if(age<18) {
			throw new ArithmeticException("Not valid");
		}
		else {
			System.out.println(age);
		}
	}
	public void throwsDemo(String name) throws NullPointerException{
		if(name==null) {
			throw new NullPointerException("Name Cannot be Null");
		}
	}
}
public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a and b");
		try {
			int a =sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println(e+"Arithmetic Exception Cannot Divide by Zero");
		}
		
		test1 obj =new test1();
		obj.input(18);
		
		
		
	}
}
