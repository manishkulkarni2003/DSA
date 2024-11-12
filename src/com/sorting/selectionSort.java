package com.sorting;

import java.util.Arrays;

public class selectionSort {
	public static void main(String[] args) {
		
		int n=5;
		int[] arr= {1,6,7,8,3};
		SelectionSort(arr,n);
		System.out.println(Arrays.toString(arr));
		
		
	}
	static void SelectionSort(int[]arr,int n) {
		for(int i=0;i<=n-2;i++) {
			int min =i;
			for(int j=i;j<=n-1;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[min];
			arr[min] =arr[i];
			arr[i]=temp;
		}
	}
}
