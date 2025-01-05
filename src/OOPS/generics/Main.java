package OOPS.generics;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
	
		compareExample manish =new compareExample(51,59.9f);
		compareExample rahul =new compareExample(50,89.9f);
		compareExample janya =new compareExample(52,79.9f);
		compareExample arjun =new compareExample(50,69.9f);
		
		compareExample [] list = {manish,rahul,janya,arjun};
		
		System.out.println(Arrays.toString(list));
		
		Arrays.sort(list);
		
		//Comparing Objects 
		if(rahul.compareTo(manish)<0) {
			System.out.println(rahul.compareTo(manish));
			System.out.println("Manish has More Marks");
		}
	
	}
}
