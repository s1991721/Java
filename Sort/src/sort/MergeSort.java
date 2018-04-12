package sort;


import util.Utils;

/**
 * Created by mr.lin on 2018/4/7.
 * 归并排序
 */
public class MergeSort {

    public String sort(int[] numbers) {

        long stamp = System.currentTimeMillis();

        return Utils.intsToString(mergeSort(numbers)) + "   cost:" + (System.currentTimeMillis() - stamp);

    }

    private int[] mergeSort(int[] numbers) {
        int len = numbers.length;
        if (len < 2) {
            return numbers;
        }
        int middle = len / 2;
        int[] left = new int[middle];
        int[] right = new int[len - middle];

        System.arraycopy(numbers, 0, left, 0, middle);
        System.arraycopy(numbers, middle, right, 0, numbers.length - middle);

        return merge(mergeSort(left), mergeSort(right));
    }

    private int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int leftP = 0;
        int rightP = 0;
        int resultP = 0;

        while (leftP < left.length && rightP < right.length) {
            if (left[leftP] > right[rightP]) {
                result[resultP++] = right[rightP++];
            } else if (left[leftP] < right[rightP]) {
                result[resultP++] = left[leftP++];
            } else {
                result[resultP++] = left[leftP++];
                result[resultP++] = right[rightP++];
            }
        }


        while (leftP < left.length) {
            result[resultP++] = left[leftP++];
        }

        while (rightP < right.length) {
            result[resultP++] = right[rightP++];
        }

        return result;
    }

}