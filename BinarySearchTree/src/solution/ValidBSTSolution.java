package solution;


import model.TreeNode;
import utils.Utils;

/**
 * Created by mr.lin on 2018/4/6.
 * <p>
 * Validate Binary Search Tree
 * <p>
 * https://leetcode.com/explore/learn/card/introduction-to-data-structure-binary-search-tree/140/introduction-to-a-bst/997/
 */
public class ValidBSTSolution {

    TreeNode pre = null;

    public String solution(String input) {
        TreeNode root = Utils.stringToTreeNode(input);
        return Boolean.toString(isValidBST(root));
    }

    private boolean isValidBST(TreeNode root) {
        if (root != null) {
            // Inorder traversal: left first.
            if (!isValidBST(root.left)) return false;

            // Compare it with the previous value in inorder traversal.
            if (pre != null && root.val <= pre.val) return false;

            // Update the previous value.
            pre = root;

            // Inorder traversal: right last.
            return isValidBST(root.right);
        }
        return true;
    }

}
