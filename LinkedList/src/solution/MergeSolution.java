package solution;

import entity.ListNode;
import util.Utils;

/**
 * Created by mr.lin on 2018/8/7.
 * <p>
 * Merge Two Sorted Lists
 * <p>
 * https://leetcode.com/explore/learn/card/linked-list/213/conclusion/1227/
 */
public class MergeSolution {

    public String solution(String input) {

        String[] strings = input.split("!");

        ListNode node1 = Utils.stringToListNode(strings[0]);
        ListNode node2 = Utils.stringToListNode(strings[1]);

        return Utils.listNodeToString(mergeTwoLists(node1, node2));
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head = null;
        ListNode node = null;

        ListNode temp;

        while (l1 != null || l2 != null) {

            if (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    temp = l1;
                    l1 = l1.next;
                } else {
                    temp = l2;
                    l2 = l2.next;
                }
            } else if (l1 == null) {
                temp = l2;
                l2 = l2.next;
            } else {
                temp = l1;
                l1 = l1.next;
            }

            if (head == null) {
                head=temp;
                node=temp;
            }else {
                node.next = temp;
                node = node.next;
            }

        }

        return head;

    }
}
