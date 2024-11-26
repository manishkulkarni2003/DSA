package striverArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class rearrangeArrays {
  public static void main(String[] args) {
	  
	  ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,-2,-3,-6,2,7));
	  System.out.println(rearrangeOptimal(arr));
	  
	  
  }
  static int[] rearrange(int[] arr) {
	  int n=arr.length;
	  ArrayList<Integer> pos=new ArrayList<>();
	  ArrayList<Integer> neg=new ArrayList<>();
	  
	  for(int i =0;i<n;i++) {
		  if(arr[i]>0) {
			  pos.add(arr[i]);
		  }
		  else {
			  neg.add(arr[i]);
		  }
	  }
	  for(int i=0;i<n/2;i++) {
		  arr[2*i]=pos.get(i);
		  arr[2*i+1]=neg.get(i);
	  }
	  return arr;
  }
  static ArrayList<Integer> rearrangeOptimal(ArrayList<Integer>arr){
	  int n=arr.size();
	  ArrayList<Integer> ans =new ArrayList<>(Collections.nCopies(n, 0));
	  int posIndex=0;
	  int negIndex=1;
	  for(int i=0;i<n;i++) {
		  if(arr.get(i)<0) {
			  ans.set(negIndex,arr.get(i));
			  negIndex+=2;
			  
		  }
		  else {
			  ans.set(posIndex, arr.get(i));
			  posIndex+=2;
		  }
	  }
	  return ans;
  }
}
