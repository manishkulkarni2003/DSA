package striverArrays;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		int target =7;
		System.out.println(Arrays.toString(twoSumBetter(arr,target)));
		
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
	//better solution 
	static int[] twoSumBetter(int[] arr,int target) {
		int[] ans =new int[2];
		ans[0] = ans[1] = -1;
		HashMap<Integer,Integer> sum = new HashMap<>();
		for(int i =0;i<arr.length;i++) {
			int num =arr[i];
			int neededMore =target-num;
			if(sum.containsKey(neededMore)) {
				ans[0] =sum.get(neededMore);
				ans[1]=i;
				return ans;
			}
			sum.put(arr[i],i);
		}
		return ans;
	}
}
