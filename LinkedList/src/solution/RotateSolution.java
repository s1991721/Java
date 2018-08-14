package solution;

import entity.ListNode;
import util.Utils;

/**
 * Created by mr.lin on 2018/8/13.
 * <p>
 * Rotate List
 * <p>
 * https://leetcode.com/explore/learn/card/linked-list/213/conclusion/1295/
 */
public class RotateSolution {

    public String solution(String input) {
        String[] strings = input.split("!");

        ListNode head = Utils.stringToListNode(strings[0]);
        int k = Integer.valueOf(strings[1]);

        return Utils.listNodeToString(rotateRight(head, k));
    }

    private ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode node = head;
        int len = 1;

        while (node.next != null) {//求链表长度，node指到结尾
            node = node.next;
            len++;
        }

        node.next = head;//将链表连成环
        k = k % len;
        k = len - k;

        while (k-- > 0) {//将倒数第k项，变为正数，移到对应点
            node = node.next;
        }
        head = node.next;
        node.next = null;//切断环

        return head;
    }
}
