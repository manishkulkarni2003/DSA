package com.linearSearch;
import java.util.Arrays;
public class searchMultiDim {
	public static void main(String[] args) {
	int [][] arr= {
			{23,4,1},
			{18,12,3,9},
			{78,99,44},
			{32,33}
	};
		int target =99;
		int[] ans =search(arr,target);
		System.out.println(Arrays.toString(ans));
	}
	static int[] search(int[][] arr,int target) {
		
		for(int row=0;row<arr.length;row++) {
			
			for(int col=0;col<arr[row].length;col++) {
				if(target ==arr[row][col]) {
					return new int[]{row,col};
				}
			}
		}
		return new int[]{-1,-1}; 
	}
}
