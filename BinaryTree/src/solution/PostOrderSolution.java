package solution;

import java.util.ArrayList;

import common.Utils;
import node.TreeNode;

/**
 * Created by mr.lin on 2018/4/4.
 * <p>
 * Binary Tree Postorder Traversal
 * <p>
 * https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/930/
 */
public class PostOrderSolution {

    public String solution(String input) {
        TreeNode root = Utils.stringToTreeNode(input);

        ArrayList<Integer> list = postOrder(root);
        return Utils.integerArrayListToString(list);
    }

    private ArrayList<Integer> postOrder(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
        }
        list.addAll(postOrder(root.left));
        list.addAll(postOrder(root.right));
        list.add(root.val);
        return list;
    }

}
