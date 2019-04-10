package solution;

import java.util.Stack;

/**
 * https://leetcode.com/explore/learn/card/queue-stack/230/usage-stack/1363/
 */
public class DailyTemperaturesSolution {

    public int[] dailyTemperatures(int[] T) {

        Stack<Integer> stack = new Stack<Integer>();
        int[] waits = new int[T.length];

        for (int i = 0; i < T.length; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                int index = stack.pop();
                waits[index] = i - index;
            }
            stack.push(i);
        }
        return waits;

    }

}
