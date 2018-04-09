package sort;

import util.Utils;

/**
 * Created by mr.lin on 2018/4/6.
 * 选择排序
 */
public class SelectionSort {

    public String sort(int[] numbers) {

        long stamp = System.currentTimeMillis();

        for (int i = 0; i < numbers.length - 1; i++) {
            int position=i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j]<numbers[position]){
                    position=j;
                }
            }
            Utils.swap(numbers,i,position);
        }

//        蹩脚的选择排序
//        for (int i = 0; i < numbers.length - 1; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (numbers[j] < numbers[i]) {
//                    Utils.swap(numbers, i, j);//正规的是记录最小位置
//                }
//            }
//            在内循环完成后再交换，这样可以减少交换次数
//        }

        return Utils.intsToString(numbers) + "   cost:" + (System.currentTimeMillis() - stamp);

    }

}
