package OOPS;

public class wrapperExamples {
	public static void main(String[] args) {
	int a=10;
	
	//Wrapper Class 
	Integer num =45;
	Integer num2=60;
	
	
	int b =20;
	swap(num,num2);
	System.out.println(num+""+num2);
	
	final int c=20;
//	c=22;
	
	final A manish =new A();
	manish.name="Manish";
	System.out.println(manish.name);//the objects Can be Modified
	
	}
	static void swap(int a,int b ) {
		int temp =a;
		a=b;
		b=temp;
		
	}
}
class A{
	final int num=10;//only true for Primitive DataTypes
	//always Initialize the final variable Because It cannot be modified
	String name="Janya";
}
