package LinkedList;

public class midlleOfLL {
	public static void main(String[] args) {
	int[] arr= {1,2,3,4,5};
	Node head=Node.LinkedList.convert2Arr(arr);
	head=middleEleOptimal(head);
	Node.LinkedList.print(head);
	
	}
	public static Node middleNode(Node head) {
		if(head==null||head.next==null) {
			return head;
		}
		Node temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		
		
		int midNode=count/2+1;
		temp=head;
		while(temp!=null) {
			midNode=midNode-1;
			if(midNode==0) {
				break;
			}
			temp=temp.next;
		}
		return temp;
	}
	public static Node middleEleOptimal(Node head) {
		if(head==null||head.next==null) {
			return head;
		}
		Node slow=head;
		Node fast=head;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
}
