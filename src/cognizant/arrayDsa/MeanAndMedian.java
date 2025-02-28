package cognizant.arrayDsa;

import java.util.Arrays;

public class MeanAndMedian {
	public static void main(String[] args) {
	
		int[] arr= {2,5,1,7};
		System.out.println(median(arr));
		
	
	}
	
	public static int mean(int[]arr) {
		int avg=0;
		int n=arr.length;
		int sum =0;
		for(int i =0;i<n;i++){
			sum+=arr[i];
		}

		avg=sum/n;
		return avg; //use Math.round For Edge cases of the Hacker rank Problem;

		}
	public static double median(int[] arr) {
		Arrays.sort(arr); // Sorting the array first
		int n = arr.length;
		if (n % 2 != 0) {
			return arr[n / 2]; // Odd-length array: middle element
		} else {
			return (arr[n / 2 - 1] + arr[n / 2]) / 2.0; // Even-length array: average of two middle elements
		}
	}
	
	
	}
	

