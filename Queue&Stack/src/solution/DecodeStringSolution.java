package solution;

import java.util.Stack;

/**
 * https://leetcode.com/explore/learn/card/queue-stack/239/conclusion/1379/
 */
public class DecodeStringSolution {

    public static String decodeString(String s) {
        String res = "";
        Stack<Integer> countStack = new Stack();
        Stack<String> resStack = new Stack();
        int index = 0;

        while (index < s.length()) {

            if (Character.isDigit(s.charAt(index))) {
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = count * 10 + (s.charAt(index) - '0');
                    index++;
                }
                countStack.push(count);
            } else if (s.charAt(index) == '[') {
                resStack.push(res);
                res = "";
                index++;
            } else if (s.charAt(index) == ']') {
                StringBuffer temp = new StringBuffer(resStack.pop());
                int repeat = countStack.pop();
                for (int i = 0; i < repeat; i++) {
                    temp.append(res);
                }
                res = temp.toString();
                index++;
            } else {
                res += s.charAt(index++);
            }

        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(decodeString("3[a2[c]]"));
    }

}
