package striverArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class unionOfArray {
	public static void main(String[] args) {
		
		int[] n1= {1,1,2,3,4,5};
		int n =6;
		int [] n2= {3,4,4,5,6};
		int m=5;
		System.out.println(findUnionBetter(n1,n2,n,m));
		
	}
	static ArrayList<Integer> findUnion(int[] n1,int[] n2,int n,int m){
		HashMap<Integer,Integer> freq=new HashMap<>();
		ArrayList<Integer> union =new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			freq.put(n1[i],freq.getOrDefault(n1[i],0)+1);
			
		}
		
		for(int i=0;i<m;i++) {
			freq.put(n2[i],freq.getOrDefault(n2[i],0)+1);
			
		}
		for(int it :freq.keySet()) {
			union.add(it);
		}
		return union;
	}
	static ArrayList<Integer> findUnionBetter(int[] n1,int[] n2,int n,int m){
		HashSet<Integer> hash =new HashSet<>();
		ArrayList<Integer> Union =new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			hash.add(n1[i]);
		}
		for(int i=0;i<m;i++) {
			hash.add(n2[i]);
		}
		for(int it :hash) {
			Union.add(it);
		}
		Collections.sort(Union);
		return Union;
	}
}	
