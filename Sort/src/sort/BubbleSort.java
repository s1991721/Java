package sort;

import util.Utils;

/**
 * Created by mr.lin on 2018/4/6.
 * 冒泡
 */
public class BubbleSort {

    public String sort(int[] numbers) {

        long stamp = System.currentTimeMillis();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    swap(numbers, i, j);
                }
            }
        }

        return Utils.intsToString(numbers) + "   cost:"+(System.currentTimeMillis() - stamp);

    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
