package com.arrays;

import java.util.ArrayList;
public class arrayList {
	public static void main(String[] args) {
	//syntax
		
		ArrayList<Integer> arr =new ArrayList<>();
		ArrayList<ArrayList<Integer>> list =new ArrayList<>();
		
		for(int i=0;i<3;i++) {
			list.add(new ArrayList<>());
		}
		
		
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
	
		System.out.println(arr);
	
	}
	
}
