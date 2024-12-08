package LinkedList;

import java.util.Arrays;

//Creation of the Linked List 
public class Node {
	//atrributes
	int data;
	Node next;
	//constructor
	Node(int data1,Node next1){
		this.data=data1;
		this.next=next1;
				
	}
	Node(int data1){
		this.data=data1;
		this.next=null;
	}
	public static class LinkedList{
		//first Question Arr to Linked List
		private static Node convert2Arr(int[] arr) { 
			Node head =new Node(arr[0]);
			Node mover =head;
			for(int i =1;i<arr.length;i++) {
				Node temp= new Node(arr[i]);
				mover.next=temp;
				mover =temp;
		}
		return head;
	}
		//Length of a Linked List
		static int LengthOfLL(Node head) {
			int count =0;
			Node current =head;
			while(current!=null) {
				
				current=current.next;
				count++;
			}
			return count;
		}
		//Search an Element in Linked List
		static int checkIfPresent(Node head,int target) {
			Node temp =head;
			while(temp!=null) {
				if(temp.data==target) {
					return 1;
				}
				temp=temp.next;
				
			}
			return 0;
		}
	public static void main(String[] args) {
		
		int[] arr= {2,34,55,66};
		Node head =convert2Arr(arr);
		System.out.println(head.data);
		
		//Travsersing the LL
		Node current =head;
		while(current!=null) {
			System.out.println(current.data+" ");
			current=current.next;
		}
		System.out.println("Length of LL");
		System.out.println(LengthOfLL(head));
		System.out.println(checkIfPresent(head,66));
		
		
		
	}

	}
}
