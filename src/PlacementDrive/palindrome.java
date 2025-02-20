package PlacementDrive;

public class palindrome {
	public static void main(String[] args) {
	
	int n=777;
	System.out.println(palin(n));
	
	}
	
	public static boolean palin(int num) {
		int temp,rem;
		temp=num;
		int sum=0;
		while(num>0) {
			 rem=temp%10;
			
			sum=(sum*10)+rem;
			num =num/10;
			
		}
		return temp==sum;
	}
}
