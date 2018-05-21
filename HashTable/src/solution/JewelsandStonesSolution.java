package solution;

import java.util.HashMap;

/**
 * Created by mr.lin on 2018/5/21.
 * <p>
 * Jewels and Stones
 * <p>
 * https://leetcode.com/explore/learn/card/hash-table/187/conclusion-hash-table/1136/
 */
public class JewelsandStonesSolution {

    public String solution(String input) {
        String[] s = input.split("!");

        return numJewelsInStones(s[0], s[1]) + "";
    }

    private int numJewelsInStones(String J, String S) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < J.length(); i++) {
            hashMap.put(J.charAt(i), 0);
        }

        for (int i = 0; i < S.length(); i++) {
            if (hashMap.containsKey(S.charAt(i))) {
                hashMap.put(S.charAt(i), hashMap.get(S.charAt(i)) + 1);
            }
        }

        int sum = 0;
        for (Integer i : hashMap.values()) {
            sum += i;
        }
        return sum;
    }

}
