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
        ListNode temp1 = l1;
        ListNode temp2 = l2;

        ListNode temp;

        while (temp1 != null || temp2 != null) {

            if (temp1 != null && temp2 != null) {
                if (temp1.val < temp2.val) {
                    temp = temp1;
                    temp1 = temp1.next;
                } else {
                    temp = temp2;
                    temp2 = temp2.next;
                }
            } else if (temp1 == null) {
                temp = temp2;
                temp2 = temp2.next;
            } else {
                temp = temp1;
                temp1 = temp1.next;
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
