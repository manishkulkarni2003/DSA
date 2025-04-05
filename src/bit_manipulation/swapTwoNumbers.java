package bit_manipulation;

import java.util.Arrays;

public class swapTwoNumbers {
	public static void main(String[] args) {
		int a=5;
		int b=6;
		System.out.println(Arrays.toString(swapNumber(a,b)));
		
	}
	public static int[] swapNumber(int x, int y) {
		// Write your code here.
		x=x^y;
		y=x^y;
		x=x^y;
		int[] arr=new int[2];
		arr[0]=x;
		arr[1]=y;
		return arr;
	}
}
