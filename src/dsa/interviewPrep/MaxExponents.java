package dsa.interviewPrep;

public class MaxExponents {
		
	public static void main(String[] args) {
	
	System.out.println(MaxExponent(13, 17));
	}
	
	
	private static int count(int i) {
		int count =0;
		while(i%2==0 && i!=0) {
			count+=1;
			i=i/2;//Because it will Check for 8 Supposse
			//so the next Number is 4 it is Also Divided by 2
			//next is 2
		}
		return count;//count=3
	}
	
	
	public static int MaxExponent(int a ,int b) {
		int max=0;
		int num=0;
		
		
		for(int i =a;i<=b;i++) {
			int temp=count(i);
			if(temp>max) {
				max=temp;
				num=i;
			}
		}
		return num;
	}
}
