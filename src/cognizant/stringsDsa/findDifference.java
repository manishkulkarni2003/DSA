package cognizant.stringsDsa;

import java.util.Arrays;

public class findDifference {
	public static void main(String[] args) {
		
		
		String s="abcd";
		String t="abcde";
		System.out.println(findDiffOptimal(s, t));
	}
	
	public static char finddiff(String str,String t) {
		int[] count=new int[26];
		
		for(char c:t.toCharArray()) {
			count[c-'a']++;
		}
		for(char c:str.toCharArray()) {
			count[c-'a']--;
		}
		for(int i=0;i<26;i++) {
			if(count[i]!=0) {
				return (char)(i+'a');
			}
		}
		return ' ';
	}
	public static char findDiffOptimal(String s,String t) {
		
		char []sArr=s.toCharArray();
		
		char[] tArr=t.toCharArray();
		
		Arrays.sort(sArr);
		Arrays.sort(tArr);
		
		for(int i=0;i<sArr.length;i++) {
			if(sArr[i]!=tArr[i]) {
				return tArr[i];
			}
		}
		return tArr[tArr.length-1];
		
		
		
	}
}
