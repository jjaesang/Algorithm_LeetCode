package main.top100.easy;

/**
 *
 * Given a linked list, determine if it has a cycle in it.
 *
 * To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to.
 * If pos is -1, then there is no cycle in the linked list.
 *
 * https://leetcode.com/problems/linked-list-cycle/
 */
public class LinkedListCycle {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
     * Memory Usage: 38.7 MB, less than 28.45% of Java online submissions for Linked List Cycle.
     * @param head  head = [3,2,0,-4], pos = 1
     * @return true
     */
    public boolean hasCycle(ListNode head) {

        if(head == null || head.next == null)
            return false;

        ListNode slowNode = head;
        ListNode fastNode = head.next;

        while( fastNode != slowNode) {

            if(fastNode == null || fastNode.next == null)
                return false;

            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return true;
    }
}
