package solution;

import java.util.Arrays;

import utils.Util;

/**
 * Created by mr.lin on 2018/7/20.
 * <p>
 * Find K-th Smallest Pair Distance
 * <p>
 * https://leetcode.com/explore/learn/card/binary-search/146/more-practices-ii/1041
 */
public class KthSmallestPairDistance {

    public String solution(String input) {
        String[] strings = input.split("!");
        int[] nums = Util.stringToIntegerArray(strings[0]);
        int k = Integer.valueOf(strings[1]);

        return String.valueOf(smallestDistancePair(nums, k));
    }


    //
    private int smallestDistancePair(int[] nums, int k) {

        Arrays.sort(nums);

        // 由于已排序，任意项与其后多项的差为增序
        // 距离数组下表，二分法逼近所求第K项
        int left = 0;//组队的最小距离
        int right = nums[nums.length - 1] - nums[0];//组队的最大距离

        while (left < right) {
            int mid = left + (right - left) / 2;//组队的中间距离，可以不存在

            int cnt = 0;//小于组队的中间距离的，组队的个数
            for (int i = 0, j = 0; i < nums.length; i++) {
                while (j < nums.length && (nums[j] - nums[i]) <= mid) j++;
                cnt += j - i - 1;//每次会有i=j,重复了一次
            }

            if (cnt < k) {//组对数小于k,说明小于此left、right的组队的中间距离的组队数小于K，需要将组队的中间距离加大
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
