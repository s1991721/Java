package solution;

/**
 * Created by mr.lin on 2018/8/7.
 * <p>
 * Design Linked List
 * <p>
 * https://leetcode.com/explore/learn/card/linked-list/210/doubly-linked-list/1294/
 */
public class MyDoublyLinkedListSolution {

    public String solution(String input) {

        MyDoublyLinkedList myDoublyLinkedList = new MyDoublyLinkedList();
        myDoublyLinkedList.addAtHead(5);
        myDoublyLinkedList.addAtHead(2);
        myDoublyLinkedList.deleteAtIndex(1);
        return "";

    }

}
