package dsa.interviewPrep;

import java.util.ArrayList;
import java.util.List;

/*In a Distant Kingdom,a wise King has A Chest full of magical Numbers
 * he Decides to Reward the most observant mathematician in the land.
 * Your Task is to analyse a list of these Numbers and identify
 * which ones contain even number of digits.The king Believs That only
 * numbers with an even number of digits hold the key to unlock the hidden 
 *treasures of the kingdom can you help identify these numbers for the King 
 * 
 * Input :123,4567,89,1001,22
 * output:4567,89,1001,22
 * 
 * 
 * 
 * */

public class FindNumwithEvenDigits {
	public static void main(String[] args) {
	
		int[] number = {123,99,89,1001};
		System.out.println(findNumwithEvenNumber(number));
	
	}
	//Not Works for List But Created the Helper Function
	static boolean hasEvenDigits(int n) {
		int count=0;
		
		while(n>0) {
			count =count+1;
			n=n/10;
		}
		return count % 2 ==0;
	}
	static List<Integer> findNumwithEvenNumber(int[] numbers){
		List<Integer> res= new ArrayList<>();
		for(int num :numbers) {
			if(hasEvenDigits(num)) {
				res.add(num);
			}
		}
		return res;
	}
}
