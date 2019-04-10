package solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/explore/learn/card/queue-stack/232/practical-application-stack/1392/
 */
public class CloneGraphSolution {

    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
        }

        public Node(int _val, List<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public Node cloneGraph(Node node) {

        Stack<Node> stack = new Stack<Node>();
        HashMap<Node, Node> map = new HashMap<Node, Node>();

        Node root = new Node();
        root.val = node.val;
        root.neighbors = new ArrayList<Node>();

        map.put(node, root);
        stack.push(node);

        while (!stack.isEmpty()) {
            Node node1 = stack.pop();
            for (Node node2 : node1.neighbors) {
                if (!map.containsKey(node2)) {
                    Node newNode = new Node();
                    newNode.val = node2.val;
                    newNode.neighbors = new ArrayList<Node>();
                    map.put(node2, newNode);
                    stack.push(node2);
                }
                map.get(node1).neighbors.add(map.get(node2));

            }
        }

        return map.get(node);
    }

}
