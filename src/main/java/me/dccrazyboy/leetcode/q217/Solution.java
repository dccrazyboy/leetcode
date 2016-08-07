package me.dccrazyboy.leetcode.q217;

import java.util.HashSet;

/**
 * Created by dongchao on 16/8/7.
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> table = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!table.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

    /*
     * 这个代码居然保TLE,很奇怪,实际测试也没有发现很慢
     */
    public boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> table = new HashSet<Integer>();
        for (int num: nums) {
            if (!table.add(num)) {
                return true;
            }
        }
        return false;
    }
}