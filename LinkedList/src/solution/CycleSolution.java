package solution;

import entity.ListNode;
import util.Utils;

/**
 * Created by mr.lin on 2018/8/2.
 * <p>
 * Linked List Cycle II
 * <p>
 * https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1214/
 */
public class CycleSolution {

    public String solution(String input) {

        int[] nums = Utils.stringToIntegerArray(input);

        ListNode head = Utils.intArrayToListNode(nums);

        ListNode node=detectCycle(head);
        if (node==null){
            return "null";
        }
        return node.toString();
    }

    private ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }

        return null;
    }

}
