package main.easy;

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * <p>
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */

public class RemoveDuplicatedFromSortedListTree {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val)
                current.next = current.next.next;
            else
                current = current.next;
        }
        return head;
    }
}
