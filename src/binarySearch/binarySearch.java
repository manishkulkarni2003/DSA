package binarySearch;

public class binarySearch {
	public static void main(String[] args) {
	
		int[] arr= {2,3,5,7,8,9,16,18};
		int target=9;
		int ans =search(arr,target);
		System.out.println(ans);
	}
	static int search(int[] arr,int target) {
		int start =0;
		int end=arr.length-1;
		
		while(start<=end) {
//			int mid =start+end/2; might be possible that it can exceed range of int
		int mid =start +(end-start)/2; //within the range
		
		if(target <arr[mid]) {
			end =mid-1;
			
		}else if(target>arr[mid]) {
			start=mid+1;
		}
		else {
			return mid;
		}
		}
		
		return -1;
	}
}
