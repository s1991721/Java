import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by mr.lin on 2018/4/3.
 * <p>
 * Populating Next Right Pointers in Each Node
 * <p>
 * https://leetcode.com/explore/learn/card/data-structure-tree/133/conclusion/994/
 * <p>
 * from
 * 1
 * /  \
 * 2    3
 * / \  / \
 * 4  5  6  7
 * <p>
 * to
 * 1 -> NULL
 * /  \
 * 2 -> 3 -> NULL
 * / \  / \
 * 4->5->6->7 -> NULL
 */

class TreeLinkNode {
    int val;
    TreeLinkNode left, right, next;

    TreeLinkNode(int x) {
        val = x;
    }
}

public class NextTreeNodeSolution {

    private void connect(TreeLinkNode root) {
        LinkedList<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeLinkNode node = queue.poll();
                if (i == size - 1) {
                    node.next = null;
                } else {
                    node.next = queue.peek();
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
    }

    /**
     *
     * @param input [1,2,3,4,5,6,7]
     * @return
     */
    public String solution(String input) {

        TreeLinkNode root = stringToNode(input);

        connect(root);


        return nodeToString(root);

    }


    private TreeLinkNode stringToNode(String input) {

        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return null;
        }

        String[] parts = input.split(",");
        String item = parts[0];
        TreeLinkNode root = new TreeLinkNode(Integer.parseInt(item));
        Queue<TreeLinkNode> nodeQueue = new LinkedList<TreeLinkNode>();
        nodeQueue.add(root);

        int index = 1;
        while (!nodeQueue.isEmpty()) {
            TreeLinkNode node = nodeQueue.remove();

            if (index == parts.length) {
                break;
            }

            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int leftNumber = Integer.parseInt(item);
                node.left = new TreeLinkNode(leftNumber);
                nodeQueue.add(node.left);
            }

            if (index == parts.length) {
                break;
            }

            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int rightNumber = Integer.parseInt(item);
                node.right = new TreeLinkNode(rightNumber);
                nodeQueue.add(node.right);
            }
        }
        return root;
    }

    private String nodeToString(TreeLinkNode root) {

        if (root == null) {
            return "[]";
        }

        String output = "";
        Queue<TreeLinkNode> nodeQueue = new LinkedList<TreeLinkNode>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            TreeLinkNode node = nodeQueue.remove();

            if (node == null) {
                output += "null, ";
                continue;
            }

            String next = node.next == null ? "null" : String.valueOf(node.next.val);
            output += String.valueOf(node.val) + "(" + next + ")" + ", ";
            if (node.left != null) {
                nodeQueue.add(node.left);
            }
            if (node.right != null) {
                nodeQueue.add(node.right);
            }
        }
        return "[" + output.substring(0, output.length() - 2) + "]";
    }

}


