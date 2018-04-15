package solution;

import java.util.LinkedList;

import model.TreeNode;
import utils.Utils;

/**
 * Created by mr.lin on 2018/4/12.
 * <p>
 * 遍历
 * <p>
 * https://leetcode.com/explore/learn/card/introduction-to-data-structure-binary-search-tree/140/introduction-to-a-bst/1008/
 */
public class IteratorSolution {

    public String solution(String input) {
        TreeNode root = Utils.stringToTreeNode(input);

        BSTIterator bstIterator = new BSTIterator(root);

        StringBuffer stringBuffer = new StringBuffer();
        while (bstIterator.hasNext()) {
            stringBuffer.append(String.valueOf(bstIterator.next().val)).append(",");
        }

        return stringBuffer.toString();
    }

    class BSTIterator {
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();

        public BSTIterator(TreeNode root) {
            TreeNode node = root;
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }

        public TreeNode next() {
            TreeNode node = stack.pop();

            TreeNode temp = node.right;
            while (temp != null) {
                stack.push(temp);
                temp = temp.left;
            }

            return node;
        }
    }

}
