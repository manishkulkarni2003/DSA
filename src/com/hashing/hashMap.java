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
		int key=arr[i]; // Current element of the array =2
		int freq=0;//Frequency starts at 0

		if(hm.containsKey(key)) freq=hm.get(key);//if 2(key) is present return freq
			freq++;//if not that means the is first time coming so increase freq
		hm.put(key, freq);//update key and freq
		
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