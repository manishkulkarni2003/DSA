package com.arrays;
import java.util.Arrays;
public class arrayIntro {
	public static void main(String[] args) {
		
		//syntax of array
//		int[] arr= {1,2,3,4,5};
//		
//		int[] arr2 =new int[5];
//		
//		String[] names= {"Manish","Janya","Ayo"};
//		System.out.println(Arrays.toString(names));
//		System.out.println(names[1]);
//		
//		//for each loop
//		for(String name:names) {
//			System.out.println(name);
//		}
//		
//		//declaration refernce varaible =creating the object in the heap
//		arr2[0]=3;
//		arr2[1]=6;
//		//Array objects in heap are not continous it depends on jvm it may or maynot
//		
//		System.out.println(arr[2]);
//		System.out.println(Arrays.toString(arr));
	
	//passing in functions
		
		
	int[] nums = {3,4,56,43};
	System.out.println(Arrays.toString(nums));
	change(nums);
	System.out.println(Arrays.toString(nums));
	
	
	
	
	}
	static void change(int[] arr) {
		arr[0]=99;
	}
	
}


