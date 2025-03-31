package LinkedList;

import java.util.Stack;

public class reverseLinkedList {
	public static Node reverseLLBrute(Node head) {
		Node temp=head;
		Stack<Integer> st=new Stack<>();
		while(temp!=null) {
			st.push(temp.data);
			temp=temp.next;
		}
		temp=head;
		while(temp!=null) {
			temp.data=st.peek();
			st.pop();
			temp=temp.next;
		}
		return head;
	}
	public static Node reverseOptimal(Node head) {
		if(head==null||head.next==null) {
			return head;
		}
		Node temp=head;
		Node prev=null;
		while(temp!=null) {
			Node front=temp.next;
			temp.next=prev;
			prev=temp;
			temp=front;
		}
		return prev;
	}
	public static Node reverseRecursive(Node head) {
		if(head==null||head.next==null) {
			return head;
		}
		Node newNode=reverseRecursive(head.next);
		Node front=head.next;
		front.next=head;
		head.next=null;
		
		return newNode;
		
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		Node head=Node.LinkedList.convert2Arr(arr);
		head=reverseRecursive(head);
		Node.LinkedList.print(head);
	}
}
