package OOPS;

import OOPS.Access.AccessModifier;

//it is A class Which Can Create One Object Only 
public class singleTon extends AccessModifier {
	

	

	public singleTon(int num, String name) {
		super(num, name);
		// TODO Auto-generated constructor stub
	}

	//This Will be Used in this Class Only 
	
	
	public static void main(String[] args) {
	
		singleTon obj=new singleTon(22,"Manish");
		
		//name Can be Accessed Only if it is A Subclass
		singleTon obj2 =(singleTon) new AccessModifier(34,"Manish");
		obj.getNum();
		System.out.println(obj2.name);
		//Now we Can Access the Protected Access Modifier By Extending the class
		//By inheriting the Access Class 
		//Without Inheritance We Cannot Access the Protected Properties
		
		//Cannot Access the Name Default 
		//Access Modifier Here 
	
	}

	
}
