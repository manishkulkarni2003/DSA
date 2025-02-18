package PlacementDrive;

import java.util.Arrays;

public class secondLargest {
	
	public static void main(String[] args) {
		
		int[]arr = {1,2,3,4,5};
		System.out.println(SecondLargest(arr));
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static int SecondLargest(int[]arr) {
		int largest=arr[0];
		int secondLargest=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}

		}
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>secondLargest && arr[i]!=largest) {
				secondLargest=arr[i];
			}
		}
		return secondLargest;
	}
}
