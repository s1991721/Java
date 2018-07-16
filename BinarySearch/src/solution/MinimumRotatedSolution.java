package solution;

import utils.Util;

/**
 * Created by mr.lin on 2018/7/16.
 * <p>
 * Find Minimum in Rotated Sorted Array II
 * <p>
 * https://leetcode.com/explore/learn/card/binary-search/144/more-practices/1031/
 */
public class MinimumRotatedSolution {

    public String solution(String input) {
        int[] nums = Util.stringToIntegerArray(input);
        return String.valueOf(findMin(nums));
    }

    private int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]==nums[right]){
                right--;
                continue;
            }

            if(nums[mid]>nums[right]){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return nums[left];

    }
}
