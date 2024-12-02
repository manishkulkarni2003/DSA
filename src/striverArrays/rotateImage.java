package striverArrays;

import java.util.Arrays;

public class rotateImage {
	
	
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		image(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+"");
			}
			System.out.println();
		}
	}
	//optimal solution
	
	static void image(int[][] mat) {
		int n =mat.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int temp =mat[i][j];
				mat[i][j]=mat[j][i];
				mat[j][i]=temp;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n/2;j++) {
				int temp =mat[i][j];
				mat[i][j]=mat[i][n-j-1];
				mat[i][n-j-1]=temp;
				
			}
		}
		
		
	}
}
