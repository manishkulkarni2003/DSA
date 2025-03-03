package cognizant.arrayDsa;

import java.util.HashMap;

public class findAllSymmetricPairs {
	public static void main(String[] args) {
		
		int [][] arr= {{1,2},{2,1},{3,4},{4,5},{5,4},{4,3}};
		SymmetricPairsBetter(arr);
	}
	
	//brute force approach
	public static void symmetricPairs(int[][] arr) {
		System.out.println("The Symmetric Pairs are");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j][0]==arr[i][1] &&arr[i][0]==arr[j][1]) {
					System.out.println("("+arr[i][1]+" "+arr[i][0]+")"+" ");
					break;
				}
			}
		}
		
		
	}
	public static void SymmetricPairsBetter(int[][] arr) {
		
		HashMap<Integer,Integer> mp =new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			int first=arr[i][0];
			int second =arr[i][1];
			
			if(mp.get(second)!=null&& mp.get(second)==first) {
				System.out.println("("+first+" "+second+")"+" ");
			}else {
				mp.put(first, second);
			}
		}
	}
}
