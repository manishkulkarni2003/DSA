package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeSort {
	public static void main(String[] args) {
		
		int [] arr= {1,3,2,4,1,2,5,6,4};
		
		mergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	static void mergeSort(int[] arr,int low,int high) {
		if(low>=high) return;
		
		int mid =(low+high)/2;
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		merge(arr,low,mid,high);
	}
	static void merge(int[] arr,int low,int mid,int high) {
		ArrayList<Integer> temp =new ArrayList<>();
		
		int left =low;
		int right =mid+1;
		
		while(left<=mid && right<=high) {
			if(arr[left]<arr[right]) {
				temp.add(arr[left]);
				left++;
			}
			else {
				temp.add(arr[right]);
				right++;
			}
		}
		while(left<=mid) {
			temp.add(arr[left]);
			left++;
		}
		while(right<=high) {
			temp.add(arr[right]);
			right++;
		}
		
		for(int i =low;i<=high;i++) {
			arr[i] =temp.get(i-low);
		}
		
	}
}
