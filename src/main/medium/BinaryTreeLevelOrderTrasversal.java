package main.medium;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 */
public class BinaryTreeLevelOrderTrasversal {

    /**
     * Runtime: 1 ms, faster than 75.29% of Java online submissions for Binary Tree Level Order Traversal.
     * Memory Usage: 37.3 MB, less than 65.79% of Java online submissions for Binary Tree Level Order Traversal.
     */
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
     * @param root  [3,9,20,null,null,15,7]
     * @return
     *   [
            [3],
            [9,20],
            [15,7]
        ]
     */
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> resultList = new ArrayList<List<Integer>>();

        if (root == null)
            return resultList;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> levelList = new ArrayList<>();

            for( int i=0;i<levelNum;i++){
                if(queue.peek().left != null) queue.add(queue.peek().left);
                if(queue.peek().right != null) queue.add(queue.peek().right);
                levelList.add(queue.poll().val);
            }
            resultList.add(levelList);

        }

        return resultList;


    }

}
