package solution;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/explore/learn/card/queue-stack/239/conclusion/1387/
 */
public class StackUsingQueuesSolution {

    static class MyStack {

        Queue<Integer> q = new LinkedList<Integer>();

        // Push element x onto stack.
        public void push(int x) {
            q.add(x);

            int n = q.size();
            while (n-- > 1)
                q.add(q.poll());
        }

        // Removes the element on top of the stack.
        public int pop() {
            return q.poll();
        }

        // Get the top element.
        public int top() {
            return q.peek();
        }

        // Return whether the stack is empty.
        public boolean empty() {
            return q.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
//        System.out.println(myStack.push(1) + "");
//        System.out.println(myStack.push(2) + "");
        System.out.println(myStack.pop() + "");
        System.out.println(myStack.pop() + "");
        System.out.println(myStack.empty() + "");
    }

}
