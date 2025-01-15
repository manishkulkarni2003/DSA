package dsa.interviewPrep;

public class calculate {
	
	public static void main(String[] args) {
	
		System.out.println(Calculate(12, 50));
	
	}
	
	public static int Calculate(int m,int n) {
		int num=0;
		int sum=0;
		for(int i=m;i<=n;i++) {
			
			if(i%3==0 && i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}
}
