package solution;

import entity.ListNode;
import util.Utils;

/**
 * Created by mr.lin on 2018/8/6.
 * <p>
 * Remove Linked List Elements
 * <p>
 * https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1207/
 */
public class RemoveSolution {

    public String solution(String input) {

        String[] strings = input.split("!");
        ListNode head = Utils.stringToListNode(strings[0]);
        int val = Integer.valueOf(strings[1]);

        ListNode node = removeElements(head, val);
        return node == null ? "null" : node.toString();
    }

    private ListNode removeElements(ListNode head, int val) {

        ListNode node = head;
        ListNode pre = null;

        while (node != null) {

            if (node.val == val) {
                if (pre != null) {
                    pre.next = node.next;
                } else {
                    head = node.next;
                }
                node = node.next;
            } else {
                pre = node;
                node = node.next;
            }

        }

        return head;
    }
}
