package leecode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
	
public boolean isPalindrome(ListNode head) {
	     if(head == null || head.next ==null) return true;
	     ListNode slow = head,fast = head;
	     while(fast!=null&&fast.next!=null){
	    	 slow = slow.next;
	    	 fast = fast.next.next;
	     }
	     if(fast!=null) slow = slow.next;
	     ListNode reverse = reverseLinked(slow);
	     while(reverse!=null){
	    	 if(reverse.val!=head.val) return false;
	    	 head = head.next;
	    	 reverse = reverse.next;
	     }
	     return true;
	 
    }

public static ListNode reverseLinked(ListNode head){
	  ListNode reverseNode = null;
	  while(head!=null){
		  ListNode temp = head.next;
		  head.next = reverseNode;
		  reverseNode = head;
		  head = temp;
	  }
	  return reverseNode;
}

public static void main(String[] args) {
	ListNode l1 = new ListNode(0);
	ListNode l2 = new ListNode(0);
	l1.next = l2;
	new PalindromeLinkedList().isPalindrome(l1);
}


static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
}
