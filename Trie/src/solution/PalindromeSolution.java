package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by mr.lin on 2018/5/13.
 * <p>
 * <p>
 * Palindrome Pairs
 * <p>
 * https://leetcode.com/explore/learn/card/trie/149/practical-application-ii/1138/
 */
public class PalindromeSolution {

    public String solution(String input) {

        String[] words = input.split(",");

        return palindromePairs(words).toString();
    }

    private List<List<Integer>> palindromePairs(String[] words) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        TrieNode root = new TrieNode();
        for (int i = 0; i < words.length; i++) {
            addWord(root, words[i], i);
        }

        for (int i = 0; i < words.length; i++) {
            search(words[i], i, root, res);
        }

        return res;
    }

    private void addWord(TrieNode root, String word, int index) {
        TrieNode node = root;
        for (int i = word.length() - 1; i >= 0; i--) {
            if (node.children.get(word.charAt(i)) == null) {
                node.children.put(word.charAt(i), new TrieNode());
            }
            if (isPalindrome(word, 0, i)) node.list.add(index);
            node = node.children.get(word.charAt(i));
        }
        node.index = index;
        node.list.add(index);
    }

    private void search(String word, int index, TrieNode root, List<List<Integer>> res) {
        for (int i = 0; i < word.length(); i++) {
            if (root.index >= 0 && root.index != index && isPalindrome(word, i, word.length() - 1)) {
                res.add(Arrays.asList(index, root.index));
            }
            root = root.children.get(word.charAt(i));

            if (root == null) {
                return;
            }
        }
        for (int i : root.list) {
            if (i == index) {
                continue;
            }
            res.add(Arrays.asList(index, i));
        }
    }

    private boolean isPalindrome(String word, int start, int end) {
        while (start < end) {
            if (word.charAt(start++) != word.charAt(end--)) {
                return false;
            }
        }
        return true;
    }

    class TrieNode {
        HashMap<Character, TrieNode> children;
        int index;
        List<Integer> list;

        public TrieNode() {

            children = new HashMap<Character, TrieNode>();
            index = -1;
            list = new ArrayList<Integer>();

        }
    }


}