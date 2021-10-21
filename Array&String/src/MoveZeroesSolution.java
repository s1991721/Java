/**
 * @Author: Jef
 * @Date: 2021/10/21 15:19
 * @Description https://leetcode.com/explore/learn/card/array-and-string/204/conclusion/1174/
 */
public class MoveZeroesSolution {

    public static void moveZeroes(int[] nums) {

        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (0 != nums[i]) {
                nums[pos] = nums[i];
                if (i != pos) {
                    nums[i] = 0;
                }
                pos++;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
    }
}
