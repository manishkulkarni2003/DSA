package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class StringOperators {
	public static void main(String[] args) {
	
		System.out.println('a'+'b');
		//returns 195 -->ascii values
		
		System.out.println("a"+"b");
		
		System.out.println("a"+1);
		
		//when an integer is concatenated with a String 
		//it will call its wrapper class
		System.out.println("Manish"+new ArrayList<>());
		System.out.println("Manish"+Arrays.toString(new int[] {1,2,33,4}));
	
	
	}
}
