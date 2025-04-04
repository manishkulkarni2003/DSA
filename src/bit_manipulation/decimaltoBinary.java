package bit_manipulation;

import com.arrays.questions.reverse;

public class decimaltoBinary {
	public static void main(String[] args) {
		int n=13;
		System.out.println(binary(n));
	}
	public static String binary(int n) {
		if(n==0) return "0";

        StringBuilder res=new StringBuilder();
        while(n>0){
            res.append(n%2);
            n=n/2;
        }
        return res.reverse().toString();
	}
}
