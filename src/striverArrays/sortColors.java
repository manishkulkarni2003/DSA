package striverArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class sortColors {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,0,1,0,1,2};
		sortColor(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	static void sortColor(int[] nums) {
		int count0=0;
		int count1=0;
		int count2=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0) {
				count0++;
			}
			else if(nums[i]==1) {
				count1++;
			}
			else {
				count2++;
			}
		}
		for(int i =0;i<count0;i++) {
			nums[i]=0;
		}
		for(int i=count0;i<count0+count1;i++) {
			nums[i] =1;
		}
		for(int i=count0+count1;i<nums.length;i++) {
			nums[i]=2;
		}
	}
	 static void sortArray(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int count0=0,count1=0,count2=0;
        for(int i=0;i<n;i++){
            if(arr.get(i)==0){
                count0++;
            }
            else if(arr.get(i)==1){
                count1++;
            }
            else{
                count2++;
            }
        }
        for(int i=0;i<count0;i++){
            arr.set(i,0);
        }
        for(int i=count0;i<count0+count1;i++){
            arr.set(i,1);
        }
        for(int i=count0+count1;i<n;i++){
            arr.set(i,2);
        }
    }
}
