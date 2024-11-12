package Recursion;

import java.util.Arrays;

public class revArr {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		ReverseArr(arr,0,arr.length-1); 
		System.out.println(Arrays.toString(arr));
		
		
	}
	static void ReverseArr(int[]arr,int start,int end) {
		
		if(start>=end) {
			return;
		}
		
		
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end] =temp;
		
		ReverseArr(arr,start+1,end-1);
	}
}
