package striverArrays;
import java.util.*;
public class threeSum {
	
	public static List<List<Integer>> triplet(int n, int[] arr){
		Set<List<Integer>> st=new HashSet<>();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					if(arr[i]+arr[j]+arr[k]==0) {
						List<Integer> temp=Arrays.asList(arr[i],arr[j],arr[k]);
						temp.sort(null);
						st.add(temp);
					}
				}
			}
		}
		List<List<Integer>> ans =new ArrayList<>(st);
		return ans;
	}
	//better Solution
	public static List<List<Integer>> tripletBetter(int n, int[] nums){
		Set<List<Integer>>st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer>hashSet=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int third =-(nums[i]+nums[j]);
                if(hashSet.contains(third)){
                    List<Integer>temp =Arrays.asList(nums[i],nums[j],third);
                    temp.sort(null);
                    st.add(temp);
                }
                hashSet.add(nums[j]);
            }
        }
        List<List<Integer>>ans=new ArrayList<>(st);
        return ans;
	}
	public static List< List < Integer > > tripletOptimal(int n, int []arr) {
        // Write your code here.
        List<List<Integer>>ans =new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(i!=0&&arr[i]==arr[i-1])continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum =arr[i]+arr[j]+arr[k];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }else{
                    List<Integer>temp=Arrays.asList(arr[i],arr[j],arr[k]);
                    ans.add(temp);
                    j++;
                    k--;

                    while(j<k&&arr[j]==arr[j-1]) j++;
                    while(j<k&&arr[k]==arr[k+1]) k--;
                }

            }

        }
        return ans;
    }
	//only working solution
	public static List<List<Integer>> fourSumOptimal(int []nums, int target) {
        // Write your code here.
        int n=nums.length;
        List<List<Integer>>ans =new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0;i<n;i++){
            if(i>0&&nums[i]==nums[i-1])continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1&&nums[j]==nums[j-1])continue;
                int k=j+1;
                int l=n-1;
                while(k<l){
                    long sum=nums[i];
                    sum+=nums[j];
                    sum+=nums[k];
                    sum+=nums[l];
                    if(sum==target){
                        List<Integer>temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        ans.add(temp);
                        k++;
                        l--;

                        while(k<l&&nums[k]==nums[k-1])k++;
                        while(k<l&&nums[l]==nums[l+1])l--;

                    }else if(sum<target)k++;
                    else l--;
                }
            }
        }
        return ans;

    }
}
