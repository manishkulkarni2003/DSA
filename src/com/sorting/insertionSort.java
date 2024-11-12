package com.sorting;

import java.util.Arrays;

public class insertionSort {
	public static void main(String[] args) {
		
		int arr[] = {2,3,4,14,1,5};
		InsertionSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	static void InsertionSort(int[] arr) {
		for(int i=0;i<=arr.length-1;i++) {
			int j=i;
			while(j>0 && arr[j-1]>arr[j]) {
				int temp =arr[j-1];
				arr[j-1]=arr[j];
				arr[j] =temp;
				j--;
			}
		}
	}
}
