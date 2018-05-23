package solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Created by mr.lin on 2018/5/23.
 * <p>
 * Insert Delete GetRandom O(1)
 * <p>
 * https://leetcode.com/explore/learn/card/hash-table/187/conclusion-hash-table/1141/
 */
public class QuickIDR {

    class RandomizedSet {

        private List<Integer> list;
        private HashMap<Integer,Integer> map;

        /** Initialize your data structure here. */
        public RandomizedSet() {
            list = new ArrayList<>();
            map = new HashMap<>();
        }

        /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
        public boolean insert(int val) {
            if(map.containsKey(val))return false;
            map.put(val,list.size());
            list.add(val);
            return true;
        }

        /** Removes a value from the set. Returns true if the set contained the specified element. */
        public boolean remove(int val) {
            if (map.containsKey(val)) {
                int p = map.get(val);
                int lastV = list.get(list.size() - 1);
                list.set(p, lastV);
                list.remove(list.size() - 1);//耗时操作，每删除一项就要移动后面的向前移，list实际存储为数组

                map.put(lastV, p);
                map.remove(val);

                return true;
            }
            return false;
        }

        /** Get a random element from the set. */
        public int getRandom() {
            Random random=new Random();
            int p=random.nextInt(list.size());
            return list.get(p);
        }
    }

}
