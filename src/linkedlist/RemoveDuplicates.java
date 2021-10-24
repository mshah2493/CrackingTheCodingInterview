package linkedlist;

import java.util.HashSet;

import datastructure.ListNode;

public class RemoveDuplicates {	
	public static void removeDups(ListNode head) {
		HashSet<Integer> set = new HashSet<>();
		ListNode prev = null;
		
		while (head != null) {
			if (set.contains(head.val)) {
				prev.next = head.next;
			} else {
				set.add(head.val);
				prev = head;
			}
			
			head = head.next;
		}
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode().getList();
		
		removeDups(head);
		
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}
