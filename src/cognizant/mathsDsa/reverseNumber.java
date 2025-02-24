package cognizant.mathsDsa;

public class reverseNumber {
	public static void main(String[] args) {
		
		System.out.println(reverseNum(123));
		
	}
	
	public static int reverseNum(int num) {
		
		int reverse=0;
		
		while(num>0) {
			int rem=num%10;
			num=num/10;
			reverse=(reverse*10)+rem;
			}
		return reverse;
		
	}

}
