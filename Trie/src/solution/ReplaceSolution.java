package solution;

import java.util.Arrays;
import java.util.List;

import model.TrieNode;

/**
 * Created by mr.lin on 2018/4/21.
 * <p>
 * Replace Words
 * <p>
 * https://leetcode.com/explore/learn/card/trie/148/practical-application-i/1053/
 */
public class ReplaceSolution {

    public String solution(String input) {
        String[] strings = input.split("!");
        String trie = strings[0].substring(1, strings[0].length() - 1);
        List<String> dict = Arrays.asList(trie.split(","));
        return replaceWords(dict, strings[1]);
    }

    private String replaceWords(List<String> dict, String sentence) {
        TrieNode root = buildTrie(dict);
        return replaceWords(root, sentence.split(" "));
    }

    private TrieNode buildTrie(List<String> dict) {
        TrieNode root = new TrieNode();
        for (String s : dict) {
            TrieNode node = root;
            char[] array = s.toCharArray();
            for (int i = 0; i < array.length; i++) {
                if (node.nexts.get(array[i]) == null) {
                    TrieNode temp = new TrieNode();
                    node.nexts.put(array[i], temp);
                    node = temp;
                } else {
                    node = node.nexts.get(array[i]);
                }
            }
            node.isWord = true;
        }

        return root;
    }

    private String replaceWords(TrieNode root, String[] words) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            stringBuilder.append(replaceWords(root, words[i])).append(" ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }

    private String replaceWords(TrieNode root, String word) {
        char[] chars = word.toCharArray();
        TrieNode node = root;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (node.nexts.get(chars[i]) == null) {
                return word;
            } else {
                stringBuilder.append(chars[i]);
                if (node.nexts.get(chars[i]).isWord) {
                    return stringBuilder.toString();
                } else {
                    node = node.nexts.get(chars[i]);
                }
            }
        }
        return stringBuilder.toString();
    }

}
