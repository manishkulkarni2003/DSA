package striverArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveSequence {
	public static void main(String[] args) {
		
		int[] arr= {100,101,102,4,2,1,3};
		System.out.println(LongestConsecutiveSeq(arr));
		
		
	}
	//utility Functions
	static boolean LinearSearch(int[] arr,int num) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				return true;
			}
		}
		return false;
	}
	
	static int LongestConsecBrute(int[] arr) {
		int longest =1;
		for(int i=0;i<arr.length;i++) {
			int x=arr[i];
			int count =1;//1+1=2
			//100 100+1=101==true 
			while(LinearSearch(arr,x+1)==true) {
				x+=1;
				count+=1;
			}
			longest=Math.max(longest, count);
		}
		return longest;
	}
	
	
	static int LongestConsecutiveSeq(int[] arr) {
		int n=arr.length;
		if(n==0) return 0;
		Arrays.sort(arr);
		int lastSmaller =Integer.MIN_VALUE;
		int count =0;
		int longest=1;
		for(int i=0;i<n;i++) {
			if(arr[i]-1==lastSmaller) {
				count+=1;
				lastSmaller=arr[i];
			}
			else if(arr[i]!=lastSmaller) {
				count =1;
				lastSmaller=arr[i];
			}
			longest =Math.max(longest, count);
		}
		return longest;
		
	}
	public static int longestSuccessiveElements(int[] a) {
        int n = a.length;
        if (n == 0)
            return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}
