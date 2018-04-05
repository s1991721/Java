package solution;

import common.Utils;
import node.TreeNode;

/**
 * Created by mr.lin on 2018/4/4.
 * <p>
 * Path Sum
 * <p>
 * https://leetcode.com/explore/learn/card/data-structure-tree/17/solve-problems-recursively/537/
 * <p>
 * 注意要求，一定是root-to-leaf，中途的不算
 */
public class PathSumSolution {

    public String solution(String input) {
        String[] strings = input.split("!");
        TreeNode root = Utils.stringToTreeNode(strings[0]);
        int sum = Integer.parseInt(strings[1]);
        return Boolean.toString(hasPathSum(root, sum));
    }


    private boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return root.val == sum;
        } else {
            return hasPathSum(root.left, sum - root.val) ||
                    hasPathSum(root.right, sum - root.val);
        }

    }
}
