/**
 * @Author: Jef
 * @Date: 2021/10/15 16:43
 * @Description
 * https://leetcode.com/explore/learn/card/array-and-string/204/conclusion/1164/
 */
public class ReverseWordsSolution {

    public static String reverseWords(String s) {
        s.trim();
        String[] temp = s.split(" ");
        String result = "";

        for (int i = temp.length - 1; i >= 0; i--) {
            String item = temp[i];
            if (item.trim().length() > 0) {
                result = result.concat(item).concat(" ");
            }
        }

        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  ").toString());
    }

}
