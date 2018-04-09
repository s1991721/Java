package sort;

import util.Utils;

/**
 * Created by mr.lin on 2018/4/6.
 * 冒泡
 */
public class BubbleSort {

    public String sort(int[] numbers) {

        long stamp = System.currentTimeMillis();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    Utils.swap(numbers, j, j + 1);
                }
            }
        }

        return Utils.intsToString(numbers) + "   cost:" + (System.currentTimeMillis() - stamp);

    }


}
