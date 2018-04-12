package sort;

import util.Utils;

/**
 * Created by mr.lin on 2018/4/8.
 * 快速排序
 */
public class QuickSort {

    public String sort(int[] numbers) {

        long stamp = System.currentTimeMillis();
        quickSort(numbers, 0, numbers.length - 1);
        return Utils.intsToString(numbers) + "   cost:" + (System.currentTimeMillis() - stamp);

    }

    private void quickSort(int[] numbers, int left, int right) {
        int partitionIndex;

        if (left < right) {
            partitionIndex = partition(numbers, left, right);
            quickSort(numbers, left, partitionIndex - 1);
            quickSort(numbers, partitionIndex + 1, right);
        }
    }

    private int partition(int[] numbers, int left, int right) {
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (numbers[i] < numbers[pivot]) {
                Utils.swap(numbers, i, index++);
            }
        }

        Utils.swap(numbers, pivot, index - 1);
        return index - 1;
    }

}
