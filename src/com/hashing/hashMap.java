package com.hashing;

import java.util.*;

public class hashMap {
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int n =sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i] =sc.nextInt();
	}
	
	
	HashMap<Integer,Integer> hm =new HashMap<>();
	for(int i =0;i<n;i++) {
		int key=arr[i];
		int freq=0;
		if(hm.containsKey(key)) freq=hm.get(key);
			freq++;
		hm.put(key, freq);
		
	}
	int q;
	q=sc.nextInt();
	while(q-->0) {
		int num;
		num=sc.nextInt();
		if(hm.containsKey(num)) {
			System.out.println(hm.get(num));
		}
		
		else {
			System.out.println(0);
		}
			
	}
}
}