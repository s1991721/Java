package solution;

import entity.ListNode;
import util.Utils;

/**
 * Created by mr.lin on 2018/8/7.
 * <p>
 * Palindrome Linked List
 * <p>
 * https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1209/
 */
public class PalindromeSolution {

    public String solution(String input) {

        ListNode head = Utils.stringToListNode(input);

        return Boolean.toString(isPalindrome(head));
    }

    private boolean isPalindrome(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {//慢走1快走2，当快到终点时，慢在中点
            fast = fast.next.next;
            slow = slow.next;
        }

        if (fast != null) {//长度为奇数
            slow = slow.next;
        }

        slow = reverse(slow);//将后半部翻转

        fast = head;
        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }

        return true;

    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null;

        while (head != null) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }

        return pre;
    }
}
