package PlacementDrive;

import java.util.Arrays;

public class reverseArr {
	public static void main(String[] args) {
	
	int[]arr= {1,2,3,4,5};
	reverse(arr);
	System.out.println(Arrays.toString(arr));	
		
	}
	
	public static void reverse(int[]arr) {
		int start=0;
		int end=arr.length-1;
		
		while(start<end) {
			
			swap(arr,start,end);
			start++;
			end--;
			
		}
		System.out.println(arr);
	}
	public static void swap(int[]arr,int i,int j) {
		
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		
	}
}
