package TwoPointer_Sliding_Window_problems;
import java.util.*;
public class longestSubStringWithoutRepeatingCharacters {
	public static void main(String[] args) {
		
		String str="cabdzabcd";
		System.out.println(lengthOfLongestSubstring(str));
		
		
	}
	
	//optimal
	public static int lengthOfLongestSubstringOptimal(String s) {
		HashMap<Character,Integer>mpp=new HashMap<>();
		
		
		int l=0;
		int r=0;
		int maxLen=0;
		int n=s.length();
		while(r<n) {
			if(mpp.containsKey(s.charAt(r))) {
				l=Math.max(mpp.get(s.charAt(r))+1, l);
			}
			mpp.put(s.charAt(r), r);
			maxLen=Math.max(maxLen, r-l+1);
			r++;
		}
		return maxLen;
		
		
	}
	//brute Force
	public static int lengthOfLongestSubstring(String s) {
		// Write your code here.
		if(s.length()==0){
			return 0;
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<s.length();i++){
			Set<Character>se=new HashSet<>();
			for(int j=i;j<s.length();j++){
				if(se.contains(s.charAt(j))){
					max=Math.max(max,j-i);
					break;
				}

				se.add(s.charAt(j));
			}
		}
		return max;
		
	}
	
	
}
