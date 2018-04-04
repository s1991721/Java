package solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import common.Utils;
import node.TreeNode;

/**
 * Created by mr.lin on 2018/4/4.
 * <p>
 * Binary Tree Level Order Traversal
 * <p>
 * https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/931/
 */
public class LevelOrderSolution {

    public String solution(String input) {
        TreeNode root = Utils.stringToTreeNode(input);

        List<List<Integer>> list = levelOrder(root);
        return Utils.int2dListToString(list);
    }

    private List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
        ArrayList<Integer> levelList = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (node == null) continue;

                levelList.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                if (i == size - 1) {
                    list.add(levelList);
                    levelList = new ArrayList<Integer>();
                }

            }


        }

        return list;


    }

}
