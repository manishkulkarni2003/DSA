package com.hashing;

public class countNumber_inArr {
	public static void main(String[] args) {
		
		int [] a= {1,2,1,3,4};
		int num =1;
		System.out.println(countNumArr(num,a));
	}
	static int countNumArr(int num,int[]arr) {
		
		
		
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				count =count+1;
			}
		}
		return count;
	}
}
