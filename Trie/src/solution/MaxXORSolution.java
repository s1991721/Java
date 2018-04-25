package solution;

import java.util.List;

import Util.Utils;

/**
 * Created by mr.lin on 2018/4/22.
 * <p>
 * Maximum XOR of Two Numbers in an Array
 * <p>
 * https://leetcode.com/explore/learn/card/trie/149/practical-application-ii/1057/
 */
public class MaxXORSolution {

    public String solution(String input) {

        List<Integer> nums = Utils.stringToIntList(input);


        return String.valueOf(findMaximumXOR(nums));
    }

    private int findMaximumXOR(List<Integer> nums) {

        TrieNode root = new TrieNode();
        buildTrie(nums, root);

        int max = 0;

        for (int num : nums) {
            int res = 0;
            TrieNode node = root;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                if (node.children[bit ^ 1] != null) {
                    res += 1 << i;
                    node = node.children[bit ^1];
                } else {
                    node = node.children[bit];
                }
            }
            max = Math.max(res, max);
        }
        return max;
    }

    private void buildTrie(List<Integer> nums, TrieNode root) {
        for (int num : nums) {
            TrieNode node = root;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                if (node.children[bit] == null) {
                    node.children[bit] = new TrieNode();
                }
                node = node.children[bit];
            }
        }
    }

    class TrieNode {
        TrieNode[] children = new TrieNode[2];
    }
}
