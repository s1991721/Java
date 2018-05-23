package solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import utils.Util;

/**
 * Created by mr.lin on 2018/5/23.
 * <p>
 * Top K Frequent Elements
 * <p>
 * https://leetcode.com/explore/learn/card/hash-table/187/conclusion-hash-table/1133/
 */
public class TopFrequentSolution {

    public String solution(String input) {
        String[] strings = input.split("!");

        return topKFrequent(Util.stringToIntegerArray(strings[0]), Integer.parseInt(strings[1])).toString();
    }

    private List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }

        ArrayList<Integer>[] buckets = new ArrayList[nums.length + 1];

        for (Integer key : hashMap.keySet()) {
            if (buckets[hashMap.get(key)] == null) {
                buckets[hashMap.get(key)] = new ArrayList<>();
            }
            buckets[hashMap.get(key)].add(key);
        }

        List<Integer> res = new ArrayList<>();
        for (int i = nums.length; res.size() < k && i >= 0; i--) {
            if (buckets[i] != null && buckets[i].size() > 0) {
                res.addAll(buckets[i]);
            }
        }

        return res;
    }

}
