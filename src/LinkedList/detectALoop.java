package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class detectALoop {
	public static void main(String[] args) {
	
	}
	public static boolean detectLoop(Node head) {
		Node temp=head;
		Map<Node,Integer> mpp=new HashMap<>();
		
		while(temp!=null) {
			if(mpp.containsKey(temp)) {
				return true;
			}
			mpp.put(temp, 1);
			temp=temp.next;
			
		}
		return false;
	}
	public static boolean detectLoopOptimal(Node head) {
		Node slow=head;
		Node fast=head;
		while(fast!=null&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}
}
