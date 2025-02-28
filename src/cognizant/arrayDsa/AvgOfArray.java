package cognizant.arrayDsa;

public class AvgOfArray {

	public static void main(String[] args){
		int[] arr={1,2,3,4,5};
		System.out.println(avgOfarr(arr));

	}
	//Man So many errors with this Code
	public static int avgOfarr(int[]arr){

	int avg=0;
	int n=arr.length;
	int sum =0;
	for(int i =0;i<n;i++){
		sum+=arr[i];
	}

	avg=sum/n;
	return avg;

	}
}
