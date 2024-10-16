package com.arrays;

import java.util.Arrays;
import java.util.Scanner;
public class multiDimenArray {
	public static void main(String[] args) {
	
		//1 2 3
		//4 5 6
		//7 8 9
		//2 dimensional array
		//syntax new int[no of row][no of columns]
//		int[][] arr=new int[3][3];
		
		
		//an array of arrays
//		int[][] arr = {
//				{1,2,3},//0th index
//				{4,5,6},//1st index
//				{7,8,9}//2nd index
//		};
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Integers for the matrix");
		//input 
		int[][] arr2=new int[3][3];
		
//		for(int i=0;i<arr2.length;i++) {
//			arr2[i][i]=sc.nextInt();
//			arr2[i][i]=sc.nextInt();
//			arr2[i][i]=sc.nextInt();
//		}
		for(int row =0;row<arr2.length;row++) {
			
			for(int col=0;col<arr2[row].length;col++) {
				arr2[row][col]=sc.nextInt();
				
			}
		}
		
		for(int row=0;row<arr2.length;row++) {
			
			for(int col=0;col<arr2[row].length;col++) {
				System.out.println(arr2[row][col]+" ");
			}
		}
		System.out.println();
		
		//using enhanced for loop
		for(int[]num:arr2) {
			System.out.println(Arrays.toString(num));
		}
		
		
		
		
		
		
//		for(int[] num:arr) {
//			System.out.println(Arrays.toString(num));
//		}
//		
		
	}
}
