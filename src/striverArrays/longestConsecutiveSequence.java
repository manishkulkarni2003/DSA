package striverArrays;

import java.util.Arrays;

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
			else if(arr[i]-1!=lastSmaller) {
				count =1;
				lastSmaller=arr[i];
			}
			longest =Math.max(longest, count);
		}
		return longest;
		
	}
}
