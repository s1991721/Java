package solution;

import model.TreeNode;
import utils.Utils;

/**
 * Created by mr.lin on 2018/4/15.
 * <p>
 * Kth Largest Element in a Stream
 * <p>
 * https://leetcode.com/explore/learn/card/introduction-to-data-structure-binary-search-tree/142/conclusion/1018/
 */
public class KThSolution {

    public String solution(String input) {

        String[] strings = input.split("!");

        TreeNode root = Utils.stringToTreeNode(strings[0]);
        int data = Integer.parseInt(strings[1]);

//        return Utils.treeNodeToString(insert(root, data));
        kThLargest(root, data);
        return Utils.treeNodeToString(kThNode);
    }

    private TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        }

        if (data == root.val) {
            return root;
        }

        if (data < root.val) {
            root.left = insert(root.left, data);
        }
        if (data > root.val) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    int c = 0;
    TreeNode kThNode;

    private void kThLargest(TreeNode node, int k) {

        if (node == null || c > k) {
            return;
        }

        kThLargest(node.right, k);

        c++;
        if (c == k) {
            kThNode = node;
            return;
        }

        kThLargest(node.left, k);

    }
}
