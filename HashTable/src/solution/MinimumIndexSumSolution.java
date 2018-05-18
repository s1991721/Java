package solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import utils.Util;

/**
 * Created by mr.lin on 2018/5/18.
 * <p>
 * Minimum Index Sum of Two Lists
 * <p>
 * https://leetcode.com/explore/learn/card/hash-table/184/comparison-with-other-data-structures/1177/
 */
public class MinimumIndexSumSolution {

    public String solution(String input) {
        String[] strings = input.split("!");
        String[] list1 = Util.stringToStrings(strings[0]);
        String[] list2 = Util.stringToStrings(strings[1]);
        return findRestaurant(list1, list2)[0];
    }

    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        List<String> res = new ArrayList<String>();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int temp = map.get(list2[i]);
                if (temp + i < min) {
                    res.clear();
                    res.add(list2[i]);
                    min = temp + i;
                }
                if (temp + i == min&&!res.contains(list2[i])) {
                    res.add(list2[i]);
                }
            }
        }
        String[] strings=new String[res.size()];
        res.toArray(strings);
        return strings;
    }
}
