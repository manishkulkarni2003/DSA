package cognizant.Pyq;

public class subArrOf3 {
	public static void main(String[] args) {
		int[] arr={1,2,1,3,5,2,4,2};
		System.out.println(subArrCount(arr));
		
	}
	public static int subArrCount(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length-2;i++) {
			int first=arr[i];
			int second=arr[i+1];
			int third=arr[i+2];
			
			if(first+third==second) {
				sum++;
			}
		}
		return  sum;
		
	}
}
