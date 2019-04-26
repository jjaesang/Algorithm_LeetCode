package main.medium;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
 *
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ BST's total elements.
 *
 * https://leetcode.com/problems/kth-smallest-element-in-a-bst/
 *
 */
public class KthSmallestInBST {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    /**
     * Runtime: 5 ms, faster than 6.27% of Java online submissions for Kth Smallest Element in a BST.
     * Memory Usage: 38.6 MB, less than 64.26% of Java online submissions for Kth Smallest Element in a BST.
     *
     * Input: root = [3,1,4,null,2], k = 1
     *    3
     *   / \
     *  1   4
     *   \
     *    2
     * Output: 1
     *
     * @param root
     * @param k
     * @return
     */
    public int kthSmallest(TreeNode root, int k) {

        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();

        while(!stack.isEmpty() || root != null){
            while (root !=null){
                stack.push(root);
                root = root.left;
            }
            if(!stack.isEmpty()){
                root = stack.pop();
                result.add(root.val);
                root = root.right;
            }

        }
        return result.get(k-1);

    }
}
