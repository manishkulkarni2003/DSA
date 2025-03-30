package doublyLinkedList;

import java.util.Stack;
import doublyLinkedList.DoublyLinkedList;
public class reverseDLL {
	public static Node reverseBrute(Node head) {
		if(head==null||head.next==null) {
			return head;
		}
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
		Node prev=null;
		Node current =head;
		while(current!=null) {
			prev=current.back;
			current.back=current.next;
			current.next=prev;
			current=current.back;
		}
		return prev.back;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,4,5,6};
		Node head=DoublyLinkedList.ConvertToArr(arr);
		DoublyLinkedList.print(head);
		head=reverseOptimal(head);
		DoublyLinkedList.print(head);
		
		
	}
}
