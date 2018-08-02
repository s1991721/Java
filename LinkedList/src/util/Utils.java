package util;

import entity.ListNode;

/**
 * Created by mr.lin on 2018/8/2.
 */
public class Utils {

    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for (int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static ListNode intArrayToListNode(int[] nums) {
        ListNode head = new ListNode(nums[0]);
        ListNode pre = head;

        for (int i = 1; i < nums.length; i++) {
            ListNode node = new ListNode(nums[1]);
            pre.next = node;
            pre = node;
        }

        return head;
    }

}
