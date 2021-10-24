package linkedlist;

import datastructure.ListNode;

public class Partition {
	
	public static ListNode partition(ListNode node, int x) {
		ListNode head = node;
		ListNode tail = node;
		
		while (node != null) {
			ListNode next = node.next;
			if (node.val < x) {
				node.next = head;
				head = node;
			} else {
				tail.next = node;
				tail = node;
			}	
			
			node = next;
		}
		
		tail.next = null;
		
		return head;
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode().getList();
		
		ListNode curr = head;
		
		while (curr != null) {
			System.out.println(curr.val);
			curr = curr.next;
		}
		
		System.out.println();
		head = partition(head, 4);
		
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}
