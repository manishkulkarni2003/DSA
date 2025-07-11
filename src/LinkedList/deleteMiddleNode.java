package LinkedList;

public class deleteMiddleNode {
	public static void main(String[] args) {
	}
	public static Node deleteMiddle(Node head) {
		if(head==null &&head.next==null)return head;
		int n=0;
		Node temp=head;
		while(temp!=null) {
			n++;
			temp=temp.next;
			
		}
		int res=n/2;
		temp=head;
		
		
		while(temp!=null) {
			res--;
			if(res==0) {
				temp.next=temp.next.next;
				break;
			}
			temp=temp.next;
		}
		return head;
	}
}
