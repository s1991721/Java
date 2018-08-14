package solution;

/**
 * Created by mr.lin on 2018/8/8.
 * <p>
 * Flatten a Multilevel Doubly Linked List
 * <p>
 * https://leetcode.com/explore/learn/card/linked-list/213/conclusion/1225/
 */
public class FlattenMultilevelSolution {

    public String solution(String input) {
        return "";
    }


    private Node flatten(Node head) {

        if (head == null) {
            return null;
        }

        Node node = head;

        while (node != null) {
            if (node.child != null) {
                Node temp = node.next;//存next
                node.next = flatten(node.child);//将child抹平返回头节点
                node.child = null;//删除child
                node.next.prev = node;//连接抹平的点
                while (node.next != null) {//移动到新连接链表的末尾
                    node = node.next;
                }
                node.next = temp;//将之前存储的next连接
                if (temp != null) {
                    temp.prev = node;
                }
            } else {
                node = node.next;
            }
        }

        return head;
    }

    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node() {
        }

        public Node(int _val, Node _prev, Node _next, Node _child) {
            val = _val;
            prev = _prev;
            next = _next;
            child = _child;
        }
    }
}
