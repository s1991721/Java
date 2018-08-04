package solution;

import entity.ListNode;
import util.Utils;

/**
 * Created by mr.lin on 2018/8/4.
 * <p>
 * Remove Nth Node From End of List
 * <p>
 * https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1296/
 */
public class RemoveNthFromEndSolution {

    public String solution(String input) {

        String[] strings = input.split("!");
        ListNode head = Utils.stringToListNode(strings[0]);
        int n = Integer.valueOf(strings[1]);

        return removeNthFromEnd(head, n).toString();
    }

    private ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) return null;
        ListNode lastNode = head;

        for (int i = 1; i < n; i++) {
            lastNode = lastNode.next;
            if (lastNode == null) return null;
        }

        ListNode preNode = null;
        ListNode curNode = head;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            preNode = curNode;
            curNode = curNode.next;
        }

        if (preNode==null){
            head=curNode.next;
        }else {
            preNode.next = curNode.next;
        }

        return head;
    }

}
