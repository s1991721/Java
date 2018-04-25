package solution;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mr.lin on 2018/4/25.
 * <p>
 * Map Sum Pairs
 * <p>
 * https://leetcode.com/explore/learn/card/trie/148/practical-application-i/1058/
 */
public class MapSumSolution {

    public String solution(String input) {

        String[] strings = input.split("!");

        TrieNode root = new TrieNode();

        insert(strings[0], Integer.parseInt(strings[1]), root);

        insert(strings[2], Integer.parseInt(strings[3]), root);

        return "" + sum(strings[4], root);
    }

    private void insert(String word, int value, TrieNode root) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            if (node.children.get(word.charAt(i)) == null) {
                node.children.put(word.charAt(i), new TrieNode());
            }
            node = node.children.get(word.charAt(i));
        }
        node.value = value;
        node.isWord = true;
    }

    private int sum(String prefix, TrieNode root) {
        TrieNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            if (node.children.get(prefix.charAt(i)) == null) {
                return 0;
            }
            node = node.children.get(prefix.charAt(i));
        }

        return value(node);
    }

    private int value(TrieNode root) {
        int res = 0;
        if (root == null) return 0;
        if (root.isWord) res += root.value;

        for (TrieNode node : root.children.values()) {
            res += value(node);
        }
        return res;
    }

    class TrieNode {
        int value;
        boolean isWord;
        Map<Character, TrieNode> children;

        public TrieNode() {
            children = new HashMap<Character, TrieNode>();
        }
    }
}
