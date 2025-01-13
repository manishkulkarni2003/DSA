package dsa.interviewPrep;

public class reverseNumber {
	
	public static void main(String[] args) {
	
	int num=9978;
	System.out.println(Reverse(num));
	
	
	}
	public static int Reverse(int num) {
		
		int temp=num;
		int reverse=0;
		while(temp!=0) {
			 int lastDigit=temp%10;
			 
			 temp=temp/10;
			 
			 reverse =(reverse*10)+lastDigit;
		}
		
		return reverse;
	}
}
