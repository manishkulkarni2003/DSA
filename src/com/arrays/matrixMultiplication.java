package com.arrays;
import java.util.*;
public class matrixMultiplication {
	public static void main(String[] args){
	    Scanner sc =new Scanner(System.in);
	    int[][] arr1=new int[3][3];
	    int[][]arr2=new int[3][3];
	    int[][] sum=new int[3][3];
	    
	    System.out.println("Enter the Values for Matrix One");
	    for(int i=0;i<3;i++){
	        for(int j=0;j<3;j++){
	            arr1[i][j]=sc.nextInt();
	        }
	    }
	    System.out.println("Enter the Values for Matrix Two");
	    for(int i=0;i<3;i++){
	        for(int j=0;j<3;j++){
	            arr2[i][j]=sc.nextInt();
	        }
	    }
	    System.out.println("The sum of the Matrix is");
	    for(int i=0;i<3;i++){
	        for(int j=0;j<3;j++){
	            sum[i][j]=arr1[i][j]*arr2[i][j];
	            System.out.println(sum[i][j]+" ");
	        }
	        System.out.println();
	    }
	    sc.close();
	    
	}
}
