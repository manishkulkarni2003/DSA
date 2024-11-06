package dsa50;

import java.util.ArrayList;
import java.util.Arrays;

public class leftRotateArrayByD {
	public static void main(String[] args) {
		ArrayList<Integer> arr =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		int k=3;
		ArrayList<Integer> ans = leftRotateArrayByD.rotateArray(arr, k, arr.size());
		System.out.println(ans);
	}
	
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k, int n) {
	        // Step 1: Adjust k to be within the bounds of the array size
	        k = k % n;
	        
	        // Step 2: Create a temporary array to store the first k elements
	        int[] temp = new int[k];
	        for (int i = 0; i < k; i++) {
	            temp[i] = arr.get(i);
	        }
	        
	        // Step 3: Shift the remaining elements of arr to the left by k positions
	        for (int i = k; i < n; i++) {
	            arr.set(i - k, arr.get(i));
	        }
	        
	        // Step 4: Copy the elements from temp to the end of arr
	        for (int i = n - k; i < n; i++) {
	            arr.set(i, temp[i - (n - k)]);
	        }

	        // Return the rotated array
	        return arr;
	    }
	}


