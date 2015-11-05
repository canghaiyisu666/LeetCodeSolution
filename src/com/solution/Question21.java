package com.solution;

/**
 * 21题意： 把两个单链表拼接
 */

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class Question21 {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode p1 = l1;
		ListNode p2 = l2;

		ListNode fakeHead = new ListNode(0);
		ListNode p = fakeHead;

		while (p1 != null && p2 != null) {
			if (p1.val <= p2.val) {
				p.next = p1;
				p1 = p1.next;
			} else {
				p.next = p2;
				p2 = p2.next;
			}

			p = p.next;
		}

		if (p1 != null)
			p.next = p1;
		if (p2 != null)
			p.next = p2;

		return fakeHead.next;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(10);
		l2.next = new ListNode(11);
		l2.next.next = new ListNode(12);

		ListNode result = mergeTwoLists(l1, l2);
		while (result.next!=null) {
			System.out.println(result.val);
			result = result.next;
		}
		System.out.println(result.val);
	}
}
