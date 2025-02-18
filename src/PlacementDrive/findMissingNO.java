package PlacementDrive;

import java.util.Arrays;

public class findMissingNO {
	public static void main(String[] args) {
		
		int[]arr= {1,2,4,5,6};
		System.out.println("Missing Number is "+missingNumber(arr));
		
	}
	
	public static int missingNumber(int[]arr) {
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]+1!=arr[i+1]) {
				
				return arr[i]+1;
			}
		}
		return arr.length+1;
		
		
	}
}
