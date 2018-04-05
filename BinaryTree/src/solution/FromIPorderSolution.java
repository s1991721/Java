package solution;

import common.Utils;
import node.TreeNode;

/**
 * Created by mr.lin on 2018/4/5.
 * <p>
 * Construct Binary Tree from Inorder and Postorder Traversal
 * <p>
 * https://leetcode.com/explore/learn/card/data-structure-tree/133/conclusion/942/
 */
public class FromIPorderSolution {

    public String solution(String input) {
        String[] strings = input.split("!");
        int[] inorder = Utils.stringToIntegerArray(strings[0]);
        int[] postorder = Utils.stringToIntegerArray(strings[1]);

        TreeNode root = constructFromIPorder(inorder, postorder);

        return Utils.treeNodeToString(root);
    }

    private TreeNode constructFromIPorder(int[] inOrder, int[] postOrder) {
        if (postOrder.length < 1) {
            return null;
        }
        TreeNode root = new TreeNode(postOrder[postOrder.length - 1]);

        int position = 0;
        for (int i = 0; i < inOrder.length; i++) {
            if (root.val == inOrder[i]) {
                position = i;
                break;
            }
        }

        int[] inOrderL = new int[position];
        int[] inOrderR = new int[inOrder.length - 1 - position];

        int[] postOrderL = new int[position];
        int[] postOrderR = new int[inOrder.length - 1 - position];

        System.arraycopy(inOrder, 0, inOrderL, 0, position);
        System.arraycopy(inOrder, position + 1, inOrderR, 0, inOrder.length - 1 - position);

        System.arraycopy(postOrder, 0, postOrderL, 0, position);
        System.arraycopy(postOrder, position, postOrderR, 0, inOrder.length - 1 - position);

        root.left = constructFromIPorder(inOrderL, postOrderL);
        root.right = constructFromIPorder(inOrderR, postOrderR);


        return root;
    }

}
