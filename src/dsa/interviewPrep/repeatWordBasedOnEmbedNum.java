package dsa.interviewPrep;

public class repeatWordBasedOnEmbedNum {
	
	public static void main(String[] args) {
	
	String[] str= {"Hello2","h3","Manish4"};
	
	System.out.println(repeatWordBasedOnEmbedNumber(str));
	
	}
	
	
	
	public static String repeatWordBasedOnEmbedNumber(String[] str) {
		
		StringBuilder result =new StringBuilder();
		
		
		for(String word:str) {
			int Num=extractNumber(word);

			String baseWord =extarctBaseWord(word);
			
			result.append(baseWord.repeat(Num)).append("");
			
		}
		return result.toString().trim();
		
	}
	
	
	private static int extractNumber(String str) {
		
		
		for(char ch :str.toCharArray()) {
			if(Character.isDigit(ch)) {
				return Character.getNumericValue(ch);
				

			}
		}

       
		return -1;
	}
	
	private static String extarctBaseWord(String str) {
		StringBuilder baseword =new StringBuilder();
		
		for(char ch :str.toCharArray()) {
			if(!Character.isDigit(ch)) {
				baseword.append(ch);
			}
		}
		return baseword.toString();
	}
	
}
