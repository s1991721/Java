package solution;

import java.util.Stack;

/**
 * https://leetcode.com/explore/learn/card/queue-stack/230/usage-stack/1394/
 */
public class RPNSolution {

    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<Integer>();

        for (String str : tokens) {
            if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                int result = 0;
                if (str.equals("+")) {
                    result = num1 + num2;
                }
                if (str.equals("-")) {
                    result = num1 - num2;
                }
                if (str.equals("*")) {
                    result = num1 * num2;
                }
                if (str.equals("/")) {
                    result = num1 / num2;
                }
                stack.push(result);
            } else {
                stack.push(Integer.valueOf(str));
            }
        }
        return stack.pop();

    }

}
