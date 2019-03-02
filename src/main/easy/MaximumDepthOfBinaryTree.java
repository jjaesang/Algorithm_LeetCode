package main.easy;

/**
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * Note: A leaf is a node with no children.
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 *
 */
public class MaximumDepthOfBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     *
     * @param root Given binary tree [3,9,20,null,null,15,7]
     * @return 3
     */
    public int maxDepth(TreeNode root) {

        if (root == null) return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return 1+Math.max(leftDepth, rightDepth);
    }
}
