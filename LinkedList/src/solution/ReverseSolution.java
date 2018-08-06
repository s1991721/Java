package solution;

import entity.ListNode;
import util.Utils;

/**
 * Created by mr.lin on 2018/8/4.
 * <p>
 * Reverse Linked List
 * <p>
 * https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1205/
 */
public class ReverseSolution {

    public String solution(String input) {

        ListNode head = Utils.stringToListNode(input);

        return reverseList(head).toString();
    }

//    private ListNode reverseList(ListNode head) {
//
//        ListNode pre = null;
//
//        while (head != null) {
//            ListNode temp = head.next;
//            head.next = pre;
//            pre = head;
//            head = temp;
//        }
//
//        return pre;
//
//    }

    private ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }

    private ListNode reverse(ListNode curNode, ListNode preNode) {

        if (curNode == null) {
            return preNode;
        }

        ListNode temp = curNode.next;

        curNode.next = preNode;

        return reverse(temp, curNode);

    }
}
