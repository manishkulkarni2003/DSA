package MathsDsa;

import java.util.Scanner;

public class palindrome {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number");
	        int num = sc.nextInt();
	        sc.close();

	        if (isPalindrome(num)) {
	            System.out.println("palindrome number");
	        } else {
	            System.out.println("not palindrome");
	        }
	    }

	    public static boolean isPalindrome(int num) {
	        int rem, sum = 0, temp;
	        temp = num;

	        while (num > 0) {
	            rem = num % 10;
	            sum = (sum * 10) + rem;
	            num = num / 10;
	        }
	        return temp == sum;
	    }
	}

