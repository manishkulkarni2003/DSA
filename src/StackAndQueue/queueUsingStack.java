package StackAndQueue;
import java.util.*;
class myQueue{
	Stack<Integer> s1=new Stack();
	Stack<Integer> s2=new Stack();
	
	public myQueue() {
		
	}
	void push(int x) {
		while(s1.size()!=0) {
			s2.push(s1.peek());
			s1.pop();
		}
		s1.push(x);
		while(s2.size()!=0) {
			s1.push(s2.peek());
			s2.pop();
		}
	}
	int top() {
		return s1.peek();
	}
	int pop() {
		return s1.pop();
	}
	
}
public class queueUsingStack {

}
