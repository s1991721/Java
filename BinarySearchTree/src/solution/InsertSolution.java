package solution;

import model.TreeNode;
import utils.Utils;

/**
 * Created by mr.lin on 2018/4/15.
 * <p>
 * Insert into a Binary Search Tree
 * <p>
 * https://leetcode.com/explore/learn/card/introduction-to-data-structure-binary-search-tree/141/basic-operations-in-a-bst/1003/
 */
public class InsertSolution {

    public String solution(String input) {

        String[] strings = input.split("!");
        TreeNode root = Utils.stringToTreeNode(strings[0]);

        return Utils.treeNodeToString(insert(root, Integer.parseInt(strings[1])));
    }

    private TreeNode insert(TreeNode root, int key) {

        if (root == null) {
            return new TreeNode(key);
        }

        if (key < root.val) {
            if (root.left == null) {
                root.left = new TreeNode(key);
            } else {
                insert(root.left, key);
            }
        }
        if (key > root.val) {
            if (root.right == null) {
                root.right = new TreeNode(key);
            } else {
                insert(root.right, key);
            }
        }

        return root;
    }
}
