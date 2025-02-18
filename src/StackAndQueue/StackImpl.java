package StackAndQueue;

public class StackImpl {
	
	int top=-1;
	int[] Stack =new int[10];
	
	public void push(int n) {
		if(top>10) {
			System.out.println("Stack is Full");
		}
		top=top+1;
		System.out.println(top);
		Stack[top]=n;
	}
	public void pop() {
		if(top==-1) {
			System.out.println("Stack is Empty");
		}
		top=top-1;
		
	}
	public int top() {
		if(top==-1) {
			System.out.println("No Elements Present");
		}
		return Stack[top];
	}
	public int size() {
		return top+1;
	}
	
	public static void main(String[] args) {
		
		StackImpl obj =new StackImpl();
		
		obj.push(6);
		System.out.println(obj.toString());
		obj.pop();
		
		
	}
	
	
}
