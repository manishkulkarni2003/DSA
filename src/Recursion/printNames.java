package Recursion;

public class printNames {
	public static void main(String[] args) {
		name(1);
		
	}
	static void name(int count) {
		
		System.out.println("Manish");
		
		if(count>5) {
			return;
		}
		else {
			name(count+1);
		}
	}
}
