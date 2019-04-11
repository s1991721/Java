package solution;

import java.util.Stack;

/**
 * https://leetcode.com/explore/learn/card/queue-stack/239/conclusion/1386/
 */
public class QueueUsingStacksSolution {

    class MyQueue {

        Stack<Integer> inStack;
        Stack<Integer> outStack;

        /** Initialize your data structure here. */
        public MyQueue() {
            inStack=new Stack<Integer>();
            outStack=new Stack<Integer>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            inStack.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            peek();
            return outStack.pop();
        }

        /** Get the front element. */
        public int peek() {
            if (outStack.isEmpty()) {
                while (!inStack.isEmpty()) {
                    outStack.push(inStack.pop());
                }
            }
            return outStack.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return inStack.isEmpty()&&outStack.isEmpty();
        }
    }

}
