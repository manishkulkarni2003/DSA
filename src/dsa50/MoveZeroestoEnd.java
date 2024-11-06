package dsa50;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroestoEnd {
		public static void main(String[] args) {
			int arr[]= {1,2,0,0,5,0,7};
			
			moveZeroes(arr);
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(moveZeros(arr.length,arr)));
			}
		
		//Brute force Approach
	public static void moveZeroes(int[] nums) {
	        ArrayList<Integer> temp =new ArrayList<>();
	        
	        for(int i =0;i<nums.length;i++){
	            if(nums[i]!=0){
	                temp.add(nums[i]);
	            }
	        }
	        int nz =temp.size();
	        for(int i =0;i<nz;i++){
	            nums[i] =temp.get(i);
	        }
	        for(int i=nz;i<nums.length;i++){
	            nums[i]=0;
	        }
	    }
	
	//Optimal Solution 
	public static int[] moveZeros(int n, int[] a) {
        int j = -1;
        	// Find the first zero's index
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
        	// Move all non-zero elements to the left
        if (j != -1) { // Only proceed if there's at least one zero
            for (int i = j + 1; i < n; i++) {
                if (a[i] != 0) {
                    // Swap a[i] and a[j] directly
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    j++; // Move j to the next zero position
                }
            }
        }

        return a;
    }
	
	
}

