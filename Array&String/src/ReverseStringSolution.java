/**
 * Created by mr.lin on 2019/5/16
 * <p>
 * Reverse String
 * <p>
 * https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1183/
 */
public class ReverseStringSolution {

    public void reverseString(char[] s) {

        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            swap(s, start, end);
            start++;
            end--;
        }

    }

    private void swap(char[] s, int start, int end) {
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
    }


}
