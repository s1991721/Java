package model;

import java.util.HashMap;

/**
 * Created by mr.lin on 2018/4/21.
 */
public class TrieNode {
    public boolean isWord;
    public HashMap<Character, TrieNode> nexts = new HashMap<Character, TrieNode>();
}
