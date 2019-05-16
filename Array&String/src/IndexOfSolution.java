/**
 * Created by mr.lin on 2019/5/16
 * <p>
 * Implement strStr()
 * <p>
 * https://leetcode.com/explore/learn/card/array-and-string/203/introduction-to-string/1161/
 */
public class IndexOfSolution {

    public static int strStr(String haystack, String needle) {

        if (needle.isEmpty()) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {//不要走多余的路

            if (haystack.charAt(i) == needle.charAt(0)) {
                int j = 0;
                for (; j < needle.length(); j++) {
                    //needle长
                    if ((i + j) >= haystack.length() || haystack.charAt(i + j) != needle.charAt(j)) {
                        break;
                    }
                }
                if (j == needle.length())
                    return i;

            }

        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("aaa", "aaaa"));
    }

}
