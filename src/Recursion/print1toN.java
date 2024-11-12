package Recursion;

public class print1toN {
	public static void main(String[] args) {
		
		PrintNum(1,10);
		PrintNumRev(5,5);
	}
	static void PrintNum(int i,int n) {
		if(i>n) {
			return;
		}
		System.out.println(i);
		
		PrintNum(i+1,n);
		
	}
	static void PrintNumRev(int i,int n) {
		if(i<1) {
			return;
		}
		System.out.println(i);
		PrintNumRev(i-1,n);
	}
}
