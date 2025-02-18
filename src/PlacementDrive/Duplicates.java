package PlacementDrive;

import java.util.Arrays;
import java.util.HashSet;

public class Duplicates {
	public static void main(String[] args) {
		
		int[]arr= {1,2,2,4,3,5,5};
		DuplicatesNum(arr);
		
	}
	
	public static void DuplicatesNum(int[]arr) {
		
		Arrays.sort(arr);
		HashSet<Integer> duplicates=new HashSet<>();
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				duplicates.add(arr[i+1]);
			}
		}
		
		if(duplicates.isEmpty()) {
			System.out.println("No Duplicates");
		}
		else {
			System.out.println("Duplicate Numbers are"+duplicates);
		}
		
	}
	
	
}
