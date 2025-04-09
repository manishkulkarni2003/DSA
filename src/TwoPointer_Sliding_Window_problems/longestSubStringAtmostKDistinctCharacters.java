package TwoPointer_Sliding_Window_problems;
import java.util.*;
public class longestSubStringAtmostKDistinctCharacters {
	public static void main(String[] args) {
	}
	public static int getLengthofLongestSubstringBrute(int k, String s) {
		// Write your code here.
		int maxLen=0;
		HashMap<Character,Integer>mpp=new HashMap<>();
		for(int i=0;i<s.length();i++){
			mpp.clear();
			for(int j=i;j<s.length();j++){
				mpp.put(s.charAt(j),mpp.getOrDefault(s.charAt(j),0)+1);

				if(mpp.size()<=k){
					maxLen=Math.max(maxLen,j-i+1);
				}else{
					break;
				}
			}
		}
		return maxLen;
	}
	//better Solution
	public static int getLengthofLongestSubstringBetter(int k, String s) {
		// Write your code here.
		int l=0;
		int r=0;
		int maxLen=0;
		HashMap<Character,Integer>mpp=new HashMap<>();
		while(r<s.length()){
			mpp.put(s.charAt(r),mpp.getOrDefault(s.charAt(r),0)+1);
			while(mpp.size()>k){
				char leftChar=s.charAt(l);
				mpp.put(leftChar, mpp.get(leftChar) - 1);
				if(mpp.get(leftChar)==0){
					mpp.remove(leftChar);
				}
				l++;
			}
			
				maxLen=Math.max(maxLen,r-l+1);
			
			r++;
		}
		return maxLen;
	}
	public static int getLengthofLongestSubstringOptimal(int k, String s) {
		// Write your code here.
		int l=0;
		int r=0;
		int maxLen=0;
		HashMap<Character,Integer>mpp=new HashMap<>();
		while(r<s.length()){
			mpp.put(s.charAt(r),mpp.getOrDefault(s.charAt(r),0)+1);
			if(mpp.size()>k){
				char leftChar=s.charAt(l);
				mpp.put(leftChar, mpp.get(leftChar) - 1);
				if(mpp.get(leftChar)==0){
					mpp.remove(leftChar);
				}
				l=l+1;
			}
			
				maxLen=Math.max(maxLen,r-l+1);
			
			r++;
		}
		return maxLen;
	}
}
