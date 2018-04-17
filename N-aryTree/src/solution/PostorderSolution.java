package solution;

import java.util.ArrayList;
import java.util.List;

import common.Utils;
import model.Node;

/**
 * Created by mr.lin on 2018/4/17.
 *
 * N-ary Tree Postorder Traversal
 *
 * https://leetcode.com/explore/learn/card/n-ary-tree/130/traversal/926/
 */
public class PostorderSolution {

    public String solution(String input) {
        Node root = Utils.stringToNode(input);
        String string = Utils.listToString(postOrder(root));
        return string;
    }

    private List<Integer> postOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        if (root == null) {
            return list;
        }

        for (Node node : root.children) {
            list.addAll(postOrder(node));
        }

        list.add(root.val);
        return list;
    }

}
