package solution;

import java.util.HashMap;

/**
 * Created by mr.lin on 2018/5/21.
 * <p>
 * Longest Substring Without Repeating Characters
 * <p>
 * https://leetcode.com/explore/learn/card/hash-table/187/conclusion-hash-table/1135/
 */
public class SubstringWithoutRepeatingSolution {

    public String solution(String input) {
        return lengthOfLongestSubstring(input) + "";
    }

    private int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> hashMap = new HashMap<>();

        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                start = Math.max(start, hashMap.get(s.charAt(i)) + 1);
            }
            if ((i - start + 1) > max) {
                max = i - start + 1;
            }
            hashMap.put(s.charAt(i), i);
        }

        return max;
    }

}