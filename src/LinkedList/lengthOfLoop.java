package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class lengthOfLoop {
	public static void main(String[] args) {
			
		
		
		
	}
	public static int lengthOfLoop(Node head) {
		Map<Node,Integer> visitedNode=new HashMap<>();
		
		Node temp=head;
		
		int timer=1;
		while(temp!=null) {
			if(visitedNode.containsKey(temp)) {
				int looplength=timer-visitedNode.get(temp);
				
				return looplength;
				
			}
			
			visitedNode.put(temp, timer);
			temp=temp.next;
			timer++;
		}
		return 0;
	}
	//optimal Solution
	public int countNodesinLoop(Node head) {
        // code here.
       Node slow=head;
       Node fast=head;
       while(fast!=null &&fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
           if(slow==fast) return findLength(slow,fast);
       }
       return 0;
        
        
        
    }
    public static int findLength(Node slow,Node fast){
        int count =1;
        fast=fast.next;
        while(slow!=fast){
            count++;
            fast=fast.next;
        }
        return count;
    }
}
