package solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import model.TreeNode;
import utils.Util;

/**
 * Created by mr.lin on 2018/5/21.
 * <p>
 * Find Duplicate Subtrees
 * <p>
 * https://leetcode.com/explore/learn/card/hash-table/185/hash_table_design_the_key/1127/
 */
public class DuplicateSubtrees {

    HashMap<String, Integer> trees = new HashMap<String, Integer>();
    List<TreeNode> res = new ArrayList<TreeNode>();

    public String solution(String input) {
        return findDuplicateSubtrees(Util.stringToTreeNode(input)).toString();
    }

    private List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        preorder(root);
        return res;
    }

    private String preorder(TreeNode root) {
        if (root == null) return "#";
        StringBuilder s = new StringBuilder();
        s.append(root.val + "");
        s.append(preorder(root.left));
        s.append(preorder(root.right));

        if (!trees.containsKey(s.toString())) {
            trees.put(s.toString(), 0);
        } else {
            trees.put(s.toString(), trees.get(s.toString()) + 1);
        }

        if (trees.get(s.toString()) == 1) {
            res.add(root);
        }

        return s.toString();
    }
}
