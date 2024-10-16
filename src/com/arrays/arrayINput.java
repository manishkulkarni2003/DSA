package com.arrays;
import java.util.Scanner;
public class arrayINput {
	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		
		int[] arr=new int[6];
		
		
//		System.out.println(arr[3]);
		
		//input using for loop
		System.out.println("Enter the INtegers for array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		//enhanced forloop
		//datatype reference variable :arr ,num represents arr
		for(int num:arr) {
			System.out.println(num);
		}
	}
}
