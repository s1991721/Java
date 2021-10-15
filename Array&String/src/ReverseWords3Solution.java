/**
 * @Author: Jef
 * @Date: 2021/10/15 17:17
 * @Description https://leetcode.com/explore/learn/card/array-and-string/204/conclusion/1165/
 */
public class ReverseWords3Solution {

    public static String reverseWords(String s) {
        String[] temp = s.split(" ");
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < temp.length; i++) {
            result = result.append(reverseString(temp[i])).append(" ");
        }

        return result.toString().trim();
    }

    public static String reverseString(String word) {

        char[] s = word.toCharArray();

        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        return new String(s);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("God Ding").toString());
    }
}
