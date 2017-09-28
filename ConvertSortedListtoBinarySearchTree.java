package leecode;

public class ConvertSortedListtoBinarySearchTree {
	
public TreeNode sortedListToBST(ListNode head) {
     if(head == null ) return null;
     return build(head, null);
    }

public TreeNode build(ListNode head,ListNode tail){
	if(head == tail) return null;
	ListNode slow = head;
	ListNode fast = head;
	while(fast != tail && fast.next !=tail){
		slow = slow.next;
		fast = fast.next.next;
	}
	TreeNode root = new TreeNode(slow.val);
	root.left = build(head, slow);
	root.right = build(slow.next, tail);
	
	return root;
}
	
	class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
	class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }

}
