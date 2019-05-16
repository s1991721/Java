/**
 * Created by mr.lin on 2019/5/16
 * <p>
 * Longest Common Prefix
 * <p>
 * https://leetcode.com/explore/learn/card/array-and-string/203/introduction-to-string/1162/
 */
public class LongestCommonPrefixSolution {

    public static String longestCommonPrefix(String[] strs) {

        if (strs.length <= 0) {
            return "";
        }

        StringBuffer stringBuffer = new StringBuffer();

        int i = 0;
        while (true) {
            char c = 0;
            for (String str : strs) {
                if (i >= str.length() || str.length() == 0) return stringBuffer.toString();
                if (c == 0) {
                    c = str.charAt(i);
                    continue;
                } else {
                    if (c != str.charAt(i)) {
                        return stringBuffer.toString();
                    }
                }
            }
            stringBuffer.append(c);
            i++;
        }

    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

}
