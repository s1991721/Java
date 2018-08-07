package solution;

/**
 * Created by mr.lin on 2018/8/7.
 * <p>
 * Design Linked List
 * <p>
 * https://leetcode.com/explore/learn/card/linked-list/210/doubly-linked-list/1294/
 */
public class MyDoublyLinkedList {

    class Node {
        Node pre, next;
        int val;

        public Node(int val) {
            this.val = val;
        }
    }

    Node head;

    public MyDoublyLinkedList() {

    }

    public int get(int index) {

        Node node = head;

        for (int i = 0; i < index; i++) {
            if (node == null) return -1;
            node = node.next;
        }

        if (node == null) return -1;
        return node.val;

    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.pre = null;
        node.next = head;
        if (head != null) {
            head.pre = node;
        }
        head = node;
    }

    public void addAtTail(int val) {

        Node node = new Node(val);

        if (head == null) {
            head = node;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        node.pre = temp;
        node.next = null;
        temp.next = node;
    }

    public void addAtIndex(int index, int val) {

        Node temp = head;

        for (int i = 0; i < index; i++) {
            if (temp == null) return;
            temp = temp.next;
        }

        if (temp == null) {
            addAtTail(val);
            return;
        }

        Node node = new Node(val);
        node.next = temp;
        node.pre = temp.pre;

        temp.pre.next = node;
        temp.pre = node;
    }

    public void deleteAtIndex(int index) {
        Node temp = head;

        for (int i = 0; i < index; i++) {
            if (temp == null) return;
            temp = temp.next;
        }

        if (temp==null) return;

        if (temp.pre != null) {
            temp.pre.next = temp.next;
        }

        if (temp.next != null) {
            temp.next.pre = temp.pre;
        }
    }

}
