package OOPS.Practice;

abstract class base {
	abstract void fun();
}
class sub extends base{
	void fun() {
		System.out.println("Implementing the Abstarct Method");
	}
}
public class abstractDemo {
	public static void main(String[] args) {
	
		sub obj =new sub();
		obj.fun();
		
	}
}
