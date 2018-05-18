package solution;

/**
 * Created by mr.lin on 2018/5/18.
 * <p>
 * Isomorphic Strings
 * <p>
 * https://leetcode.com/explore/learn/card/hash-table/184/comparison-with-other-data-structures/1117/
 */
public class IsomorphicStringSolution {

    public String solution(String input) {
        String[] strings = input.split("ljf");
        return Boolean.toString(isIsomorphic(strings[0], strings[1]));
    }

    public boolean isIsomorphic(String s, String t) {
        int m1[] = new int[256];
        int m2[] = new int[256];
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        return true;

    }

}
