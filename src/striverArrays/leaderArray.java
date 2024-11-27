package striverArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leaderArray {
public static void main(String[] args) {
	ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(10,22,12,3,0,6));
	System.out.println(Superior(arr));
	
	int [] arr1= {10,22,12,2,0,6};
	System.out.println(superiorOptimal(arr1));
	
	
}
static ArrayList<Integer> Superior(ArrayList<Integer> arr){
	
	ArrayList<Integer> ans=new ArrayList<>();
	for(int i =0;i<arr.size();i++) {
		boolean leader =true;
		for(int j=i+1;j<arr.size();j++) {
			if(arr.get(j)>arr.get(i)) {
				leader =false;
				break;
			}
		}
		if(leader ==true) {
			ans.add(arr.get(i));
		}
	}
	return ans;
}
//optimal solution for this is 
static List<Integer> superiorOptimal(int[] arr){
	
	int n=arr.length;
	List<Integer> ans =new ArrayList<>();
	int maxi =arr[n-1];
	ans.add(arr[n-1]);
	for(int i=n-2;i>=0;i--) {
		if(arr[i]>maxi) {
			ans.add(arr[i]);
			maxi=arr[i];
		}
	}
	return ans;
}
}
