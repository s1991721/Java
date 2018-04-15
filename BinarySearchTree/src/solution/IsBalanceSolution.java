package solution;

import model.TreeNode;
import utils.Utils;

/**
 * Created by mr.lin on 2018/4/15.
 * <p>
 * Balanced Binary Tree
 * <p>
 * https://leetcode.com/explore/learn/card/introduction-to-data-structure-binary-search-tree/143/appendix-height-balanced-bst/1027/
 */
public class IsBalanceSolution {

    public String solution(String input) {
        TreeNode root = Utils.stringToTreeNode(input);

        return Boolean.toString(isBalance(root));
    }

    private boolean isBalance(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(height(root.left) - height(root.right)) > 1) {
            return false;
        }

        return isBalance(root.left) && isBalance(root.right);
    }

    private int height(TreeNode node) {

        if (node == null) {
            return 0;
        }

        int left = height(node.left);
        int right = height(node.right);

        return (left > right ? left : right) + 1;

    }

}
