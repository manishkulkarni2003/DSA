package cognizant.mathsDsa;

import java.util.ArrayList;
import java.util.Collections;

//find the kth largest factor mean first find factors of the number
//ex 12 all factors then find the if kth = 2nd largest to be find
public class kthLargestFactor {
	public static void main(String[] args) {
	
		System.out.println(LargestFactor(12, 2));
	
	}
	public static int LargestFactor(int n,int k) {
		ArrayList<Integer> factors=new ArrayList<>();
		//find factors and add it to the arraylist
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				factors.add(i);
			}
		}
		//sort it in descending order
		Collections.sort(factors,Collections.reverseOrder());
		//if k is more than the factors size return
		if(k>factors.size()) {
			return 1;
		}
		//k=2 so index starts from 0 so we put k-1
		return factors.get(k-1);
		
	}
}
