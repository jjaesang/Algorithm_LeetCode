package main.top100.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/invert-binary-tree/
 * Created by jaesang on 2019-04-11.
 */


public class InvertBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
     * Memory Usage: 35.6 MB, less than 76.95% of Java online submissions for Invert Binary Tree.
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;

        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);

        while (!treeNodeQueue.isEmpty()) {
            TreeNode curNode = treeNodeQueue.poll();

            TreeNode tempNode = curNode.left;
            curNode.left = curNode.right;
            curNode.right = tempNode;

            if (curNode.left != null) treeNodeQueue.add(curNode.left);
            if (curNode.right != null) treeNodeQueue.add(curNode.right);

        }
        return root;
    }
}
