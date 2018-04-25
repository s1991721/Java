package solution;

import model.TrieNode;

/**
 * Created by mr.lin on 2018/4/25.
 * <p>
 * Add and Search Word - Data structure design
 * <p>
 * https://leetcode.com/explore/learn/card/trie/148/practical-application-i/1052/
 */
public class FuzzySearchSolution {

    public String solution(String input) {
        String[] strings = input.split("!");

        TrieNode root = new TrieNode();
        for (int i = 0; i < strings.length - 1; i++) {
            insert(strings[i], root);
        }

        return Boolean.toString(search(strings[strings.length - 1], root));

    }

    private void insert(String word, TrieNode root) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            if (node.nexts.get(word.charAt(i)) == null) {
                node.nexts.put(word.charAt(i), new TrieNode());
            }
            node = node.nexts.get(word.charAt(i));
        }
        node.isWord = true;
    }

    private boolean search(String word, TrieNode root) {

        if (word.length() == 0) {
            return root.isWord;
        }

        if (word.charAt(0) == '.') {

            for (TrieNode node : root.nexts.values()) {
                if (search(word.substring(1), node)) {
                    return true;
                }
            }
            return false;

        } else {

            if (root.nexts.get(word.charAt(0)) == null) {
                return false;
            }else {
                return search(word.substring(1),root.nexts.get(word.charAt(0)));
            }

        }

    }

}
