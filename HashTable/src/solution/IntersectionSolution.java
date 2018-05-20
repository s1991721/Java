package solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import utils.Util;

/**
 * Created by mr.lin on 2018/5/20.
 * <p>
 * Intersection of Two Arrays II
 * <p>
 * https://leetcode.com/explore/learn/card/hash-table/184/comparison-with-other-data-structures/1178/
 */
public class IntersectionSolution {

    public String solution(String input) {
        String[] s = input.split("!");
        int[] res = intersect(Util.stringToIntegerArray(s[0]), Util.stringToIntegerArray(s[1]));
        return Util.integerArrayToString(res);
    }

    private int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums1.length; i++) {
            if (hashMap.containsKey(nums1[i])) {
                hashMap.put(nums1[i], hashMap.get(nums1[i]) + 1);
            } else {
                hashMap.put(nums1[i], 1);
            }
        }

        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < nums2.length; i++) {
            if (hashMap.containsKey(nums2[i]) && hashMap.get(nums2[i]) >= 1) {
                res.add(nums2[i]);
                hashMap.put(nums2[i], hashMap.get(nums2[i]) - 1);
            }
        }

        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;

    }

}
