package me.dccrazyboy.leetcode.q136;

/**
 * Created by dongchao on 16/8/6.
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int ret = 0;
        for (int i: nums) {
            ret = ret ^ i;
        }
        return ret;
    }
}
