package linkedlist;

import datastructure.ListNode;

public class KthToLast {
	
	public static ListNode kthToLast(ListNode head, int key) {
		ListNode p1 = head;
		ListNode p2 = head;
		
		for (int i = 0; i < key; ++i) {
			if (p1 == null) return null; 
			p1 = p1.next;
		}
		
		while (p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
	  	}
		
	  	return p2;
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode().getList();
		
		ListNode node = kthToLast(head, 7);
		
		System.out.println(node.val);
	}
}