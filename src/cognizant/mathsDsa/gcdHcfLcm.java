package cognizant.mathsDsa;

public class gcdHcfLcm {
	public static void main(String[] args) {
	System.out.println(findGcd(10,15));
	System.out.println(lcm(10,15));
	}
	//hcf or gcd program
	public static int findGcd(int n1, int n2) {
        // Initialize gcd to 1
        int gcd = 1;

        // Iterate from 1 up to
        // the minimum of n1 and n2
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            // Check if i is a common
            // factor of both n1 and n2
            if (n1 % i == 0 && n2 % i == 0) {
                // Update gcd to the
                // current common factor i
                gcd = i;
            }
        }

        // Return the greatest
        // common divisor (gcd)
        return gcd;
    }
	
	public static int lcm(int a,int b) {
		return (a*b)/findGcd(a,b);
	}
	
}
