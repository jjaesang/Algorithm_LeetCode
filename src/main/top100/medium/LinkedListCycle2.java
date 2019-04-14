package main.top100.medium;

/**
 *
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 *
 * To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to.
 * If pos is -1, then there is no cycle in the linked list.
 *
 * Note: Do not modify the linked list.
 *
 * https://leetcode.com/problems/linked-list-cycle-ii/
 *
 *
 */
public class LinkedListCycle2 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     *
     * @TestCase
     * fast startpoint = head / do-while loop
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
     * Memory Usage: 38.4 MB, less than 83.24% of Java online submissions for Linked List Cycle.
     *
     * @Testcase
     * fast startpoint = head.next / do-while loop
     * Time Limit Exceeded
     *
     * @Testcase
     * fast startpoint = head / while loop
     * Wrong Answer
     *
     * Input
     *      [3,2,0,-4]
     *      1
     * Output
     *      tail connects to node index 0
     * Expected
     *      tail connects to node index 1
     *
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;

        do {
            if (fast == null || fast.next == null)
                return null;
            slow = slow.next;
            fast = fast.next.next;
        } while (slow != fast);

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;

    }
}
