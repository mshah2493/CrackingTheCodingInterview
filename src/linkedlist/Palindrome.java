package linkedlist;

import java.util.Stack;

import datastructure.ListNode;

public class Palindrome {
	private static ListNode front = null;
	public static boolean isPalindrome(ListNode head) {
	    if (head == null || head.next == null)
	    {
	        return true;
	    }
	    
	    Stack<Integer> stack = new Stack<>();
	    ListNode curr = head;
	    int listLength = 0;
	    
	    while (curr != null)
	    {
	        ++listLength;
	        curr = curr.next;
	    }
	    
	    int mid = listLength / 2;
	    
	    while (head != null)
	    {
	        if (mid > 0)
	        {
	            stack.push(head.val);   
	        }
	        else
	        {
	            if (listLength % 2 != 0 && mid == 0)
	            {
	                
	            }
	            else
	            {
	                if (head.val != stack.pop()) return false;
	            }
	        }
	        
	        --mid;
	        head = head.next;
	    }
	    
	    
	    if (stack.isEmpty()) return true;
	    
	    return false;
	}
	
	public static boolean isPalindromeRecursive(ListNode head) {
		front = head;
        return recursivelyCheck(head);
	}
	
	private static boolean recursivelyCheck(ListNode head) {
		if (head != null) {
			if (!recursivelyCheck(head.next)) return false;
			
			if (front.val != head.val) return false;
			front = front.next;
		}
		
		return true;
	}
}
