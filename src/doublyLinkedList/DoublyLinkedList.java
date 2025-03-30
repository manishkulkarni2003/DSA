package doublyLinkedList;


class Node{
	
	int data;
	Node next;
	Node back;
	Node(int data1, Node next1, Node back1) {
		
		this.data = data1;
		this.next = next1;
		this.back = back1;
	}
	Node(int data1){
		this.data=data1;
		this.next=null;
		this.back=null;
	}
	
	
}


public class DoublyLinkedList {
	public static Node ConvertToArr(int[] arr) {
		Node head=new Node(arr[0]);
		Node prev=head;
		for(int i =1;i<arr.length;i++) {
			Node temp =new Node(arr[i],null,prev);
			prev.next=temp;
			prev=temp;
		}
		return head;
	}
	
	//printing the Node
	public static void print(Node head) {
		while (head != null) {
			System.out.println(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
	public static Node DeleteNode(Node head) {
		if(head==null || head.next==null) {
			return null;
		}
		
		Node prev=head;
		head=head.next;
		head.back=null;
		prev.next=null;
		
		return head;
	}
	
	//delete Tail of the Dll
	public static Node DeleteTail(Node head) {
		if(head==null || head.next==null) {
			return null;
		}
		
		Node tail=head;
		while(tail.next!=null) {
			tail=tail.next;
		}
		Node prev=tail.back;
		prev.next=null;
		tail.back=null;
		
		return head;
	}
	public static Node deleteK(Node head,int k) {
		if(head==null) {
			return null;
		}
		int count=0;
		Node temp=head;
		while(temp!=null) {
			count++;
			if(count==k) {
				break;
			}
			temp=temp.next;
		}
		Node prev=temp.back;
		Node front =temp.next;
		if(prev==null && front==null) {
			return null;
		}else if(prev==null) {
			return DeleteNode(head);
		}else if(front==null) {
			return DeleteTail(head);
		}
		
		prev.next=front;
		front.back=prev;
		temp.next=null;
		temp.back=null;
		
		return head;
		
		
	}
	public static void deleteNode(Node temp) {
		Node prev=temp.back;
		Node front=temp.next;
		if(front==null) {
			prev.next=null;
			temp.back=null;
			return;
		}
		prev.next=front;
		front.back=prev;
		temp.next=null;
		temp.back=null;
		
	}
	//Insertion
	public static Node insertHead(Node head,int val) {
		Node newHead=new Node(val,head,null);
		head.back=newHead;
		return newHead;
		
	}
	//Insertion before the Tail of the Linked list
	public static Node insertTail(Node head,int val) {
		if(head.next==null) {
			return insertHead(head, val);
		}
		
		Node tail=head;
		while(tail.next!=null) {
			tail=tail.next;
		}
		Node prev =tail.back;
		Node newNode=new Node(val,tail,prev);
		prev.next=newNode;
		tail.back=newNode;
		

		
		return head;
		
	}
	public static Node insertBeforeKthNode(Node head,int k,int val) {
		if(k==1) {
			return insertHead(head, val);
		}
		Node temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			if(count==k) {
				break;
				
			}
			temp=temp.next;
		}
		Node prev=temp.back;
		Node newNode=new Node(val,temp,prev);
		prev.next=newNode;
		temp.back=newNode;
		
		return head;
	}
	public static void insertBeforeNode(Node node,int val) {
		Node prev=node.back;
		Node newNode =new Node(val,node,prev);
		prev.next=newNode;
		node.back=newNode;
	}
	
	public static void main(String[] args) {
		
		int[] arr={1,2,3,45};
		Node head=ConvertToArr(arr);
		print(head);
//		print(DeleteNode(head));
//		print(DeleteTail(head));
//		head=deleteK(head,1);
//		print(head);
//		deleteNode(head.next);
//		head=insertHead(head, 10);
		head=insertTail(head, 22);
		print(head);
		head =insertBeforeKthNode(head, 2, 33);
		insertBeforeNode(head.next.next, 69);
		print(head);
		
		
	}
	
	
}
