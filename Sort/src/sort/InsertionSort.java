package sort;

import util.Utils;

/**
 * Created by mr.lin on 2018/4/6.
 * 插入排序
 */
public class InsertionSort {

    public String sort(int[] numbers) {

        long stamp = System.currentTimeMillis();

        for (int i = 1; i < numbers.length; i++) {

            int prePosition = i - 1;
            int current = numbers[i];
            while (prePosition >= 0 && current < numbers[prePosition]) {
                numbers[prePosition + 1] = numbers[prePosition];
                prePosition--;
            }
            numbers[prePosition + 1] = current;
        }

        return Utils.intsToString(numbers) + "   cost:" + (System.currentTimeMillis() - stamp);

    }

}
