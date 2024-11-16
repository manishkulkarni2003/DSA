package striverArrays;

import java.util.HashMap;

public class longestSubArrayWithPosAndNeg {
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,-1,4,3};
		int k=3;
		System.out.println(subArraySum(arr,k));
		
	}
	
	
	//optimal solution
	static int subArraySum(int[] arr,int k) {
		int n =arr.length;
		long sum=0;
		int maxlen=0;
		HashMap<Long,Integer> preSumMap=new HashMap<>();
		for(int i =0;i<n;i++) {
			sum+=arr[i];
			
			if(sum ==k) {
				maxlen =Math.max(maxlen,i+1);
			}
			long rem =sum-k;
			if(preSumMap.containsKey(rem)) {
				int len = i - preSumMap.get(rem);
                maxlen = Math.max(maxlen, len);
			}
			if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
			
		}
		return maxlen;
	}
}
