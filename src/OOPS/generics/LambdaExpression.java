package OOPS.generics;

interface Avg{
	void avg(int a,int b);
}
public class LambdaExpression {
	
	public static void main(String[] args) {
	
	Avg func=(int a,int b)->System.out.println("The Average of Two Numbers is:"+(a+b)/2);
	func.avg(10,20);
	}
	
	
}
