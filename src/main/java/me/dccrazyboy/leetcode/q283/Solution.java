package me.dccrazyboy.leetcode.q283;

/**
 * Created by dongchao on 16/8/7.
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        int now_pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[now_pos] = nums[i];
                if (now_pos < i) {
                    nums[i] = 0;
                }
                now_pos++;
            }
        }
    }
}