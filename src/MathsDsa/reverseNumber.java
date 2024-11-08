package MathsDsa;

import java.util.Scanner;

public class reverseNumber {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter a Number to reverse");
		int n=sc.nextInt();
		
		
		int revNum = 0;
				
		while(n>0) {
			int lastDigit =n%10;
			n=n/10;
			revNum =(revNum *10)+lastDigit;
		}
		System.out.println(revNum);
	}

public int reverse(int x) {
        int OrginalNUm =x;
        int revNum =0;
        x=Math.abs(x);
        while(x>0){
            int lastDigit=x%10;
           
            x=x/10;
            revNum =(revNum * 10)+lastDigit;
        }
        if(OrginalNUm<0){
            revNum=-revNum;
            return revNum;
        }
        return revNum;
    
}
class Solution {
    public int reverse2(int x) {
        int revNum = 0;
        
        while (x != 0) {
            int lastDigit = x % 10;
            x = x / 10;
            
            // Check for overflow before adding lastDigit
            if (revNum > Integer.MAX_VALUE / 10 || (revNum == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0; // Overflow condition for positive numbers
            }
            if (revNum < Integer.MIN_VALUE / 10 || (revNum == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0; // Overflow condition for negative numbers
            }
            
            revNum = (revNum * 10) + lastDigit;
        }
        
        return revNum;
    }
}

	
}
