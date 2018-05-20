package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import utils.Util;

/**
 * Created by mr.lin on 2018/5/20.
 * <p>
 * Group Anagrams
 * <p>
 * https://leetcode.com/explore/learn/card/hash-table/185/hash_table_design_the_key/1124/
 */
public class AnagramsSolution {

    public String solution(String input) {
        return groupAnagrams(Util.stringToStrings(input)).toString();
    }

    private List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!hashMap.containsKey(key)) {
                hashMap.put(key, new ArrayList<String>());
            }
            hashMap.get(key).add(str);
        }
        return new ArrayList<List<String>>(hashMap.values());
    }
}