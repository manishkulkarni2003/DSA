package striverArrays;

public class buySellStock {
	public static void main(String[] args) {
		int[] arr= {7,1,5,3,6,4};
		System.out.println(stockOptimal(arr));
		
		
	}
	//brute force
	static int stockBrute(int[] arr) {
		int maxPro=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					maxPro=Math.max(arr[j]-arr[i],maxPro);
				}
			}
		}
		return maxPro;
	}
	//optimal Solution 
	static int stockOptimal(int[] arr) {
		int maxPro=0;
		int minPrice=Integer.MAX_VALUE;
		for(int i =0;i<arr.length;i++) {
			minPrice =Math.min(minPrice, arr[i]);
			maxPro=Math.max(maxPro,arr[i]-minPrice );
		}
		return maxPro;
	}
	
}
