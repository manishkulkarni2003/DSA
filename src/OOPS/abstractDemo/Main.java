package OOPS.abstractDemo;

public class Main {
	
	public static void main(String[] args) {
	
		son obj =new son(33);
		obj.career("Manish");
		obj.shirt("manish");
		obj.normal();
		//Cannot instantiate the type abstractExample
		//Cannot Create Objects of an Abstarct class
//		abstractExample obj2 =new abstractExample(22);
		
		//Static Method in the Abstract Class
		abstractExample.hello();
		
		//We cannot Create Object of Abstract Class 
		//but we Can use it As an reference Variable
	}
	
}
