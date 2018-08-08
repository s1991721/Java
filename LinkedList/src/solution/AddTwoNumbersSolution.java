package solution;

import entity.ListNode;
import util.Utils;

/**
 * Created by mr.lin on 2018/8/8.
 * <p>
 * Add Two Numbers
 * <p>
 * https://leetcode.com/explore/learn/card/linked-list/213/conclusion/1228/
 */
public class AddTwoNumbersSolution {

    public String solution(String input) {
        String[] strings = input.split("!");
        ListNode l1 = Utils.stringToListNode(strings[0]);
        ListNode l2 = Utils.stringToListNode(strings[1]);

        return Utils.listNodeToString(addTwoNumbers(l1, l2));
    }

    private ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = null;

        if (l1 == null || l2 == null) {
            if (l1 == null) {
                head = l2;
            } else {
                head = l1;
            }
            return head;
        }


        ListNode node = null;
        int sum = 0;

        while (l1 != null || l2 != null || sum != 0) {

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            if (head == null) {
                head = new ListNode(sum % 10);
                node = head;
            } else {
                node.next = new ListNode(sum % 10);
                node = node.next;
            }
            sum = sum / 10;
        }

        return head;
    }

}
