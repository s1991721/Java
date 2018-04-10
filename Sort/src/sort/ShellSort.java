package sort;

import util.Utils;

/**
 * Created by mr.lin on 2018/4/7.
 * 希尔排序
 */
public class ShellSort {

    public String sort(int[] data) {

        long stamp = System.currentTimeMillis();

        for (int increment = data.length / 2; increment > 0; increment /= 2) {
            for (int i = increment; i < data.length; i++) {
                int temp = data[i];
                int j;
                for (j = i - increment; j >= 0; j -= increment) {
                    if (temp < data[j]) {
                        data[j + increment] = data[j];
                    } else {
                        break;
                    }
                }
                data[j + increment] = temp;
            }
        }

        return Utils.intsToString(data) + "   cost:" + (System.currentTimeMillis() - stamp);

    }

}
