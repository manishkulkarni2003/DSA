package cognizant.mathsDsa;

public class swapWithoutVariable {
	public static void main(String[] args) {
	
		int a =5;
		int b=4;
		swap(a,b);
	
	}
	public static void swap(int a ,int b) {
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+" "+b);
	}
}
/*Step-by-Step Dry Run
Initial Values:
ini
Copy code
a = 5   (Binary:  0101)
b = 4   (Binary:  0100)
Step 1: a = a ^ b
ini
Copy code
a = 5 ^ 4  (0101 ^ 0100)  
a = 1      (0001 in binary)
Step 2: b = a ^ b
ini
Copy code
b = 1 ^ 4  (0001 ^ 0100)
b = 5      (0101 in binary) ✅ b is now 5
Step 3: a = a ^ b
ini
Copy code
a = 1 ^ 5  (0001 ^ 0101)
a = 4      (0100 in binary) ✅ a is now 4
Final Values:
ini
Copy code
a = 4
b = 5
✅ Swapping is successfully done without using extra space! 🎯

Complete Dry Run Table
Step	a (Decimal)	a (Binary)	b (Decimal)	b (Binary)
Start	5	0101	4	0100
a = a ^ b	1	0001	4	0100
b = a ^ b	1	0001	5	0101
a = a ^ b	4	0100	5	0101*/
