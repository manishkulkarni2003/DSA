package cognizant.arrayDsa;

public class countNoinArr {
	public static void main(String[] args) {
		
		
		int[] arr= {1,2,1,3,4};
		System.out.println(frequency(arr,1));
	
	//the time complexity is linear here and 

	}
	public static int frequency(int[] n,int target) {
		int count =0;
		for(int i=0;i<n.length;i++) {
			if(n[i]==target) {
				count=count+1;
			}
		}
		return count;
	}
}
