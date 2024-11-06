package Strings;

import java.util.Arrays;

public class string {
	public static void main(String[] args) {
	String s="Manish";
	//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	//Duplicate local variable s
	//String s="Janya"; String is immutable
	String[] f = {"manish","janya"};
	String a ="Manish";
	a="Janya";
	
	String c =new String("Kunal");
	String d=new String("Kunal");
	//returns false because these two are
	//different objects
	System.out.println(c ==d);//checks object
	System.out.println(c.equals(d));//checks value
	//.equals() is a method
	System.out.println(c.charAt(0));
	
	
	//garbage collection 
	System.out.println(a);
	System.out.println(a);
	System.out.println(s);
	System.out.println(Arrays.toString(f));
	
	}
}
