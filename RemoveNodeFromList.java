package leecode;

public class RemoveNodeFromList {

public ListNode removeNthFromEnd(ListNode head, int n) {
 ListNode start = new ListNode(0);
           start.next = head;
           ListNode slow = start,fast = start;
           while(n-->=0){
        	   fast = fast.next;
           }
           while(fast!=null){
        	   slow = slow.next;
        	   fast = fast.next;
           }
           slow.next = slow.next.next;
           return start.next;
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
