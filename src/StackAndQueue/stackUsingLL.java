package StackAndQueue;

class stack{
	class stackNode{
		int data;
		stackNode next;
		stackNode(int d){
			this.data=d;
			this.next=null;
			
		}
	}
	stackNode top;
	int size;
	stack(){
		this.top=null;
		this.size=0;
	}
	public void stackPush(int x) {
		stackNode element =new stackNode(x);
		element.next=top;
		top=element;
		System.out.println("Element Pushed");
		size++;
	}
	public int stackPop() {
		if(top==null) return -1;
		int topData=top.data;
		stackNode temp=top;
		top=top.next;
		size--;
		return topData;
	}
	public int stacktTop() {
		if(top==null) return -1;
		return top.data;
	}
	 public int stackSize() {
		    return size;
		  }
		  public boolean stackIsEmpty() {
		    return top == null;
		  }
		  public void printStack() {
			    stackNode current = top;
			    while (current != null) {
			      System.out.print(current.data + " ");
			      current = current.next;
			    }
			    System.out.println();
			  }
}
public class stackUsingLL {
	public static void main(String args[]) {
	    stack s = new stack();
	    s.stackPush(10);
	    s.stackPush(20);
	    s.printStack();
	    System.out.println("Element popped " + s.stackPop());
	    System.out.println("Element popped " + s.stackPop());
	    System.out.println("Stack size: " + s.stackSize());
	    System.out.println("Stack is empty or not: " + s.stackIsEmpty());

	  }
}
