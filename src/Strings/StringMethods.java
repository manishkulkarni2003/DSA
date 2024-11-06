package Strings;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {
	
		String name ="Manish Kulkarni";
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(name.length());
		
		name.toLowerCase();
		System.out.println(name.indexOf('a'));
		System.out.println("   manish   ".trim());
		System.out.println(Arrays.toString(name.split(",")));
	}
}
