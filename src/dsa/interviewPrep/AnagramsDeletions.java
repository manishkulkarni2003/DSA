package dsa.interviewPrep;

import java.util.Arrays;

public class AnagramsDeletions {
	public static void main(String[] args) {
	
		
		System.out.println(MindeletionAna("cdefhxy","abcehzw"));
		 
		
		
		
	}
	
	//TODO
	public static int MindeletionAna(String str1,String str2) {
		
		int[] freq1=new int[26];
		int[] freq2 =new int[26];
		
		for(char c:str1.toCharArray()) {
			freq1[c-'a']++;
		}
		for(char c:str2.toCharArray()) {
			freq2[c-'a']++;
		}
		int deletions =0;
		
		for(int i =0;i<26;i++) {
			deletions+=Math.abs(freq1[i]-freq2[i]);
		}
		return deletions;
	}
	
	public static boolean AnagramCheker(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		char[] sArray=str1.toCharArray();
		char[] tArray=str2.toCharArray();
		
		Arrays.sort(sArray);
		Arrays.sort(tArray);
		
		return Arrays.equals(sArray, tArray);
	}
}
