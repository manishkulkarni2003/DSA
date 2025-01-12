package dsa.interviewPrep;

import java.util.Arrays;

/*The function accepts an integers sum and an integer array arr of size n. Implement the 
function to find the pair, (arr[j], arr[k]) where j!=k, Such that arr[j] and arr[k] are the least 
two elements of array (arr[j] + arr[k] <= sum) and return the product of element of this pair
NOTE
* Return -1 if array is empty or if n<2
* Return 0, if no such pairs found
* All computed values lie within integer range
Example
Input
sum:9
size of Arr = 7
Arr:5 2 4 3 9 7 1
Output
2
Explanation
Pair of least two element is (2, 1) 2 + 1 = 3 < 9, Product of (2, 1) 2*1 = 2. Thus, output is 2
Sample Input
sum:4
size of Arr = 6
Arr:9 8 3 -7 3 9
Sample Output
-21
 * */


public class productSmallestPair {
	
	public static void main(String[] args) {
	
		int[] arr= {9, 8 ,3 ,-7 ,3, 9};
		System.out.println(productSmallPairOptimal(9,arr));
		
	}
	
	//Better Solution-->O(n)
	public static int productSmallPair(int sum,int[] arr) {
		 if (arr == null || arr.length < 2) {
		        return -1;
		    }
		
		int least=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<least) {
				least=arr[i];
			}
			
		}
		
		int secondLeast=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=least && arr[i]<secondLeast) {
				secondLeast=arr[i];
			}
			
		}
		
		if(least+secondLeast<=sum) {
			return least*secondLeast;
		}
		return 0;
		
	}
	
	//Optimal Solution-->O(nlogn)  //not Quite Optimal as we Are Using Sorting But Yeah better solution than O(n)
	public static int productSmallPairOptimal(int sum,int[]arr) {
		if (arr == null || arr.length < 2) {
	        return -1;
	    }
		
		Arrays.sort(arr);
		
		int least=arr[0];
		int secondLeast=arr[1];
		
		if(least+secondLeast<=sum) {
			return least*secondLeast;
		}
		return 0;
		
		
		
		
	}
	
}
