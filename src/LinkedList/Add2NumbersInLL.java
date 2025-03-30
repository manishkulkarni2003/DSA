package LinkedList;

public class Add2NumbersInLL {
	
	public static Node addTwoNumbers(Node num1,Node num2) {
		Node dummyNode =new Node(-1);
		Node current=dummyNode;
		Node temp1=num1;
		Node temp2=num2;
		
		int carry=0;
		while(temp1!=null||temp2!=null) {
			int sum =carry;
			if(temp1 != null) {
				sum+=temp1.data;
				
			}
			if(temp2!=null) {
				sum+=temp2.data;
			}
			Node newNode=new Node(sum%10);
			carry=sum/10;
			current.next=newNode;
			current=current.next;
			
			if(temp1!=null) {
				temp1=temp1.next;
			}
			if(temp2!=null) {
				temp2=temp2.next;
			}
		}
		if(carry!=-1) {
			Node newNode=new Node(carry);
			current.next=newNode;
		}
		
		return dummyNode.next;
	}
	
	public static void main(String[] args) {
	int[] arr1= {2,4,6};
	int[] arr2= {3,8,7};
	
	Node head1=Node.LinkedList.convert2Arr(arr1);
	Node head2=Node.LinkedList.convert2Arr(arr2);
	
	Node.LinkedList.print(head1);
	Node.LinkedList.print(head2);
	
	Node newNode=addTwoNumbers(head1, head2);
	Node.LinkedList.print(newNode);
	
	
	}
}
