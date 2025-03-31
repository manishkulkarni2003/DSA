package LinkedList;

import java.util.ArrayList;



public class segregateOddEven {
	public static Node oddEvenBrute(Node head) {
		if(head==null||head.next==null) {
			return head;
		}
		ArrayList<Integer> arr=new ArrayList<>();
		Node temp=head;
		while(temp!=null&&temp.next!=null) {
			arr.add(temp.data);
			temp=temp.next.next;
		}
		if(temp!=null) {
			arr.add(temp.data);
		}
		
		temp=head.next;
		while(temp!=null&&temp.next!=null) {
			arr.add(temp.data);
			temp=temp.next.next;
		}
		if(temp!=null) {
			arr.add(temp.data);
		}
		
		int i=0;
		temp=head;
		while(temp!=null) {
			temp.data=arr.get(i);
			i++;
			temp=temp.next;
		}
		
		return head;
		
	}
	public static Node oddEvenOptimal(Node head) {
		if(head==null||head.next==null) {
			return head;
		}
		Node odd=head;
		Node even=head.next;
		Node evenHead=even;
		while(even!=null &&even.next!=null) {
			odd.next=even.next;
			odd=odd.next;
			even.next=odd.next;
			even=even.next;
			
		}
		odd.next=evenHead;
		
		return head;
	}
	
	public static void main(String[] args) {
		
		int[] arr= {1,3,4,2,5,6};
		Node head=Node.LinkedList.convert2Arr(arr);
		head=oddEvenOptimal(head);
		Node.LinkedList.print(head);
	
	}
	//odd.next=even.next;
//	odd=odd.next;
//	even.next=odd.next;
//	even=even.next;
	
}
