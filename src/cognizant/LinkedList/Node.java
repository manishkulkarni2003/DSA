package cognizant.LinkedList;

//Created Our Own Data Type
public class Node{
  int data;
  Node next;
  Node(int data1,Node next1){
      this.data=data1;
      this.next=next1;
  }
  Node(int data1){
      this.data=data1;
      this.next=null;
  }
  public class LinkedList{
	  
  
  public static void print(Node head){
      while(head!=null){
          System.out.println(head.data+" ");
          head=head.next;
      }
  }
  public static Node insertHead(Node head,int val){
      Node temp=new Node(val,head);
      return temp;
  }
  public static Node deleteHead(Node head){
      if(head==null){
          return null;
      }
      head =head.next;
      return head;
  }
  public static Node deleteTail(Node head){
      if(head==null||head.next==null){
          return null;
      }
      Node temp=head;
      while(temp.next.next!=null){
          temp=temp.next;
      }
      temp.next=null;
      return head;
  }
  public static Node deleteK(Node head,int k){
      if(head==null){
          return head;
          
      }
      if(k==1){
          head=head.next;
          return head;
      }
      int count=0;
      Node temp=head;
      Node prev=null;
      while(temp!=null){
          count++;
          if(count==k){
              prev.next=prev.next.next;
              break;
          }
          prev=temp;
          temp=temp.next;
      }
      return head;
      
      
  }
  
  
  public static void main(String[] args){
      int[] arr={1,2,4,5,7,8,9};
      Node head=new Node(arr[0]);
      head.next=new Node(arr[1]);
      head.next.next=new Node(arr[2]);
      head.next.next.next=new Node(arr[3]);
      head.next.next.next.next=new Node(arr[4]);
      System.out.println("Successfully Added the Elements in the Linked List");
      print(head);
      System.out.println("Replaced the head");
      head=insertHead(head,arr[3]);
      print(head);
      System.out.println("deleted the Tail of the LInked List");
      head=deleteTail(head);
      print(head);
       System.out.println("deleted the Head of the LInked List");
       head=deleteHead(head);
       print(head);
       System.out.println("Deleting the Kth Element in the Linked List");
       head =deleteK(head,2);
       print(head);
      
      
  }
  }
}
