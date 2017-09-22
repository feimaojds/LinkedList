package leecode;

import java.util.Stack;

public class AddTwoNumbersII {
	
	
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	       Stack<ListNode> stack1 = new Stack<ListNode>();
	        Stack<ListNode> stack2 = new Stack<ListNode>();
	        while(l1 !=null) {
	        	stack1.push(l1);
	        	l1 = l1.next;
	        }
	        while(l2 !=null){
	        	stack2.push(l2);
	        	l2 = l2.next;
	        }
	        int cur = 0;
	        ListNode reverse = new ListNode(0);
	        while(!stack1.isEmpty() || !stack2.isEmpty()){
	        	int sum = ((stack1.isEmpty()? 0:stack1.peek().val) + (stack2.isEmpty()? 0:stack2.peek().val)+cur)%10;
	        	cur = ((stack1.isEmpty()? 0:stack1.pop().val) + (stack2.isEmpty()? 0:stack2.pop().val)+cur)/10;
	            reverse.val = sum;
	            ListNode head = new ListNode(0);
	            head.next = reverse;
	            reverse = head;
	            if(cur !=0 && stack1.isEmpty() && stack2.isEmpty()) {
	            	reverse.val = 1;
	                return reverse;
	            }
	        }
	        
	        return reverse.next;
	    }
	
	
	class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }

}
