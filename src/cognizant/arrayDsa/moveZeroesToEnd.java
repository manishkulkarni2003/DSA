package cognizant.arrayDsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class moveZeroesToEnd {
	
	public static void main(String[] args) {
		int[] arr= {1,2,0,0,4,1};
		moveZero(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	//Optimised Solution to MoveZeroes to End
	public static void moveZero(int[]arr) {
		
		
		int j=0;//pointer for Non Zeros
		// Swap non-zero element with the element at index j
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
		
		
	}
	
	
}

//Dry run:
//For arr = [1, 2, 0, 0, 4, 1]:
//
//i	j	Array	Action
//0	0	[1, 2, 0, 0, 4, 1]	Swap 1 with 1
//1	1	[1, 2, 0, 0, 4, 1]	Swap 2 with 2
//2	1	[1, 2, 0, 0, 4, 1]	Zero, no action
//3	1	[1, 2, 0, 0, 4, 1]	Zero, no action
//4	2	[1, 2, 4, 0, 0, 1]	Swap 4 with 0
//5	3	[1, 2, 4, 1, 0, 0]	Swap 1 with 0
//Final Output: [1, 2, 4, 1, 0, 0] 🎉
	
	