package com.linearSearch;

public class searchInRange {
	public static void main(String[] args) {
	int [] arr= {18,23,46,62,52,19};
	int start =1;
	int end =4;
	int target =46;
	
	System.out.println(searchRange(arr,start,end,target));
	}
	static int searchRange(int[] arr,int start,int end,int target) {
		if(arr.length ==0) {
			return -1;
		}
		for(int i=start;i<=end;i++) {
			if(target == arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
