package leecode;

public class AddTwoNumbersII {
	
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1r = reverseNode(l1);
        ListNode l2r = reverseNode(l2);
        ListNode sum = new ListNode(0);
        ListNode reverseNode = sum;
        int cur = 0;
        while(l1r!=null || l2r!=null){
        	sum.val = (( l1r==null? 0 : l1r.val )+(l2r==null? 0:l2r.val)+cur)%10;
        	cur = (( l1r==null? 0 : l1r.val )+(l2r==null? 0:l2r.val)+cur)/10;
        	if(l1r !=null ) l1r = l1r.next;
        	if(l2r !=null )l2r = l2r.next;
            if(l1r !=null || l2r!=null){
            sum.next = new ListNode(0);
                sum = sum.next;
            }
        }
        if(cur != 0){
        	sum.next = new ListNode(1);
                sum = sum.next;
        } 
        return reverseNode(reverseNode);
    }
	
	public static ListNode reverseNode(ListNode head){
		if(head == null) return head;
		ListNode newNode = null;
		while(head!=null){
			ListNode next = head.next;
			head.next = newNode;
			newNode = head;
			head = next;
		}
		return newNode;
	}
	
	class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }

}
