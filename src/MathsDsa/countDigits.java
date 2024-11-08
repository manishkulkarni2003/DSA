package MathsDsa;

public class countDigits {
	
	public static void main(String[] args) {
		int a =7789;
		System.out.println(countDigits(a));
	
	}
	    
	
	public static int countDigits(int n){
	        // Write your code here.
	        int count =0;
	        while(n>0){
	            int lastDigit=n%10;
	            count =count+1;
	            n=n/10;
	        }
	        return count;
	    }
	}


