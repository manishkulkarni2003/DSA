package cognizant.arrayDsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class intersectionOfArray {
	
	public static void main(String[] args) {
	
		int[] a= {1,2,3,4,5};
		int[] b= {2,3,4,5};
		ArrayList<Integer> ans=intersection(a, b);
		
		for(int i=0;i<ans.size();i++) {
			System.out.println(ans.get(i));
			
		}
		
		System.out.println(Arrays.toString(intersectionBetter(a,b)));
	
	}
	
	
	public static ArrayList<Integer> intersection(int[] a,int[] b){
		
		
		ArrayList<Integer> ans=new ArrayList<>();
		
		int[] visited =new int[b.length];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i] == b[j] && visited[j]==0) {
					ans.add(b[j]);
					visited[j]=1;
					
					break;
				}else if(b[j]>a[i]) break;
			}
		}
		return ans;
		
		
	}
	//Optimised Solution
	public static int[] intersectionBetter(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        // Add all elements of nums1 to set1
        for(int num : nums1) {
            set1.add(num);
        }

        // Check if nums2 elements exist in set1 — if yes, add to resultSet
        for(int num : nums2) {
            if(set1.contains(num)) {
                resultSet.add(num); // Ensures only distinct elements are added
            }
        }

        // Convert HashSet to int array
        int[] result = new int[resultSet.size()];
        int i = 0;
        for(int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }
	
}
