package com.arrays.questions;

import java.util.Arrays;

public class reverse {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		Reverse(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void Reverse(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			Swap(arr, start, end);
			start++;
			end--;
		}

	}

	static void Swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;

	}
}
