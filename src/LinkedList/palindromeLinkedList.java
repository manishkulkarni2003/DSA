package LinkedList;

import java.util.Stack;

public class palindromeLinkedList {
	public static boolean palindromeBrute(Node head) {
		if(head==null||head.next==null) {
			return true;
		}
		Node temp=head;
		Stack<Integer> st=new Stack<>();
		while(temp!=null) {
			st.push(temp.data);
			temp=temp.next;
		}
		temp=head;
		while(temp!=null) {
			if(temp.data!=st.peek()) {
				return false;
			}
			temp=temp.next;
			st.pop();
		}
		return true;
	}
	public static boolean palindromeOptimal(Node head) {
		if(head==null||head.next==null) {
			return true;
		}
		Node fast=head;
		Node slow=head;
		while(fast.next!=null&&fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		Node newHead=reverseLinkedList.reverseOptimal(slow.next);
		Node first=head;
		Node second=newHead;
		while(second!=null) {
			if(first.data!=second.data) {
				reverseLinkedList.reverseOptimal(newHead);
				return false;
			}
			first=first.next;
			second=second.next;
		}
		reverseLinkedList.reverseOptimal(newHead);
		return true;
		
		
	}
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,2,1};
		Node head=Node.LinkedList.convert2Arr(arr);
		if(palindromeOptimal(head)) {
			System.out.println("The Linked List is Palindrome");
		}else {
			System.out.println("Given LL is Not a Palindrome");
		}
	}
}
