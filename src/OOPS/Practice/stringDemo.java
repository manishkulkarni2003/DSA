package OOPS.Practice;

import dsa.interviewPrep.countBinarySubstr;

public class stringDemo {
	public static void main(String[] args) {
	//we can Create String in two Ways
		//string literal
		String str="Manish";
		String str1=new String("2Manish");
//		when we compare this two string it will Give 
		//false Becaus they are Referring to the 
		//different Address
		System.out.println(str==str1);//this Compares reference
		
		System.out.println(str.equals(str1));//this compares values in the Variable
		
		System.out.println(str+str1);
		String concat=str.concat(str1);
		System.out.println(concat);
		System.out.println(str.substring(0,3));
		
	
	}
}
