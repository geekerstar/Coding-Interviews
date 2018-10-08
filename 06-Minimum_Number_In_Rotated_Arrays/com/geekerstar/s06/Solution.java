package com.geekerstar.s06;

/**
 * @Author: Geekerstar(QQ : 247507792)
 * @Date: 2018/8/29 16:25
 * @Description: 本题可以修改二分查找算法进行求解：
 * 当 nums[m] <= nums[h] 的情况下，说明解在 [l, m] 之间，此时令 h = m；
 * 否则解在 [m + 1, h] 之间，令 l = m + 1。
 */
public class Solution {
    public int minNumberInRotateArray(int[] nums) {
        if (nums.length == 0)
            return 0;
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (nums[m] <= nums[h]) {
                h = m;
            }
            else {
                l = m + 1;
            }
        }
        return nums[l];
    }
}
