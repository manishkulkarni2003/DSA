package cognizant.mathsDsa;
//The Magic Number Game
//Story: A magician has a special number trick. 
//He asks his assistant to pick a number, then perform a 
//series of operations:
////
//Double the number
//Add 10 to the result
//Divide the result by 2
//Subtract the original number from the final result
//Write a program to find the "magic number" after 
//performing these steps for any given input number.
//
//Input:
//An integer n (1 ≤ n ≤ 1000)
//
//Output:
//The magic number
//
//Example:
//
//makefile
//Copy
//Edit
//Input: 5  
//Output: 5 



public class magicNumber {
	
	
	public static void main(String[] args) {
		
		int n =12;
		System.out.println(magic(n));
		
	}

	public static int magic(int n) {
		
		int res=2*n;
		res=res+10;
		res=res/2;
		res=res-n;
		
		return res;
		
	}
	
	public static int magicOptimal(int n) {
		return (((2*n)+10)/2)-n;
	}
	
	
}
