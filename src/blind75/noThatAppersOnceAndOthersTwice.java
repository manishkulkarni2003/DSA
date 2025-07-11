package blind75;

import java.util.HashMap;
import java.util.Map;

public class noThatAppersOnceAndOthersTwice {
	public static void main(String[] args) {
		int[] arr= {1,1,2,3,4,3,4};
		System.out.println(appersOnce(arr));
		
		
	}
	public static int appersOnce(int[] arr) {
		
		HashMap<Integer,Integer> mpp=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			mpp.put(arr[i], mpp.getOrDefault(arr[i],0)+1);
			
		}
		for(Map.Entry<Integer, Integer>it:mpp.entrySet()) {
			if(it.getValue()==1) {
				return it.getKey();
						
			}
		}
		return -1;
	}
}
