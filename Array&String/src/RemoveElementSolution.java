/**
 * Created by mr.lin on 2019/5/17
 * <p>
 * Remove Element
 * <p>
 * https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1151/
 */
public class RemoveElementSolution {

    public int removeElement(int[] nums, int val) {

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }

}
