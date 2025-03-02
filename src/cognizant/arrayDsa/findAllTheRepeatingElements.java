package cognizant.arrayDsa;

import java.util.Arrays;
//Also Find Duplicates Some
public class findAllTheRepeatingElements {
	public static void main(String[] args) {
		
		int[] arr= {1,2,1,2,3,4};
		
		repeatingElementsBetter(arr);
		
	}
	public static void repeatingElementsBrute(int[] arr) {
		int count =0;
		
		int [] dup=new int[arr.length];
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					dup[count++]=arr[i];
				}
			}
		}
		System.out.println("Elements Which are Duplicates");
		for(int i=0;i<count;i++) {
			if(dup[i]!=dup[i+1]) {
				System.out.println(dup[i]+" ");
			}
		}
	}
	//better Solution 
	public static void repeatingElementsBetter(int[] arr) {
		Arrays.sort(arr);//O(n)
		
		for(int i=0;i<arr.length-1;i++) {//O(n)
			if(arr[i]==arr[i+1]) {
				System.out.println(arr[i]+" ");
			}
		}
	}
	//Optimal Solution
	//use and HashMap in the Striver Website //will solve later 
}
