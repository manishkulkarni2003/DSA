package cognizant.arrayDsa;


import java.util.HashSet;

public class removeDuplicates {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,2,3,4,4,5,6};
		int k= removeDuplicatesOptimalSolution(arr);
		System.out.println("The Array After Removing Duplicates");
		for(int i =0;i<k;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	

	public static int duplicate(int[] arr) {
		//assuming the array is Sorted
		
		HashSet<Integer> hs=new HashSet<>();
		
		for(int i =0;i<arr.length;i++) {
			hs.add(arr[i]);
		}
		int k=hs.size();
		
		int j=0;
		//iterate through the original elements andcopy the hashset to the og array
		//using for each loop here
		for(int x:hs) {
			arr[j++]=x;
		}
		return k;
		
	}
	public static int removeDuplicatesOptimalSolution(int[] arr) {
		if(arr.length==0) return 0;
		
		int i=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[i]!=arr[j]) {
				i++;
				arr[i]=arr[j];
			}
		}
		return i+1;
		
		
		
	}
	
}
