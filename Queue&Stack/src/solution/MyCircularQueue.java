package solution;

public class MyCircularQueue {

    private int[] queue;
    private int headP;
    private int tailP;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public MyCircularQueue(int k) {
        queue = new int[k + 1];
        headP = 0;
        tailP = 0;
        for (int i = 0; i < k + 1; i++) {
            queue[i] = -1;
        }
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {

        if (!isFull()) {
            queue[tailP] = value;
            tailP = (tailP + 1) % queue.length;
            return true;
        }

        return false;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (!isEmpty()) {
            queue[headP] = -1;
            headP = (headP + 1) % queue.length;
            return true;
        }

        return false;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        return queue[headP];
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        return queue[(tailP + queue.length - 1) % queue.length];
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return headP == tailP;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return (tailP + 1) % queue.length == headP;
    }

}
