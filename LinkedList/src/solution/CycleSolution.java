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

        while (fast != null && fast.next != null) {//遇到终点说明不是环
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {//同起点，直线中快点不会与慢点相遇，相遇则证明有环
                fast = head;//相遇后让快点从起点开始按慢点的速度跑
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
                // 通过画图得出
                // 相遇点距环起点的距离
                // 等于
                // 起点距环起点距离加n倍的环周长
            }
        }

        return null;
    }

}
