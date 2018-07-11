package solution;

import utils.Util;

/**
 * Created by mr.lin on 2018/7/11.
 * <p>
 * Search for a Range
 * <p>
 * https://leetcode.com/explore/learn/card/binary-search/135/template-iii/944/
 */
public class SearchRangeSolution {

    public String solution(String input) {
        String[] strings = input.split("!");

        int[] nums = Util.stringToIntegerArray(strings[0]);
        int target = Integer.valueOf(strings[1]);

        return Util.integerArrayToString(searchRange(nums, target));
    }

    //二分法时间复杂度为O(lgn)
    private int[] searchRange(int[] nums, int target) {

        int[] res = {-1, -1};//默认结果
        if (nums == null || nums.length == 0) return res;//空

        int start = 0, end = nums.length - 1;
        int mid;

        while (start + 1 < end) {//左边的起始点，两个分界
            mid = start + (end - start) / 2;
            if (nums[mid] < target) start = mid;
            else end = mid;
        }

        //由于用两个点分界所以不知道哪个点是target
        if (nums[start] == target) res[0] = start;
        else if (nums[end] == target) res[0] = end;
        else return res;

        //复位
        start = 0;
        end = nums.length - 1;

        while (start + 1 < end) {//左右边的起始点，两个分界
            mid = start + (end - start) / 2;
            if (nums[mid] > target) end = mid;
            else start = mid;
        }


        if (nums[end] == target) res[1] = end;
        else if (nums[start] == target) res[1] = start;
        else return res;
        return res;
    }



//    此方法最坏情况，数组全部为target,时间O(n)
//    public int[] searchRange(int[] nums, int target) {
//        if (nums == null || nums.length == 0) {
//            return new int[]{-1, -1};
//        }
//
//        int left = 0;
//        int right = nums.length - 1;
//        while (nums[left] < nums[right]) {
//            int mid = left + (right - left) / 2;
//
//            if (target < nums[mid]) {
//                right = mid - 1;
//            } else if (target > nums[mid]) {
//                left = mid + 1;
//            } else {
//                if (nums[left] < target) left = left + 1;
//                if (nums[right] > target) right = right - 1;
//            }
//        }
//
//        if (nums[left]!=target){
//            return new int[]{-1, -1};
//        }
//
//        return new int[]{left, right};
//    }

}
