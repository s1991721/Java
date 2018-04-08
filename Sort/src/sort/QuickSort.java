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

    private void quickSort(int[] numbers, int l, int r) {
        if (l <= r) {

            int pivot = numbers[l];

            int left = l;
            int right = r;

//            1,4,2,7,9,8,3,6

            while (left != right) {

                while (right > left && numbers[right] > pivot) {
                    right--;
                }

                numbers[left] = numbers[right];

                while (right > left && numbers[left] < pivot) {
                    left++;
                }

                numbers[right] = numbers[left];

            }

            numbers[left] = pivot;

            quickSort(numbers, l, left - 1);
            quickSort(numbers, right + 1, r);

        }
    }

}
