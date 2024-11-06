package binarySearch;

public class orderAgnosticBinarySearch {

	public static void main(String[] args) {
	int[] arr= {90,75,18,12,6,4,3,2};
	int target=75;
	System.out.println(search(arr,target));
	
	int[] arr2= {1,3,5,6,9,12,14,20,33};
	int target2=20;
	System.out.println(search(arr2,target2));
	
	}
	
	static int search(int[]arr,int target) {
		int start=0;
		int end =arr.length-1;
		//find whether arr 
		boolean isAsc;
		if(arr[start]<arr[end]) {
			isAsc=true;
		}
		else {
			isAsc=false;
		}
		
		while(start<=end) {
				int mid =start +(end-start)/2;
				if(arr[mid] == target) {
					return mid;
				}
				if(isAsc) {
				if(target<arr[mid]) {
					end=mid-1;
				}
				else if(target>arr[mid]) {
					start=mid+1;
				}
				
			}else {
				if(target>arr[mid]) {
					end =mid-1;
				}else if(target<arr[mid]) {
					start =mid+1;
				}
			}
		}
		
		return -1;
	}
	
	}
