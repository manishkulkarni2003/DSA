package dsa50;

import java.util.Arrays;

public class leftRoatateAnArrayByOnePlace {
	public static void main(String[] args) {
		
		int arr[]= {7,2,3,4,5};
		leftRotate(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	static void leftRotate(int nums[]) {
		int temp =nums[0];
		for(int i =1;i<nums.length;i++) {
			nums[i-1] =nums[i];
			
		}
		nums[nums.length-1] =temp;
		
		
		
		
	}
	static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int temp =arr[0];
        for(int i =1;i<n;i++){
            arr[i-1] =arr[i];

        }
        arr[n-1]=temp;
        return arr;

    }
}



//returing the arr
