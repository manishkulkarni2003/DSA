package cognizant.arrayDsa;
import java.util.HashMap;
import java.util.Map.Entry;
public class majorityElement {
	public static void main(String[] args) {
		
		int[] arr= {1,2,2,2,3,4,2};
		System.out.println(majorElementBetter(arr));
		
	}
	public static int majorityElement(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int count =0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==arr[i]) {
					count++;
				}
			}
			if(count>arr.length/2) {
				return arr[i];
			}
		}
		return -1;
		
	}
	public static int majorElementBetter(int[] arr) {
		int n=arr.length;
		
		HashMap<Integer,Integer> mpp=new HashMap<>();
		for(int i=0;i<n;i++) {
			int value =mpp.getOrDefault(arr[i], 0);
			mpp.put(arr[i], value+1);
			
		}
		
		for(Entry<Integer, Integer> it:mpp.entrySet()) {
		   if(it.getValue()>(n/2)) {
			   return it.getKey();
		   }
		}
		
		return -1;
		
		
	}
	//Optimal Solution will be Seen Soon
}
