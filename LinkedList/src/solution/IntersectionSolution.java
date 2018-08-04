package solution;

import entity.ListNode;
import util.Utils;

/**
 * Created by mr.lin on 2018/8/2.
 * <p>
 * Intersection of Two Linked Lists
 * <p>
 * https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1215/
 */
public class IntersectionSolution {

    public String solution(String input) {

        String[] strings = input.split("!");
        int[] nums1 = Utils.stringToIntegerArray(strings[0]);
        int[] nums2 = Utils.stringToIntegerArray(strings[1]);

        ListNode headA = Utils.intArrayToListNode(nums1);
        ListNode headB = Utils.intArrayToListNode(nums2);

        ListNode intersectionNode = getIntersectionNode(headA, headB);
        if (intersectionNode == null) {
            return "null";
        }

        return intersectionNode.toString();
    }

    private ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }

        return a;

    }
}
