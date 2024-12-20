package LinkedList;

import java.util.Arrays;

//Creation of the Linked List 
public class Node {
	// atrributes
	int data;
	Node next;

	// constructor
	Node(int data1, Node next1) {
		this.data = data1;
		this.next = next1;

	}

	Node(int data1) {
		this.data = data1;
		this.next = null;
	}

	public static class LinkedList {
		// first Question Arr to Linked List
		private static Node convert2Arr(int[] arr) {
			Node head = new Node(arr[0]);
			Node mover = head;
			for (int i = 1; i < arr.length; i++) {
				Node temp = new Node(arr[i]);
				mover.next = temp;
				mover = temp;
			}
			return head;
		}

		// Length of a Linked List
		static int LengthOfLL(Node head) {
			int count = 0;
			Node current = head;
			while (current != null) {

				current = current.next;
				count++;
			}
			return count;
		}

		// Search an Element in Linked List
		static int checkIfPresent(Node head, int target) {
			Node temp = head;
			while (temp != null) {
				if (temp.data == target) {
					return 1;
				}
				temp = temp.next;

			}
			return 0;
		}

		private static void print(Node head) {
			while (head != null) {
				System.out.println(head.data + " ");
				head = head.next;
			}
			System.out.println();
		}

		// deleting the head of the Linked List
		static Node deleteHead(Node head) {
			if (head == null)
				return head;
			head = head.next;
			return head;
		}

		private static Node deleteTail(Node head) {
			if (head == null || head.next == null)
				return null;

			Node temp = head;
			while (temp.next.next != null) {
				temp = temp.next;
			}

			temp.next = null;
			return head;

		}

		static Node deleteK(Node head, int k) {
			if (head == null)
				return head;

			if (k == 1) {
				head = head.next;
				return head;
			}
			int count = 0;
			Node temp = head;
			Node prev = null;
			while (temp != null) {
				count++;
				if (count == k) {
					prev.next = prev.next.next;
					break;
				}
				prev = temp;
				temp = temp.next;
			}
			return head;
		}

		public static void main(String[] args) {

			int[] arr = { 2, 34, 55, 66 };
			// Node head =convert2Arr(arr);
			// System.out.println(head.data);

			// Travsersing the LL
			// Node current =head;
			// head =deleteHead(head);
			// print(head);
			//// while(current!=null) {
			// System.out.println(current.data+" ");
			// current=current.next;
			// }
			// System.out.println("Length of LL");
			// System.out.println(LengthOfLL(head));
			// System.out.println(checkIfPresent(head,66));
			Node head = new Node(arr[0]);
			head.next = new Node(arr[1]);
			head.next.next = new Node(arr[2]);
			head.next.next.next = new Node(arr[3]);

			// head =deleteTail(head);
			// head =deleteHead(head);
			head = deleteK(head, 1);
			print(head);
		}

	}
}
// Changes Were Stashed