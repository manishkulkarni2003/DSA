package OOPS.Practice;

import java.util.Scanner;
class test{
	static {
		System.out.println("This has been run without the Main Class");
	}
}
public class methodOverlaoding {
	public static void main(String[] args) {
	Overloading obj =new Overloading();
	int a =7;
	double b=7.7d;
	System.out.println(obj.add(a, b));
	}
}
class Overloading{
	//Same Method but Different Parameters
	int add(int a,int b) {
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
	double add(double a,int b) {
		return a+b;
	}
	double add(int a,double b) {
		return a+b;
	}
}
