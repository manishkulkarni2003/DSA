package cognizant.arrayDsa;

import java.util.Arrays;

public class findSecondSmallestAndSecondLargestElement {
	public static void main(String[] args) {
		int[] arr= {5,37,7,8,1,2};
		secondSmallSecondLarge(arr);
	
	}
	public static void secondSmallSecondLarge(int[] arr) {
		Arrays.sort(arr);
		int secSmall=arr[1];
		int secLarge=arr[arr.length-2];
		System.out.println(secSmall);
		System.out.println(secLarge);
		
	}
}
