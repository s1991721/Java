package sort;

import util.Utils;

/**
 * Created by mr.lin on 2018/4/8.
 * 堆排序
 */
public class HeapSort {

    public String sort(int[] numbers) {

        long stamp = System.currentTimeMillis();

        len=numbers.length;
        for (int i = numbers.length / 2; i >= 0; i--) {//生成大顶堆
            adjustHeap(numbers, i);
        }

        for (int i = numbers.length-1; i >=0 ; i--) {
            Utils.swap(numbers,0,i);
            len--;
            adjustHeap(numbers,0);
        }


        return Utils.intsToString(numbers) + "   cost:" + (System.currentTimeMillis() - stamp);

    }

    int len;

    private void adjustHeap(int[] numbers, int p) {

        int left = p * 2 + 1;
        int right = p * 2 + 2;
        int bigP = p;

        if (left < len && numbers[left] > numbers[bigP]) {
            bigP = left;
        }

        if (right < len && numbers[right] > numbers[bigP]) {
            bigP = right;
        }

        if (p != bigP) {
            Utils.swap(numbers, p, bigP);
            adjustHeap(numbers, bigP);
        }

    }

}
