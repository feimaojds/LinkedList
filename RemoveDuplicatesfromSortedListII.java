package leecode;

public class RemoveDuplicatesfromSortedListII {

	
public ListNode deleteDuplicates(ListNode head) {
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode pre = start,cur = start.next;
        while(cur!=null){
        	while(cur.next!=null && cur.val == cur.next.val){
        		cur = cur.next;
        	}
        	if(pre.next == cur){
        		pre = pre.next;
        	}else{
        		pre.next = cur.next;
        	}
        	cur = cur.next;
        }
        return start.next;
    }

class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
}
