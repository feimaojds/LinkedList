package leecode;

public class RemoveNodeFromList {

public ListNode removeNthFromEnd(ListNode head, int n) {
//	    int length= 0;
//	    while()
//	    ListNode cur = head;
//	    int count = head.;
//        while(count>0){
//        	cur = cur.next;
//        	count--;
//        }
//	    cur.next = cur.next.next;
//	    return head;
	return new ListNode(0);
    }


static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }

public static void main(String[] args) {
	ListNode head = new ListNode(1);
	ListNode start = new ListNode(0);
    ListNode slow = start, fast = start;
    slow.next = head;
    System.out.println(fast.next == head);
}
}
