package solution;

import model.TreeNode;
import utils.Utils;

/**
 * Created by mr.lin on 2018/4/15.
 * <p>
 * Delete Node in a BST
 * <p>
 * https://leetcode.com/explore/learn/card/introduction-to-data-structure-binary-search-tree/141/basic-operations-in-a-bst/1006/
 */
public class DeleteSolution {

    public String solution(String input) {
        String[] strings = input.split("!");
        TreeNode root = Utils.stringToTreeNode(strings[0]);

        return Utils.treeNodeToString(delete(root, Integer.parseInt(strings[1])));
    }

    private TreeNode delete(TreeNode root, int key) {

        if (root == null) {
            return null;
        }

        if (key < root.val) {
            root.left = delete(root.left, key);
        } else if (key > root.val) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                root.val = min(root.right);
                root.right = delete(root.right, root.val);
            }
        }
        return root;
    }

    private int min(TreeNode root) {
        TreeNode node = root;
        while (node != null && node.left != null) {
            node = node.left;
        }
        return node.val;
    }

}
