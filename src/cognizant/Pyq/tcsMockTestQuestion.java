package cognizant.Pyq;
//find Nth Prime Number Solution
public class tcsMockTestQuestion {
	
	public static void main(String[] args) {
	
	System.out.println(findNthPrime(7));
	
	}
	
	public static int findNthPrime(int n) {
        if (n <= 0) return -1; // Invalid input

        int count = 0;
        int num = 2;

        while (count < n) {
            if (isPrime(num)) {
                count++;
            }
            if (count == n) {
                return num;
            }
            num++;
        }
        return -1;
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
