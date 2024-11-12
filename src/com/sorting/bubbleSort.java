package com.sorting;

import java.util.Arrays;

public class bubbleSort {
	public static void main(String[] args) {
		
		int arr[] = {2,3,5,7,2};
		BubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void BubbleSort(int[] arr) {
		for(int i =0;i<arr.length;i++) {
			
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					int temp =arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
