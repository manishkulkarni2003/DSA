package cognizant.arrayDsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class unionOfArr {
	public static void main(String[] args) {
	
		int[] a= {1,2,1,3,4};
		int n=5;
		int[] b= {3,2,1,5,6};
		int m=5;
		System.out.println(FindUnion(a, b, n, m));
	
	}
	public static ArrayList<Integer> findUnion(int[]a,int[]b,int n,int m){
		HashMap<Integer,Integer> freq=new HashMap<>();
		ArrayList<Integer> union =new ArrayList<>();
		
		//Frequency of the arr one 
		for(int i=0;i<n;i++) {
			freq.put(a[i], freq.getOrDefault(a[i],0)+1);
			
		}
		
		for(int i=0;i<m;i++) {
			freq.put(b[i], freq.getOrDefault(b[i],0)+1);
			
		}
		//keySet is Iterating Over the Keys
		for(int it:freq.keySet()) {
			union.add(it);
		}
		
		return union;
		
		
	}
	public static ArrayList<Integer> findUnionBetterSolution(int[]a,int[]b,int n,int m){	
		HashSet<Integer> hash=new HashSet<>();
		ArrayList<Integer> union=new ArrayList<>();
		//We can use hashset instead of Hashmap Because we are storing the elements
		//We donot Require the frequency
		for(int i =0;i<n;i++) {
			hash.add(a[i]);
		}
		
		for(int i=0;i<m;i++) {
			hash.add(b[i]);
		}
		
		for(int it:hash) {
			union.add(it);
		}
		
		Collections.sort(union);  //hashset has no order of returning the Elements
		return union;
		
		
	}
	//this Solution is With Duplicates 
	//optimal solution is required  //Video Required
	static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
		   int i = 0, j = 0; // pointers
		  ArrayList<Integer > Union=new ArrayList<>(); // Uninon vector
		  while (i < n && j < m) {
		    if (arr1[i] <= arr2[j]) // Case 1 and 2
		    {
		      if (Union.size() == 0 || Union.get(Union.size()-1) != arr1[i])
		        Union.add(arr1[i]);
		      i++;
		    } else // case 3
		    {
		      if (Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
		        Union.add(arr2[j]);
		      j++;
		    }
		  }
		  while (i < n) // IF any element left in arr1
		  {
		    if (Union.get(Union.size()-1) != arr1[i])
		      Union.add(arr1[i]);
		    i++;
		  }
		  while (j < m) // If any elements left in arr2
		  {
		    if (Union.get(Union.size()-1) != arr2[j])
		      Union.add(arr2[j]);
		    j++;
		  }
		  return Union;
		}
}
