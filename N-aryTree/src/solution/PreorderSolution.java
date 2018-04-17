package solution;

import java.util.ArrayList;
import java.util.List;

import common.Utils;
import model.Node;

/**
 * Created by mr.lin on 2018/4/16.
 * <p>
 * N-ary Tree Preorder Traversal
 * <p>
 * https://leetcode.com/explore/learn/card/n-ary-tree/130/traversal/925/
 */
public class PreorderSolution {

    public String solution(String input) {
        Node root = Utils.stringToNode(input);
        String string = Utils.listToString(preOrder(root));
        return string;
    }

    private List<Integer> preOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
        }
        list.add(root.val);
        for (Node node : root.children) {
            list.addAll(preOrder(node));
        }

        return list;
    }

}
