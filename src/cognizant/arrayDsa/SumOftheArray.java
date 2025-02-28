package cognizant.arrayDsa;
//Sum of the Array Question 
public class SumOftheArray {

	public static void main(String[] args){

		int [] arr={1,2,3,4,5};
		System.out.println(sumOfArr(arr));

		}
	//brute Force Solution And Probable the Ideal Solution
		public static int sumOfArr(int[]arr){

		int sum=0;
		int n=arr.length;
		for(int i=0;i<n;i++){
		sum+=arr[i];
		}
		return sum;


		}

}
