package solution;

import java.util.HashMap;
import java.util.List;

import Util.Utils;

/**
 * Created by mr.lin on 2018/4/22.
 * <p>
 * Maximum XOR of Two Numbers in an Array
 * <p>
 * https://leetcode.com/explore/learn/card/trie/149/practical-application-ii/1057/
 */
public class MaxXORSolution {

    public String solution(String input) {

        List<Integer> ints = Utils.stringToIntList(input);


        return String.valueOf(maxSubarrayXOR(ints, ints.size()));
    }


    private int maxSubarrayXOR(List<Integer> arr, int n) {
        int ans = Integer.MIN_VALUE; // Initialize result

        // Pick starting points of subarrays
        for (int i = 0; i < n; i++) {
            // to store xor of current subarray
            int curr_xor = arr.get(i);

            // Pick ending points of subarrays starting with i
            for (int j = i; j < n; j++) {
                ans = Math.max(ans,  curr_xor ^ arr.get(j));
            }
        }
        return ans;
    }

    class TrieNode {
        boolean isFinish;
        HashMap<Integer, TrieNode> nexts = new HashMap<Integer, TrieNode>();
    }
}
