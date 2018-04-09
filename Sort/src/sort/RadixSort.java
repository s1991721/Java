package sort;

import java.util.ArrayList;

import util.Utils;

/**
 * Created by mr.lin on 2018/4/9.
 * 基数排序
 */
public class RadixSort {

    public String sort(int[] numbers) {

        long stamp = System.currentTimeMillis();

        ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
        int max = numbers[0];
        int radix = 10;

        for (int i = 0; i < 10; i++) {
            temp.add(i, new ArrayList<Integer>());
        }


        do {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
                temp.get(numbers[i] % radix / (radix / 10)).add(numbers[i]);
            }

            int p = 0;

            for (int i = 0; i < temp.size(); i++) {
                for (int j = 0; j < temp.get(i).size(); j++) {
                    numbers[p++] = temp.get(i).get(j);
                }
                temp.get(i).clear();
            }
            radix *= 10;
        } while (radix < max * 10);

        return Utils.intsToString(numbers) + "   cost:" + (System.currentTimeMillis() - stamp);

    }

}
