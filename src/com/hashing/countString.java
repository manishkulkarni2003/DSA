package com.hashing;

public class countString {
	public static void main(String[] args) {
		
		String str = "sassab";
		char ch = 'b';
		
		System.out.println(countStr(str,ch));
		
		}
	static int countStr(String str,char find) {
		int count =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == find ) {
				count =count+1;
			}
		}
		return count;
	}
}
