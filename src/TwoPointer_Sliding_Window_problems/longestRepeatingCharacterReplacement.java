package TwoPointer_Sliding_Window_problems;

public class longestRepeatingCharacterReplacement {
	public static int longestRepeatingSubstringBrute(String str, int k) {
        // Write your code here.
        int maxLen=0;
        for(int i=0;i<str.length();i++){
            int[] hash=new int[26];
            int maxFreq=0;
            for(int j=i;j<str.length();j++){
                hash[str.charAt(j)-'A']++;
                maxFreq=Math.max(maxFreq,hash[str.charAt(j)-'A']);
                int changes=(j-i+1)-maxFreq;
                if(changes<=k){
                    maxLen=Math.max(maxLen,j-i+1);
                }else{
                    break;
                }
            }
        }
        return maxLen;
    }
	public int characterReplacementOptimal(String s, int k) {
        int l=0;
        int r=0;
        int maxLen=0;
        int maxFreq=0;
        int [] hash=new int[26];
        while(r<s.length()){
            hash[s.charAt(r)-'A']++;
            maxFreq=Math.max(maxFreq,hash[s.charAt(r)-'A']);
            while((r-l+1)-maxFreq>k){
                hash[s.charAt(l)-'A']--;
                maxFreq=0;
                for(int i=0;i<25;i++){
                    maxFreq=Math.max(maxFreq,hash[i]);
                }
                l=l+1;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;


    }
}
