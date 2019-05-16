import java.util.Arrays;

/**
 * Created by mr.lin on 2019/5/16
 * <p>
 * Array Partition I
 * <p>
 * https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1154/
 */
public class ArrayPartitionISolution {

    public int arrayPairSum(int[] nums) {//算法的思想
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sum += nums[i];
        }
        return sum;
    }

}
