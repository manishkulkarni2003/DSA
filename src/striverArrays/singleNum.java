package striverArrays;

import java.util.HashMap;
import java.util.Map;

//return single which appears once and rest twice 
public class singleNum {
	public static void main(String[] args) {
		int [] arr= {2,2,1,1,3,3,4,4,5};
		System.out.println(SingleNumber(arr));
		
		
	}
	//brute force
	static int SingleNumber(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			int num =nums[i];
			int count =0;
			for(int j=0;j<nums.length;j++) {
				if(nums[j] ==num) {
					count++;
			     }
		    }
			if(count ==1) {
				return num;
			}
			
		}
		return -1;
	}
	 static int getSingleElement(int []arr) {
        //size of the array:
        int n = arr.length;

        // Declare the hashmap.
        // And hash the given array:
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }

        //Find the single element and return the answer:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;
    }
	 //optimal Solution
	 static int singleNumber(int[] nums) {
	        int single = 0;
	        for (int num : nums) {
	            single ^= num; // XOR each element
	        }
	        return single;
	    }
}
