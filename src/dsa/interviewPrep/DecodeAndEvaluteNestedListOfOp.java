//package dsa.interviewPrep;
//
//import java.util.Stack;
//
//public class DecodeAndEvaluteNestedListOfOp {
//	
//	public static int DecodeAndEvaluteNestedListOfOperation(String[] str) {
//		
//		Stack<Integer> stack =new Stack<>();
//		
//		for(char ch:str.toString().toCharArray()) {
//			
//			if(Character.isDigit(ch)) {
//				int num =extractNumber(ch);
//				stack.push(num)
//			}else if(isOperator(ch)) {
//				char op =findOperator(ch);
//				stack.push(ch);
//			}else {
//				stack.push(ch);
//			}
//		}
//		
//		
//	}
//	
//	static int extractNumber(String str) {
//		
//		for(char ch:str.toCharArray()) {
//			if(Character.isDigit(ch)) {
//				return Character.getNumericValue(ch);
//			}
//		}
//		return -1;
//	}
//	public static char findOperator(String input) {
//        for (char ch : input.toCharArray()) {
//            if (isOperator(ch)) {
//                return ch; // Return the operator as soon as it is found
//            }
//        }
//        return '\0';
//	}
//	public static boolean isOperator(char ch) {
//        // Check for common mathematical operators
//        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%';
//    }
//	
//}
