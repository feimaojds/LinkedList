package leecode;

public class LinkedListCycleII {
	
	
public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next !=null && fast.next.next !=null){
        	slow = slow.next;
        	fast = fast.next.next;
        	if(slow == fast){
        		ListNode slow2 = head;
        		while(slow != slow2){
        			slow = slow.next;
        			slow2 = slow2.next;
        		}
        		return slow2;
        	}
        }
        return null;
    }


class ListNode {
	      int val;
	      ListNode next;
	     ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
}
