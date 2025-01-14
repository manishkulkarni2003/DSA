package dsa.interviewPrep;

import java.util.Arrays;
import java.util.Comparator;

/*
 * A peculiar list of words has been found, where each word contains an embedded number
indicating its position in the correct order. Your task is to rearrange the words in the correct order
based on these embedded numbers. For example, "is2" and "Th1is" should be placed in the
correct sequence based on their numbers. Can you sort the list and reveal the correct sequence
of words?
Constraints:
● The length of the list is 1≤n≤1000
● Each word contains exactly one digit indicating its position (1-9).
  Sample Input:
["is2", "a3", "Th1is"]
Sample Output:
This is a
Explanation:
The word "This" contains 1, so it comes first, followed by "is" and then "a".
  */
public class sortWordsBasedOnEmbedNum {
		
	
	public static void main(String[] args) {
		
		String [] str= {"is2","a3","Th1is"};
		System.out.println(sortWordsBasedOnEmbeddedNumbers(str));
	
	}
	
	
	
	
	public static String sortWordsBasedOnEmbeddedNumbers(String [] str) {
		
		Arrays.sort(str,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				int num1=extractNumber(o1);
				int num2=extractNumber(o2);
				return Integer.compare(num1, num2);
				
			}
			
			
		});
		return String.join("",str);

		
		
	}
	
	private static int extractNumber(String str) {
		for(char word :str.toCharArray()) {
			if(Character.isDigit(word)) {
				return Character.getNumericValue(word);
			}
		}
		return -1;
	}
	
	
}
