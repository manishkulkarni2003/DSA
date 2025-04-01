package LinkedList;

import LinkedList.Node.LinkedList;

public class addOnetoLinkedList {
	public static void main(String[] args) {
		int[] arr= {9,9,9,9};
		Node head=Node.LinkedList.convert2Arr(arr);
		head=addOneToLLOptimal(head);
		Node.LinkedList.print(head);
		
	}
	
	
	public static Node addOneToLL(Node head) {
		 head=reverseLinkedList.reverseOptimal(head);
		 Node temp=head;
		 int carry=1;
		 while(temp!=null) {
			 temp.data=temp.data+carry;
			 if(temp.data<10) {
				 carry=0;
				 break;
			 }else {
				 temp.data=0;
				 carry=1;
			 }
			 temp=temp.next;
		 }
		 if(carry==1) {
			 Node newHead=new Node(1);
			 head=reverseLinkedList.reverseOptimal(head);
			 newHead.next=head;
			 return newHead;
		 }
		 head=reverseLinkedList.reverseOptimal(head);
		 return head;
		
	}
	public static Node addOneToLLOptimal(Node head) {
		int carry=backtracking(head);
		if(carry==1) {
			Node newHead=new Node(1);
			newHead.next=head;
			return newHead;
		}
		return head;
	}
	public static int backtracking(Node temp) {
		if(temp==null) {
			return 1;
		}
		int carry=backtracking(temp.next);
		temp.data=temp.data+carry;
		if(temp.data<10) {
			return 0;
		}
		temp.data=0;
		return 1;
	}
}
