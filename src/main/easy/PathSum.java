package main.easy;

/**
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 * Note: A leaf is a node with no children.
 *
 * https://leetcode.com/problems/path-sum/
 */
public class PathSum {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    /**
     *
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Path Sum.
     * Memory Usage: 38.8 MB, less than 24.40% of Java online submissions for Path Sum.

     * @param root [5,4,8,11,null,13,4,7,2,null,null,null,1]
     * @param sum 22
     * @return true
     */
    public boolean hasPathSum(TreeNode root, int sum) {

        if (root == null) return false;
        if (isLeaf(root) && root.val == sum) return true;
        if(hasPathSum(root.left, sum - root.val)) return true;
        if(hasPathSum(root.right, sum - root.val)) return true;
        return false;

    }
}
