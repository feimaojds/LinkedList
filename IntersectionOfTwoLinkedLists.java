package leetcode;

import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoLinkedLists {

	
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode,Integer> map = new HashMap<ListNode,Integer>();
        while(headA != null){
        	map.put(headA, 0);
        	headA = headA.next;
        }
        while(headB != null){
        	if(map.containsKey(headB)){
        		return headB;
        	}
        	headB = headB.next;
        }
        return null;
    }

public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
    if(headA == null || headB == null) return null;
    int lengthA = 0;
    int lengthB = 0;
    ListNode a = headA;
    ListNode b = headB;
    while(a != null){
        lengthA++;
        a = a.next;
    }
    while(b != null){
        lengthB++;
        b = b.next;
    }
    if(lengthA>=lengthB){
        int n = Math.abs(lengthA-lengthB);
        while(n>0){
            headA = headA.next;
            n--;
        }
    }else{
        int n = Math.abs(lengthA-lengthB);
        while(n>0){
            headB = headB.next;
            n--;
        }
    }
    while(headA!=headB){
        headA = headA.next;
        headB = headB.next;
    }
    return headA;
}

public ListNode getIntersectionNode3(ListNode headA, ListNode headB) {
    if(headA == null || headB == null) return null;
    ListNode a = headA;
    ListNode b = headB;
    while(a!=b){
        a = (a ==null? headB:a.next);
        b = (b ==null? headA:b.next);
    }
    return a;
}
	
	
	class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
}
