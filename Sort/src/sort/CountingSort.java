package sort;

import util.Utils;

/**
 * Created by mr.lin on 2018/4/8.
 * 计数排序
 */
public class CountingSort {

    public String sort(int[] numbers) {

        long stamp = System.currentTimeMillis();

        int[] result = new int[numbers.length];
        int max = numbers[0], min = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        int[] temp = new int[max - min + 1];

        for (int i = 0; i < numbers.length; i++) {

            temp[numbers[i] - min]++;

        }

        int p=0;
        for (int i = 0; i <temp.length ; i++) {
            while (temp[i]>0){
                result[p++]=i+min;
                temp[i]--;
            }
        }


        return Utils.intsToString(result) + "   cost:" + (System.currentTimeMillis() - stamp);

    }

}
