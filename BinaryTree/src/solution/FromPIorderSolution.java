package solution;

import common.Utils;
import node.TreeNode;

/**
 * Created by mr.lin on 2018/4/5.
 * <p>
 * Construct Binary Tree from Preorder and Inorder Traversal
 * <p>
 * https://leetcode.com/explore/learn/card/data-structure-tree/133/conclusion/943/
 */
public class FromPIorderSolution {

    public String solution(String input) {
        String[] strings = input.split("!");
        int[] preorder = Utils.stringToIntegerArray(strings[0]);
        int[] inorder = Utils.stringToIntegerArray(strings[1]);

        TreeNode root = constructFromPIorder(preorder, inorder);

        return Utils.treeNodeToString(root);
    }

    private TreeNode constructFromPIorder(int[] preOrder, int[] inOrder) {

        if (preOrder.length < 1) {
            return null;
        }

        TreeNode root = new TreeNode(preOrder[0]);

        int position = 0;
        for (int i = 0; i < inOrder.length; i++) {
            if (root.val == inOrder[i]) {
                position = i;
                break;
            }
        }

        int[] inOrderL = new int[position];
        int[] inOrderR = new int[inOrder.length - 1 - position];

        int[] preOrderL = new int[position];
        int[] preOrderR = new int[inOrder.length - 1 - position];

        System.arraycopy(inOrder,0,inOrderL,0,position);
        System.arraycopy(inOrder,position+1,inOrderR,0,inOrder.length - 1 - position);

        System.arraycopy(preOrder,1,preOrderL,0,position);
        System.arraycopy(preOrder,position+1,preOrderR,0,inOrder.length - 1 - position);

        root.left=constructFromPIorder(preOrderL,inOrderL);
        root.right=constructFromPIorder(preOrderR,inOrderR);

        return root;

    }

}
