package LinkedList;

public class sort0s1s2s {
	
	public static Node sortZerosOnesTwo(Node head) {
		Node temp=head;
		int cnt0=0;
		int cnt1=0;
		int cnt2=0;
		while(temp!=null) {
			if(temp.data==0) {
				cnt0++;
			}else if(temp.data==1) {
				cnt1++;
			}else if(temp.data==2) {
				cnt2++;
			}
			
			temp=temp.next;
		}
		temp=head;
		while(temp!=null) {
			if(cnt0!=0) {
				temp.data=0;
				cnt0--;
			}else if(cnt1!=0) {
				temp.data=1;
				cnt1--;
			}else if(cnt2!=0) {
				temp.data=2;
				cnt2--;
			}
			temp=temp.next;
		}
		
		return head;
	}
	
	
	public static void main(String[] args) {
	int[] arr= {1,0,1,2,0,2,1};
	Node head=Node.LinkedList.convert2Arr(arr);
//	Node.LinkedList.print(head);
	head=sortZerosOnesTwo(head);
	Node.LinkedList.print(head);
	
	}
}
