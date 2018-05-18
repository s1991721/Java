package solution;

import java.util.HashMap;

/**
 * Created by mr.lin on 2018/5/18.
 * <p>
 * First Unique Character in a String
 * <p>
 * https://leetcode.com/explore/learn/card/hash-table/184/comparison-with-other-data-structures/1120/
 */
public class UniqueCharacterSolution {

    public String solution(String input) {
        return firstUniqChar(input) + "";
    }

    private int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i + s.length());
            } else {
                map.put(s.charAt(i), i);
            }
        }

        int min = s.length();
        for (Character c : map.keySet()) {
            if (map.get(c) < s.length() && map.get(c) < min) {
                min = map.get(c);
            }
        }
        return min == s.length() ? -1 : min;

    }
}
