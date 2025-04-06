package striverArrays;
import java.util.*;
public class fourSome {
	
	
	//not an Ideal Solution
	public static List<List<Integer>> fourSum(int []nums, int target) {
        // Write your code here.
        Set<List<Integer>>st=new HashSet<>();
        for(int i=0;i<nums.length;i++){

            for(int j=i+1;j<nums.length;j++){
                Set<Long>hashset=new HashSet<>();

                for(int k=j+1;j<nums.length;k++){
                    long sum=nums[i]+nums[j];
                    sum+=nums[k];
                    long fourth=target-sum;
                    if(hashset.contains(fourth)){
                        List<Integer>temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add((int)fourth);
                        temp.sort(Integer::compareTo);
                        st.add(temp);
                    }
                    hashset.add((long)nums[k]);
                }
            }
        }
        List<List<Integer>>ans=new ArrayList<>(st);
        return ans;

    }
}
