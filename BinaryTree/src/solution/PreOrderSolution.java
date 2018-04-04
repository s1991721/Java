package solution;

import java.util.ArrayList;

import common.Utils;
import node.TreeNode;

/**
 * Created by mr.lin on 2018/4/4.
 * <p>
 * Binary Tree Preorder Traversal
 * <p>
 * https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/928/
 */
public class PreOrderSolution {

    public String solution(String input) {
        TreeNode root=Utils.stringToTreeNode(input);

        ArrayList<Integer> list=preOrder(root);
        return Utils.integerArrayListToString(list);
    }

    private ArrayList<Integer> preOrder(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        if (root == null) {
            return list;
        }
        list.add(root.val);
        list.addAll(preOrder(root.left));
        list.addAll(preOrder(root.right));

        return list;
    }

}
