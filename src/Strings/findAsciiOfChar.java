package Strings;

import java.util.Scanner;

public class findAsciiOfChar {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter A Character");
		char ch =sc.next().charAt(0);
		
		//So Basically We Need to TypeCast the Charcter It AutomAtically GIves Us the Ascii Value
		int Asciivalue =(int) ch;
		
		System.out.println("The Ascii Value of"+ch+" "+"is:"+Asciivalue);
		
	}
}
