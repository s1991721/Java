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

        int[] longInts = left.length > right.length ? left : right;
        int[] shortInts = left.length > right.length ? right : left;
        int shortP = 0;
        int longP = 0;
        int resultP = 0;


        while (shortP < shortInts.length && longP < longInts.length) {
            if (shortInts[shortP] > longInts[longP]) {
                result[resultP++] = longInts[longP];
                longP++;
            } else if (shortInts[shortP] < longInts[longP]) {
                result[resultP++] = shortInts[shortP];
                shortP++;
            } else {
                result[resultP++] = shortInts[shortP];
                shortP++;
                result[resultP++] = longInts[longP];
                longP++;
            }
        }


        while (shortP < shortInts.length) {
            result[resultP++] = shortInts[shortP];
            shortP++;
        }

        while (longP < longInts.length) {
            result[resultP++] = longInts[longP];
            longP++;
        }

        return result;
    }

}
