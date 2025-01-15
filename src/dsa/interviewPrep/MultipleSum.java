package dsa.interviewPrep;

public class MultipleSum {
		
	public static void main(String[] args) {
		
		System.out.println(multipleSum(12));
		
	}
	
	public static int multipleSum(int n) {
		int sum=0;
		for(int i =0;i<=10;i++) {
			int temp =n*i;
			sum+=temp;
			
		}
		return sum;
		
	}
	
	
	
}
