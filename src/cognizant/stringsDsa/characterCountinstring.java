package cognizant.stringsDsa;

public class characterCountinstring {
	
	public static void main(String[] args) {
		
		String str="Speeeeeed";
		char find='e';
		System.out.println(freq(str,find));
		
	}
	//Again the DrawBack is it is Linear time COmplexity
	public static int freq(String str,char find) {
		
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==find) {
				count=count+1;
			}
		}
		return count;
	}
}
