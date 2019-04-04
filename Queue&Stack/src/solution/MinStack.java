package solution;

import java.util.Stack;

/**
 * https://leetcode.com/explore/learn/card/queue-stack/230/usage-stack/1360/
 */
public class MinStack {

    int min = Integer.MAX_VALUE;
    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack();
    }

    public void push(int x) {
        if (x <= min) {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        if (stack.pop() == min)
            min = stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }

}
