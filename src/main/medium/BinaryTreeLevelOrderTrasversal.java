package main.medium;

import main.easy.MaximumDepthOfBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by jaesang on 2019-04-25.
 */
public class BinaryTreeLevelOrderTrasversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null)
            return null;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        List<List<Integer>> resultList = new ArrayList<List<Integer>>();

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
