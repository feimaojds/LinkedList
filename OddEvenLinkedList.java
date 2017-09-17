package leecode;

public class OddEvenLinkedList {

public ListNode oddEvenList(ListNode head) {
       if(head == null) return head;
       ListNode odd = head,even = odd.next,evenhead = even;
       while(even!=null && even.next!=null){
    	   odd.next = odd.next.next;
    	   odd = odd.next;
    	   even.next = even.next.next;
    	   even = even.next;
       }
       odd.next = evenhead;
       return head;
    }
	
	
	class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
}
