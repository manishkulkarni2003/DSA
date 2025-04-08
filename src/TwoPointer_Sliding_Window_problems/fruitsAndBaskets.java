package TwoPointer_Sliding_Window_problems;
import java.util.*;
public class fruitsAndBaskets {
	public static void main(String[] args) {
	}
	public static int fruitsBasketBrute(int[] arr) {
		int maxLen=0;
		for(int i=0;i<arr.length;i++) {
			Set<Integer>st=new HashSet<>();
			for(int j=i;j<arr.length;j++) {
				st.add(arr[j]);
				if(st.size()<=2) {
					maxLen=Math.max(maxLen, j-i+1);
				}else {
					break;
				}
			}
		}
		return maxLen;
	}
	//better Solution
	public int totalFruitBetter(int[] fruits) {
	    int l = 0;
	    int r = 0;
	    int maxLen = 0;
	    HashMap<Integer, Integer> mpp = new HashMap<>();

	    while (r < fruits.length) {
	        mpp.put(fruits[r], mpp.getOrDefault(fruits[r], 0) + 1);

	        while (mpp.size() > 2) {
	            mpp.put(fruits[l], mpp.get(fruits[l]) - 1);
	            if (mpp.get(fruits[l]) == 0) {
	                mpp.remove(fruits[l]);
	            }
	            l++;
	        }

	        maxLen = Math.max(maxLen, r - l + 1);
	        r++;
	    }

	    return maxLen;
	}
	//optimal Solution
	public static int findMaxFruits(int []arr, int n) {
        // Write your code here.
        int l=0,r=0,maxLen=0;
        HashMap<Integer,Integer>mpp=new HashMap<>();
        while(r<n){
            mpp.put(arr[r],mpp.getOrDefault(arr[r],0)+1);
            if(mpp.size()>2){
                mpp.put(arr[l],mpp.get(arr[l])-1);
                if(mpp.get(arr[l])==0){
                    mpp.remove(arr[l]);
                }
                l++;
            }
            if(mpp.size()<=2){
                maxLen=Math.max(maxLen,r-l+1);
            }
            r++;
        }
        return maxLen;

    }
}
