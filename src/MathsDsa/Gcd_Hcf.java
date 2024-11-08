package MathsDsa;

public class Gcd_Hcf {
public static void main(String[] args) {
	int n1=20;
	int n2=32;
	Gcd(n1,n2);

}
 static void Gcd(int n1,int n2) {
	 for(int i =1;i<=n1;i++) {
		 if(n1 %i ==0 && n2%i ==0) {
			 System.out.println(i);
			 
		 }
	 }
 }

}

