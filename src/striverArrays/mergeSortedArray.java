package striverArrays;

import java.util.Arrays;

public class mergeSortedArray {
	public static void main(String[] args) {
		
		long[] arr1 = {1, 4, 8, 10};
        long[] arr2 = {2, 3, 9};
		
        mergeSortedArrBrute(arr1,arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}
	public static void mergeSortedArrBrute(long[] arr1,long[] arr2) {
		int n=arr1.length;
		int m=arr2.length;
		long[] arr3=new long[n+m];
		int left=0,right=0,index=0;
		while(left<n&&right<m) {
			if(arr1[left]<=arr2[right]) {
				arr3[index]=arr1[left];
				left++;
				index++;
			}else {
				arr3[index]=arr2[right];
				index++;
				right++;
			}
		}
		
		while(left<n) {
			arr3[index++]=arr1[left++];
		}
		while(right<m) {
			arr3[index++]=arr2[right++];
		}
		
		for(int i=0;i<n+m;i++) {
			if(i<n) {
				arr1[i]=arr3[i];
			}else {
				arr2[i-n]=arr3[i];
			}
		}
		
	}
	
	    public void merge(int[] nums1, int m, int[] nums2, int n) {
	        int left=n-1;
	        int right=0;
	        while(left>=0&&right<m){
	            if(nums1[left]>nums2[right]){
	                int temp=nums1[left];
	                nums1[left]=nums2[right];
	                nums2[right]=temp;
	                left--;
	                right++;
	            }else{
	                break;
	            }
	        }
	        Arrays.sort(nums1);
	        Arrays.sort(nums2);
	    }
	    public void mergeOptimal(int[] nums1, int m, int[] nums2, int n) {
	        int i = m - 1;           // Last element in nums1 (valid portion)
	        int j = n - 1;           // Last element in nums2
	        int k = m + n - 1;       // Last position in nums1

	        while (i >= 0 && j >= 0) {
	            if (nums1[i] > nums2[j]) {
	                nums1[k--] = nums1[i--];
	            } else {
	                nums1[k--] = nums2[j--];
	            }
	        }

	        // Copy remaining elements of nums2 if any
	        while (j >= 0) {
	            nums1[k--] = nums2[j--];
	        }
	    }
	
}
