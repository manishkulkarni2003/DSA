package striverArrays;
import java.util.*;
public class countSubArrXor {
	public static int subarraysWithSumKBetter(int []a, int b) {
        // Write your code here
        int n=a.length;
        int count=0;

        for(int i=0;i<n;i++){
            int xor=0;
            for(int j=i;j<n;j++){
                xor=xor^a[i];

                if(xor==b){
                    count++;
                }
            }
        }
        return count;

    }
	public static int subarraysWithSumKOptimal(int []a, int b) {
        // Write your code here
        int n=a.length;
        Map<Integer,Integer>mpp=new HashMap<>();
        int count=0;
        int xor=0;
        mpp.put(xor,1);
        for(int i=0;i<n;i++){
            xor=xor^a[i];
            int x=xor^b;

            if(mpp.containsKey(x)){
                count+=mpp.get(x);
            }

            if(mpp.containsKey(xor)){
                mpp.put(xor,mpp.get(xor)+1);
            }else{
                mpp.put(xor,1);
            }

        }
        return count;
        

    }
}
