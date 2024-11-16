package striverArrays;

import java.util.Arrays;

public class twoSum {
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		int target =7;
		System.out.println(Arrays.toString(TwoSum(arr,target)));
		
	}
	static int[] TwoSum(int[]arr,int target) {
		for(int i =0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				int res =arr[i]+arr[j];
				if(res==target) {
					return new int[]{i,j};
				}
			}
		}
		return new int[] {};
	}
}
