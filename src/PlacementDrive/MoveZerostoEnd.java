package PlacementDrive;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerostoEnd {
	
	public static void main(String[] args) {
	
	int[] arr= {1,2,0,0,3,1};
	MoveZerosToEndBrute(arr);
	System.out.println(Arrays.toString(arr));
	
	}
	
	

	public static void moveZeros(int[] arr) {
		
		int j=-1;
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==0) {
				j=i;
				break;
			}
		}
		
		for(int i=j+1;i<arr.length;i++) {
			if(arr[i]!=0) {
				swap(arr[i],arr[j]);
			}
		}
		
		
		
	}
	
	private static void swap(int i,int j) {
		int temp =i;
		i=j;
		j=temp;
	}
	
	//Brute Force
	public static void MoveZerosToEndBrute(int[] arr) {
		ArrayList<Integer> temp=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				temp.add(arr[i]);
			}
		}
		
		int nz=temp.size();
		for(int i=0;i<nz;i++) {
			arr[i]=temp.get(i);
		}
		
		for(int i=nz;i<arr.length;i++) {
			arr[i]=0;
		}
		
		
	}
	
		
}
