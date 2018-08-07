package solution;

import entity.ListNode;
import util.Utils;

/**
 * Created by mr.lin on 2018/8/6.
 * <p>
 * Odd Even Linked List
 * <p>
 * https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1208/
 */
public class OddEvenSolution {

    public String solution(String input) {

        ListNode head = Utils.stringToListNode(input);

        return oddEvenList(head).toString();

    }

    private ListNode oddEvenList(ListNode head) {

        if (head == null) return null;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

}
