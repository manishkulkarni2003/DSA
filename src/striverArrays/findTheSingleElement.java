package striverArrays;

import java.util.HashMap;
import java.util.Map;

//find unique element in an arr
public class findTheSingleElement {
	public static void main(String[] args) {
		int[]arr= {1,1,2,3,3,4,4};
		System.out.println(getSingleElementBetter(arr));
		
	}
	public static int singleElement(int[]arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int num=arr[i];
			int count=0;
			for(int j=0;i<n-1;j++) {
				if(arr[j]==num) {
					count++;
				}
			}
			if(count==1) {
				return num;
			}
		}
		return -1;
	}
	public static int getSingleElementBetter(int []arr) {
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
	public static int getSingleElementOptimal(int []arr) {
        //size of the array:
        int n = arr.length;

        // XOR all the elements:
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }
}
