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
            if (lastNode == null) return null;//不存在倒数第n项
        }

        ListNode preNode = null;//倒数第n+1项
        ListNode curNode = head;//倒数第n项

        while (lastNode.next != null) {//快指针到终点了，各点就位
            lastNode = lastNode.next;
            preNode = curNode;
            curNode = curNode.next;
        }

        if (preNode==null){//移除操作
            head=curNode.next;
        }else {
            preNode.next = curNode.next;
        }

        return head;
    }

}
