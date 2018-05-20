package solution;

import java.util.HashSet;
import java.util.Set;

import utils.Util;

/**
 * Created by mr.lin on 2018/5/20.
 * <p>
 * Contains Duplicate II
 * <p>
 * https://leetcode.com/explore/learn/card/hash-table/184/comparison-with-other-data-structures/1121/
 */
public class DuplicateSolution {

    public String solution(String input) {
        String[] s = input.split("!");
        return Boolean.toString(containsNearbyDuplicate(Util.stringToIntegerArray(s[0]), Integer.parseInt(s[1])));
    }

    private boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
    }

}
