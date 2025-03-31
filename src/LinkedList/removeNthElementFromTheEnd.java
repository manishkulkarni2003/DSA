package LinkedList;

public class removeNthElementFromTheEnd {
	
	public static Node removeEleNth(Node head,int n) {
		int count=0;
		Node temp=head;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		if(count==n) {
			Node newHead=head.next;
			return newHead;
		}
		
		int res=count-n;
		temp=head;
		while(temp!=null) {
			res--;
			if(res==0) break;
			
			temp=temp.next;
		}
		Node delNode=temp.next;
		temp.next=temp.next.next;
		
		return head;
		
	}
	public static Node removeNthOptimal(Node head,int n) {
		Node fast=head;
		Node slow=head;
		
		for(int i=0;i<n;i++) {
			fast=fast.next;
		}
		if(fast==null) {
			return head.next;
		}
		
		while(fast.next!=null) {
			fast=fast.next;
			slow=slow.next;
		}
		Node delNode=slow.next;
		slow.next=slow.next.next;
		delNode=null;
		return head;
	}
	
	public static void main(String[] args) {
	int[] arr= {1,2,3,4,5};
	Node head=Node.LinkedList.convert2Arr(arr);
	
	head=removeNthOptimal(head, 2);
	Node.LinkedList.print(head);
	
	}
}
