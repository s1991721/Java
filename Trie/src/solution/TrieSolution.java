package solution;

import model.TrieNode;

/**
 * Created by mr.lin on 2018/4/25.
 * <p>
 * Insert Search StartWith
 */
public class TrieSolution {

    public String solution(String input) {
        TrieNode root = new TrieNode();
        String[] strings = input.split("!");

        insert(strings[0], root);
        String searchResult = Boolean.toString(search(strings[1], root));
        String startWithResult = Boolean.toString(startWith(strings[2], root));
        return "search result:"+searchResult+"   statrWith result:"+startWithResult;
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
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            if (node.nexts.get(word.charAt(i)) == null) {
                return false;
            }
            node = node.nexts.get(word.charAt(i));
        }
        return node.isWord;
    }

    private boolean startWith(String prefix, TrieNode root) {
        TrieNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            if (node.nexts.get(prefix.charAt(i)) == null) {
                return false;
            }
            node = node.nexts.get(prefix.charAt(i));
        }
        return true;
    }

}
