package solution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Util.Utils;

/**
 * Created by mr.lin on 2018/4/25.
 * <p>
 * Word Search II
 * <p>
 * https://leetcode.com/explore/learn/card/trie/149/practical-application-ii/1056/
 */
public class MatrixSearchSolution {

    public String solution(String input) {
        String[] strings = input.split("!");

        String[] lines = strings[0].split("\\$");
        char[][] board = new char[lines.length][];
        for (int i = 0; i < lines.length; i++) {
            String[] rows = lines[i].split(",");
            board[i] = new char[rows.length];
            for (int j = 0; j < rows.length; j++) {
                board[i][j] = rows[j].charAt(0);
            }
        }

        List<String> words = Utils.stringToStringList(strings[1]);

        return findWords(board, words);
    }

    Set<String> res = new HashSet<String>();

    private String findWords(char[][] board, List<String> words) {

        Trie trie = new Trie();
        for (String s : words) {
            trie.insert(s);
        }

        int y = board.length;
        int x = board[0].length;

        boolean[][] visited = new boolean[y][x];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                dfs(board, visited, "", i, j, trie);
            }
        }

        return res.toString();
    }

    public void dfs(char[][] board, boolean[][] visited, String str, int x, int y, Trie trie) {
        if (x < 0 || x >= board[0].length || y < 0 || y >= board.length) return;
        if (visited[y][x]) return;

        str += board[y][x];

        if (!trie.startWith(str)) return;

        if (trie.search(str)) {
            res.add(str);
        }
        visited[y][x] = true;

        dfs(board, visited, str, x - 1, y, trie);
        dfs(board, visited, str, x + 1, y, trie);
        dfs(board, visited, str, x, y - 1, trie);
        dfs(board, visited, str, x, y + 1, trie);

        visited[y][x] = false;

    }

    class TrieNode {
        HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
        boolean isWord;
    }

    class Trie {
        TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            TrieNode node = root;
            char[] chars = word.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (node.children.get(chars[i]) == null) {
                    node.children.put(chars[i], new TrieNode());
                }
                node = node.children.get(chars[i]);
            }
            node.isWord = true;
        }

        public boolean search(String word) {
            TrieNode node = root;
            char[] chars = word.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (node.children.get(chars[i]) == null) {
                    return false;
                } else {
                    node = node.children.get(chars[i]);
                }
            }
            return node.isWord;
        }

        public boolean startWith(String prefix) {
            TrieNode node = root;
            char[] chars = prefix.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (node.children.get(chars[i]) == null) {
                    return false;
                }
                node = node.children.get(chars[i]);
            }
            return true;
        }
    }

}
