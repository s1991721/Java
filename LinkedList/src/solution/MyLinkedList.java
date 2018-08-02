package solution;

/**
 * Created by mr.lin on 2018/8/2.
 * Data Structure
 */
public class MyLinkedList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }

    private Node head;
    int size;

    MyLinkedList() {
    }

    int get(int index) {
        Node node = findNodeAt(index);

        if (node == null) {
            return -1;
        } else {
            return node.val;
        }
    }

    void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }

    private Node findNodeAt(int index) {
        if (head == null) {
            return null;
        }
        Node tempNode = head;
        for (int i = 1; i <= index; i++) {
            if (tempNode.next != null) {
                tempNode = tempNode.next;
            } else {
                return null;
            }
        }
        return tempNode;
    }

    void addAtTail(int val) {
        Node node = new Node(val);
        if (size == 0) {
            head = node;
            return;
        }
        Node tailNode = findNodeAt(size - 1);
        tailNode.next = node;
        size++;
    }

    void addAtIndex(int index, int val) {
        if (index==0){
            addAtHead(val);
            return;
        }

        Node pre = findNodeAt(index - 1);
        if (pre == null) {
            return;
        }

        Node node = new Node(val);

        node.next = pre.next;

        pre.next = node;
        size++;
    }

    void deleteAtIndex(int index) {
        Node pre = findNodeAt(index - 1);

        if (pre == null) {
            return;
        }

        Node current = pre.next;

        if (current==null) {
            return;
        }

        Node next = current.next;

        pre.next = next;
        size--;
    }

}
