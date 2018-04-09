package sort;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by mr.lin on 2018/4/9.
 * 桶排序
 */
public class BucketSort {

    public String sort(int[] numbers) {

        long stamp = System.currentTimeMillis();

        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }

        int bucketNum = (max - min) / numbers.length + 1;
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < bucketNum; i++) {
            buckets.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < numbers.length; i++) {
            int p = (numbers[i] - min) / numbers.length;
            buckets.get(p).add(numbers[i]);
        }

        for (int i = 0; i < buckets.size(); i++) {
            Collections.sort(buckets.get(i));
        }

        return buckets.toString() + "   cost:" + (System.currentTimeMillis() - stamp);

    }


}
