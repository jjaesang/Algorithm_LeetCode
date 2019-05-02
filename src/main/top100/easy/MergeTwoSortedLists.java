package main.top100.easy;

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedLists {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * Runtime: 1 ms, faster than 84.18% of Java online submissions for Merge Two Sorted Lists.
     Memory Usage: 37 MB, less than 97.90% of Java online submissions for Merge Two Sorted Lists.
     Next challenges:
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode cur = result;
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                cur.next = l2;
                l2 = l2.next;
            } else {
                cur.next = l1;
                l1 = l1.next;
            }
            cur = cur.next;
        }


        if (l1 != null) cur.next = l1;
        else  cur.next = l2;
        return result.next;


    }

}
