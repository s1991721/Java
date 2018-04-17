package solution;

import common.Utils;
import model.Node;

/**
 * Created by mr.lin on 2018/4/17.
 * <p>
 * Maximum Depth of N-ary Tree
 * <p>
 * https://leetcode.com/explore/learn/card/n-ary-tree/131/recursion/919/
 */
public class DepthSolution {

    public String solution(String input) {
        Node root = Utils.stringToNode(input);
        int depth = depth(root);
        return String.valueOf(depth);
    }

    private int depth(Node root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        for (Node node : root.children) {
            int temp = depth(node);
            if (temp > max) {
                max = temp;
            }
        }
        return max + 1;
    }

}
