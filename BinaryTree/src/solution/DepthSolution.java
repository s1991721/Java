package solution;

import common.Utils;
import node.TreeNode;

/**
 * Created by mr.lin on 2018/4/4.
 * <p>
 * Maximum Depth of Binary Tree
 * <p>
 * https://leetcode.com/explore/learn/card/data-structure-tree/17/solve-problems-recursively/535/
 */
public class DepthSolution {

    public String solution(String input) {
        TreeNode root = Utils.stringToTreeNode(input);
        int depth = maxDepth(root);

        return String.valueOf(depth);
    }

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return (left > right ? left : right) + 1;
    }

}
