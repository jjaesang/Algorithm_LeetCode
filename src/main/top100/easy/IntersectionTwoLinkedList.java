package main.top100.easy;


import java.util.Stack;

/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 *
 */
public class IntersectionTwoLinkedList {


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * Runtime: 3 ms, faster than 23.56% of Java online submissions for Intersection of Two Linked Lists.
     * Memory Usage: 37.6 MB, less than 17.31% of Java online submissions for Intersection of Two Linked Lists.
     * @param headA [4,1,8,4,5]
     * @param headB [5,0,1,8,4,5]
     * @return
     */
    public ListNode getIntersectionNodeStack(ListNode headA, ListNode headB) {
        /**
         * 두개의 LinkedList를 Stack에 넣어둠
         * 왜냐면 두개의 리스트가 교집합이 있다면 뒤에서 부터 확인했을 때 다른 ListNode일 경우
         * 그 전의 ListNode가 IntersectionNode로 간주
         */
        Stack<ListNode> nodeAStack = new Stack<>();
        Stack<ListNode> nodeBStack = new Stack<>();

        while (headA != null){
            nodeAStack.push(headA);
            headA = headA.next;
        }

        while (headB != null){
            nodeBStack.push(headB);
            headB = headB.next;
        }


        ListNode intersectionNode = null;
        while( !nodeAStack.isEmpty() && ! nodeBStack.isEmpty()) {

            ListNode aNode = nodeAStack.pop();
            ListNode bNode = nodeBStack.pop();

            if( aNode != bNode)
                return intersectionNode;

            intersectionNode = aNode;
        }
        return intersectionNode;
    }

}
