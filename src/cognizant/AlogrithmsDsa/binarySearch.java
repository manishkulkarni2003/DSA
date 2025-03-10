package cognizant.AlogrithmsDsa;

public class binarySearch {
	public static void main(String[] args) {
		
		int[] arr= {1,4,5,6,7,8};
		int x=7;
		System.out.println(binarySearch(arr,x));
		
		
		
	}
	public static int binarySearch(int[]arr, int x) {
		int start =0;
		int end=arr.length-1;
		
		while(start<=end) {
//			int mid =start+end/2; might be possible that it can exceed range of int
		int mid =start +(end-start)/2; //within the range
		
		if(x <arr[mid]) {
			end =mid-1;
			
		}else if(x>arr[mid]) {
			start=mid+1;
		}
		else {
			return mid;
		}
		}
		
		return -1;
	}
	
	//agnostic binarySearch
}
