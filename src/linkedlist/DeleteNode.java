package linkedlist;

import datastructure.ListNode;

public class DeleteNode {
	public static void delete(ListNode node) {
		if (node != null) {
			if (node.next == null) {
				node = null;
				return;
			}
			
			node.val = node.next.val;
			node.next = node.next.next;
		}
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode().getList();
		
		delete(head.next.next.next);
		delete(head.next.next.next.next);
		
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}
