package solution;

import model.TreeNode;
import utils.Utils;

/**
 * Created by mr.lin on 2018/4/15.
 * <p>
 * Search in a Binary Search Tree
 * <p>
 * https://leetcode.com/explore/learn/card/introduction-to-data-structure-binary-search-tree/141/basic-operations-in-a-bst/1000/
 */
public class SearchSolution {

    public String solution(String input) {

        String[] strings = input.split("!");
        TreeNode root = Utils.stringToTreeNode(strings[0]);

        return Utils.treeNodeToString(search(root, Integer.parseInt(strings[1])));
    }

    private TreeNode search(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.val) {
            return search(root.left, key);
        } else if (key > root.val) {
            return search(root.right, key);
        } else {
            return root;
        }
    }

}
