package OOPS.Access;
//import java.lang.*; this is Automatically Imported 

import java.util.Scanner;
public class Main  {
	

	public static void main(String[] args) {
	AccessModifier obj =new AccessModifier(34,"Manish");
	
	//need to do a few things
	//1.Access the data members
	//2.modify the data members
	
	obj.getNum();
	String name =obj.name;//This is Public So We can Access this Anywhere
	//In the Same Package the Default Access Modifier Can be Accessed 
	System.out.println(name);
	
	Scanner sc =new Scanner(System.in);
	String input =sc.next();
	
	//	ArrayList<Integer> list =new ArrayList<Integer>();
//	list.DEFAULT_CAPACITY;Cannot Access the Default capacity beacuse it is Private
	
	
	}
}
