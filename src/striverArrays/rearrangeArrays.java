package striverArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class rearrangeArrays {
  public static void main(String[] args) {
	  
	  ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,-2,3,-6,2,7));
	  System.out.println(RearrangebySign(arr,arr.size()));
	  
	  
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
  //varirty2 where pos>neg or neg>pos
  public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A, int n) {
      // Define 2 ArrayLists, one for storing positive 
      // and other for negative elements of the array.
      ArrayList<Integer> pos = new ArrayList<>();
      ArrayList<Integer> neg = new ArrayList<>();

      // Segregate the array into positives and negatives.
      for (int i = 0; i < n; i++) {
          if (A.get(i) > 0)
              pos.add(A.get(i));
          else
              neg.add(A.get(i));
      }

      // If positives are lesser than the negatives.
      if (pos.size() < neg.size()) {

          // First, fill array alternatively till the point 
          // where positives and negatives are equal in number.
          for (int i = 0; i < pos.size(); i++) {
              A.set(2 * i, pos.get(i));
              A.set(2 * i + 1, neg.get(i));
          }

          // Fill the remaining negatives at the end of the array.
          int index = pos.size() * 2;
          for (int i = pos.size(); i < neg.size(); i++) {
              A.set(index, neg.get(i));
              index++;
          }
      }

      // If negatives are lesser than the positives.
      else {
          // First, fill array alternatively till the point 
          // where positives and negatives are equal in number.
          for (int i = 0; i < neg.size(); i++) {
              A.set(2 * i, pos.get(i));
              A.set(2 * i + 1, neg.get(i));
          }

          // Fill the remaining positives at the end of the array.
          int index = neg.size() * 2;
          for (int i = neg.size(); i < pos.size(); i++) {
              A.set(index, pos.get(i));
              index++;
          }
      }
      return A;
  }
}
