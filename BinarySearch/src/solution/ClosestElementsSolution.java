package solution;

import java.util.ArrayList;
import java.util.List;

import utils.Util;

/**
 * Created by mr.lin on 2018/7/11.
 * <p>
 * Find K Closest Elements
 * <p>
 * https://leetcode.com/explore/learn/card/binary-search/135/template-iii/945/
 */
public class ClosestElementsSolution {

    public String solution(String input) {
        String[] strings = input.split("!");

        int[] nums = Util.stringToIntegerArray(strings[0]);
        int k = Integer.parseInt(strings[1]);
        int x = Integer.parseInt(strings[2]);

        return findClosestElements(nums, k, x).toString();

    }

    private List<Integer> findClosestElements(int[] nums, int k, int x) {

        int left = 0;
        int right = nums.length - k;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (Math.abs(nums[mid] - x) > Math.abs(nums[mid + k] - x)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        List<Integer> res = new ArrayList<Integer>();

        for (int i = 0; i < k; i++) {
            res.add(nums[left + i]);
        }
        return res;
    }
}
