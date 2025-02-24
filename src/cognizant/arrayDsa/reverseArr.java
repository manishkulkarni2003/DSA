package cognizant.arrayDsa;

import java.util.Arrays;

public class reverseArr {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4};
		ReverseArr(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static void ReverseArr(int[]arr) {
		
		int start =0;
		int end=arr.length-1;
		while(start<end) {
			
			swap(arr,start,end);
			start++;
			end--;
			
		}
	
	}
	private static void swap(int []arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
		
	}
	
}
