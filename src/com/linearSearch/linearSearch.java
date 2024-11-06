package com.linearSearch;

public class linearSearch {
	public static void main(String[] args) {
	
	int[] nums = {23,45,1,2,8,19,-3,16,28};
	int target =19;
	int ans =linearsearch(nums,target);
	System.out.println(ans);
	}
	//search the target and return element 
	static int linearsearch(int[] arr,int target) {
		if(arr.length==0) {
			return -1;
		}
		//using forEach loop
		for(int element :arr) {
			if(element ==target) {
				return element;
			}
			
		}
		//this line will execute if none of the return statement 
		//above executed hence the target is not found
		return -1;
	}
}
	
	// search in the array return the index if item found 
	//else return -1
//	static int linearsearch(int[] arr,int target) {
//		if(arr.length==0) {
//			return -1;
//		}
//		for(int i =0;i<arr.length;i++) {
//			//check for element at every index if it is =targer
//			int element = arr[i];
//			if(element ==target) {
//				return i;
//			}
//			
//		}
//		//this line will execute if none of the return statement 
//		//above executed hence the target is not found
//		return -1;
//	}
//}
