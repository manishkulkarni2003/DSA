package cognizant.stringsDsa;

public class SumOfNuminStr {

	public static void main(String[] args) {
	String str="123abc11";
	System.out.println(sumOfNumInString(str));
		
	}
	public static int sumOfNumInString(String str) {
		int sum=0;
		String tempSum="0";
		
		for(int i =0;i<str.length();i++) {
			char ch =str.charAt(i);
			if(Character.isDigit(ch)) {
				tempSum+=ch;
			}else{
				sum+=Integer.parseInt(tempSum);
				tempSum="0";
			}
		}
		return sum+Integer.parseInt(tempSum);
		
		
	} 
	//medium Level Question in codeStudio where i have Solved it
	
	
}






//You’re collecting digits in tempSum as a string.
//When you hit a non-digit (a), you convert tempSum ("12") to an integer and add it to sum.
//You reset tempSum and repeat this process for other digit sequences.
//At the end of the loop, there’s a chance that the last characters were digits — like the "5" in the example above. But when the loop finishes, you haven’t yet added those digits to sum.
//
//That’s why this line at the end is essential:
//
//java
//Copy
//Edit
//return sum + Integer.parseInt(tempSum);
//It ensures that any remaining number collected in tempSum is also added to the total sum.
//
//Why can’t we just return sum?
//Because sum only gets updated when a non-digit is encountered. If the last character(s) in the string are digits, those wouldn’t get added otherwise.
//
//For example, without that last addition:
//
//Input: "12abc34d5"
//sum would only be 12 + 34 = 46.
//But you’d miss out on "5", and the correct sum (51) wouldn’t be returned.
