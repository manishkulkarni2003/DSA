package cognizant.arrayDsa;

import java.util.HashMap;

public class uniqueElement {
	public static void main(String[] args) {
		int[]arr= {5,2,3,2,3};
		System.out.println(uniqueElementBrute(arr));
		
		
	}
	public static int uniqueElement(int[] arr) {
		int unique=0;
		for(int num:arr) {
			unique^=num;
		}
		return unique;
	}
	public static int uniqueElementBrute(int[] arr) {
		HashMap<Integer,Integer> mpp=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			mpp.put(arr[i], mpp.getOrDefault(arr[i],0)+1);
		}
		
		for(int num:arr) {
			if(mpp.get(num)==1) {
				return num;
			}
		}
		return -1;
		
	}
}
