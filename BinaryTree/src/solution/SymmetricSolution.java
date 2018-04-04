package solution;

import common.Utils;
import node.TreeNode;

/**
 * Created by mr.lin on 2018/4/4.
 * <p>
 * Symmetric Tree
 * <p>
 * https://leetcode.com/explore/learn/card/data-structure-tree/17/solve-problems-recursively/536/
 */
public class SymmetricSolution {

    public String solution(String input) {
        TreeNode root = Utils.stringToTreeNode(input);

        if (root == null) {
            return Boolean.toString(true);
        }

        return Boolean.toString(isSymmetric(root.left, root.right));
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left != null && right != null) {
            if (left.val != right.val) {
                return false;
            } else {
                boolean out, in;
                out = isSymmetric(left.left, right.right);
                in = isSymmetric(left.right, right.left);
                return out && in;
            }
        } else {
            return false;
        }
    }
}
