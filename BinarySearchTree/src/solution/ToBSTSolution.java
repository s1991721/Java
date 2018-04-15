package solution;

import model.TreeNode;
import utils.Utils;

/**
 * Created by mr.lin on 2018/4/15.
 * <p>
 * Convert Sorted Array to Binary Search Tree
 * <p>
 * https://leetcode.com/explore/learn/card/introduction-to-data-structure-binary-search-tree/143/appendix-height-balanced-bst/1015/
 */
public class ToBSTSolution {

    public String solution(String input) {
        int[] nums = Utils.stringToIntegerArray(input);

        return Utils.treeNodeToString(sortedArrayToBST(nums));
    }

    private TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }

        int center = nums.length / 2;

        TreeNode root = new TreeNode(nums[center]);

        int[] left = new int[center];
        int[] right = new int[nums.length - center - 1];

        System.arraycopy(nums, 0, left, 0, center);
        System.arraycopy(nums, center + 1, right, 0, nums.length - center - 1);

        root.left = sortedArrayToBST(left);
        root.right = sortedArrayToBST(right);

        return root;
    }

}
