package solution;

import common.Utils;
import node.TreeNode;

/**
 * Created by mr.lin on 2018/4/4.
 * <p>
 * Lowest Common Ancestor of a Binary Tree
 * <p>
 * https://leetcode.com/explore/learn/card/data-structure-tree/133/conclusion/932/
 */
public class LCASolution {

    public String solution(String input, String node1, String node2) {


        TreeNode root = Utils.stringToTreeNode(input);
        TreeNode p = new TreeNode(Integer.parseInt(node1));
        TreeNode q = new TreeNode(Integer.parseInt(node2));
        TreeNode ancestor = lowestCommonAncestor(root, p, q);

        return String.valueOf(ancestor.val);
    }

    private TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        if (root.val == p.val) return p;
        if (root.val == q.val) return q;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return left != null ? left : right;
    }

}
