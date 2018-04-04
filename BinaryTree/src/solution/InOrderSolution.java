package solution;

import java.util.ArrayList;

import common.Utils;
import node.TreeNode;

/**
 * Created by mr.lin on 2018/4/4.
 * <p>
 * Binary Tree Inorder Traversal
 * <p>
 * https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/929/
 */
public class InOrderSolution {

    public String solution(String input) {
        TreeNode root=Utils.stringToTreeNode(input);

        ArrayList<Integer> list=inOrder(root);
        return Utils.integerArrayListToString(list);
    }

    private ArrayList<Integer> inOrder(TreeNode root){
        ArrayList<Integer> list=new ArrayList<Integer>();
        if (root==null){
            return list;
        }
        list.addAll(inOrder(root.left));
        list.add(root.val);
        list.addAll(inOrder(root.right));
        return list;
    }

}
