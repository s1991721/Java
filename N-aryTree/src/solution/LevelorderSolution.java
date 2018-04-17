package solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import common.Utils;
import model.Node;

/**
 * Created by mr.lin on 2018/4/17.
 * <p>
 * N-ary Tree Level Order Traversal
 * <p>
 * https://leetcode.com/explore/learn/card/n-ary-tree/130/traversal/915/
 */
public class LevelorderSolution {

    public String solution(String input) {
        Node root = Utils.stringToNode(input);
        String string = Utils.list2ToString(levelOrder(root));
        return string;
    }

    private List<ArrayList<Integer>> levelOrder(Node root) {

        LinkedList<Node> stack = new LinkedList<Node>();

        ArrayList<Integer> levelList = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        stack.offer(root);

        while (!stack.isEmpty()) {
            int size = stack.size();

            for (int i = 0; i < size; i++) {
                Node node = stack.poll();
                if (node == null) {
                    continue;
                }
                levelList.add(node.val);
                if (node.children.size() > 0) {
                    for (int j = 0; j < node.children.size(); j++) {
                        stack.offer(node.children.get(j));
                    }
                }
            }

            list.add(levelList);
            levelList = new ArrayList<Integer>();
        }
        return list;
    }

}
