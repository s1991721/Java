package sort;

import util.Utils;

/**
 * Created by mr.lin on 2018/4/7.
 * 希尔排序
 */
public class ShellSort {

    public String sort(int[] numbers) {

        long stamp = System.currentTimeMillis();

        int gap = numbers.length / 2;

        while (gap > 0) {

            for (int i = gap; i < numbers.length; i++) {
                int prePosition = i - gap;
                while (prePosition > 0 && numbers[prePosition] > numbers[prePosition + gap]) {
                    Utils.swap(numbers, prePosition, prePosition + gap);
                    prePosition = prePosition - gap;
                }
            }

            gap = gap / 2;

        }


        return Utils.intsToString(numbers) + "   cost:" + (System.currentTimeMillis() - stamp);

    }

}
