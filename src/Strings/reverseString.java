package Strings;

public class reverseString {
	public static void main(String[] args) {
		
		String name ="Manish";
		System.out.println(reverseOptimal(name));
		
	}
	static String reverse(String s) {
		
		String reversed ="";
		
		for(int i =s.length()-1;i>=0;i--) {
			reversed =reversed+s.charAt(i);
		}
		return reversed;
	}
	static String reverseOptimal(String str) {
		StringBuilder reversed =new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			reversed.append(str.charAt(i));
		}
		return reversed.toString();
	}
}
