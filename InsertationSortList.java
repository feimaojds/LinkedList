package leecode;

public class InsertationSortList {

	
public ListNode insertionSortList(ListNode head) {
	   if(head==null) return null;
	   ListNode result = new ListNode(0);
	   ListNode pre = result;
	   ListNode cur = head;
	   ListNode next = null;
	   while(cur!=null){
		   next = cur.next;
		   while(pre.next!=null&&cur.val>pre.next.val){
			   pre = pre.next;
		   }
		   cur.next = pre.next;
		   pre.next = cur;
		   pre = result;
		   cur = next;
	   }
	   return result.next;
	   
    }

public static void main(String[] args) {
	ListNode l1 = new ListNode(1);
	ListNode l2 = new ListNode(1);
	l1.next = l2;
	//System.out.println(l1.next.val);
	l2 = new InsertationSortList().insertionSortList(l1);
	System.out.println(l2.next.val);
}


static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
}
