package com.linearSearch;

public class minimumNumber {
	public static void main(String[] args) {
	int [] arr = {88,72,34,52,48,32};
	
	System.out.println(minimum(arr));
	}
	static int minimum(int[] arr) {
		if(arr.length ==0) {
			return -1;
		}
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			
			if(arr[i]<min) {
				min=arr[i];
				
		}
		
	}
		return min;
}
}
