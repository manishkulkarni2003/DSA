package striverArrays;
import java.util.*;
public class majorityElementll {
	public static void main(String[] args) {
		
		int[] arr= {1,1,1,3,3,2,2,2};
		System.out.println(majorElement(arr));
		
		
	}
	//brute Force
	public static List<Integer> majorElement(int[] arr){
		int n=arr.length;
		List<Integer> ls=new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(ls.size()==0||ls.get(0)!=arr[i]) {
				int count=0;
				for(int j=0;j<n;j++) {
					if(arr[j]==arr[i]) {
						count++;
					}
				}
				if(count>n/3) {
					ls.add(arr[i]);
				}
			}
			if(ls.size()==2)break;
		}
		return ls;
	}
	//better solution //but what the fuck it not the better Lmoa ded my ass Compilers
	public static List< Integer > majorityElement(int []v) {
        // Write your code here
        int n=v.length;
        List<Integer>ls =new ArrayList<>();

        HashMap<Integer,Integer>mpp=new HashMap<>();

        int mini=(int)(n/3)+1;

        for(int i=0;i<n;i++){
            int value=mpp.getOrDefault(v[i],0);
            mpp.put(v[i],value+1);

            if(mpp.get(v[i])==mini){
                ls.add(v[i]);
            }
            if(ls.size()==2) break;
        }
        return ls;
    }
}
