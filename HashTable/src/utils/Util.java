package utils;

import java.util.LinkedList;
import java.util.Queue;

import model.TreeNode;

/**
 * Created by mr.lin on 2018/5/13.
 */
public class Util {

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

    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }

    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }

        String result = "";
        for (int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String[] stringToStrings(String input) {
        return input.split(",");
    }

    public static char[][] stringToCharChar(String input) {
        String[] rows = input.substring(1, input.length() - 1).split("!");

        char[][] res=new char[rows.length][];
        for (int i = 0; i < rows.length; i++) {
            res[i]=stringToChar(rows[i]);
        }


        return res;

    }

    public static char[] stringToChar(String input) {
        String[] rows = input.substring(1, input.length() - 1).split(",");
        char[] res = new char[rows.length];
        for (int i = 0; i < rows.length; i++) {
            res[i] = rows[i].toCharArray()[0];
        }
        return res;
    }

    public static TreeNode stringToTreeNode(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return null;
        }

        String[] parts = input.split(",");
        String item = parts[0];
        TreeNode root = new TreeNode(Integer.parseInt(item));
        Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();
        nodeQueue.add(root);

        int index = 1;
        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();

            if (index == parts.length) {
                break;
            }

            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int leftNumber = Integer.parseInt(item);
                node.left = new TreeNode(leftNumber);
                nodeQueue.add(node.left);
            }

            if (index == parts.length) {
                break;
            }

            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int rightNumber = Integer.parseInt(item);
                node.right = new TreeNode(rightNumber);
                nodeQueue.add(node.right);
            }
        }
        return root;
    }

}
