package com.conditonals;

public class counting_occurance {

	//Q4-->count the number of occurances 
	//ex:n=137587347 how many times is 7 is ocurring in this n
	public static void main(String[] args) {
		int n =4555536; //given input
		
		int count =0; // This variable keeps track of how many times the digit 5 has appeared in n. Initially, it is set to 0.
		while(n>0) {
			int rem =n%10;//continously iterate till 
			if(rem==5) {//this condition statisfy;
				count++;//counts the occurance
			}
			n=n/10;//n = n / 10;: This statement removes the last digit from n. For example, if n is 4555536,
			//after this line, n becomes 455553. This process continues until the number becomes 0
		}
		System.out.println(count);
		
	}
}


//int rem = n % 10;: This statement calculates the remainder when n is divided by 10. It effectively extracts the last digit of the number n. For example, if n is 4555536, rem will be 6 in the first iteration.
//Checking the Condition:
//
//if(rem == 5): This condition checks if the last digit (rem) is equal to 5. If this is true, then the digit 5 has been found, and the count is increased.
//count++: If the condition is satisfied, the count is incremented by 1. This counts the occurrence of the digit 5.