package leecode;

import java.util.Stack;

public class ReverseLinkedList {
public ListNode reverseList(ListNode head) {
	   ListNode reverseLastNode = null;
	   while(head!=null){
		   ListNode temp = head.next;
		   head.next = reverseLastNode;
		   reverseLastNode = head;
		   head = temp;
	   }
	   return reverseLastNode;
    }


class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
}
