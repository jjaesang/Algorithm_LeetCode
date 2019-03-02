package main.easy;

/**
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * Note: A leaf is a node with no children.
 *
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 *
 */
public class MinimumDepthOfBinaryTree {

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
     * @return 2
     */
    public int minDepth(TreeNode root) {

        if (root == null) return 0;
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        //[1,2] 인 경우, left는 1 right =0 인 상황에서 min 을하면 0이 되면서 한 depth를 처리 못함
        if( leftDepth == 0 || rightDepth == 0)
            return leftDepth+rightDepth+1;
        else
            return 1+Math.max(leftDepth, rightDepth);
    }
}
