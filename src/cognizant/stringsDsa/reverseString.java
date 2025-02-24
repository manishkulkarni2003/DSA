package cognizant.stringsDsa;

public class reverseString {
		
	public static void main(String[] args) {
		String str="Manish";
		
		System.out.println(reverse(str));
	}
	
	public static String reverse(String str) {
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			res=res+str.charAt(i);	
	}
		return res;
	}
}
