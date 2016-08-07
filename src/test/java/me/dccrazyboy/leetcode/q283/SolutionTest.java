package me.dccrazyboy.leetcode.q283;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dongchao on 16/8/7.
 */
public class SolutionTest {
    @Test
    public void moveZeroes() throws Exception {
        Solution s = new Solution();
        int[] nums = {0, 1, 0, 3, 12};
        int[] result = {1, 3, 12, 0, 0};
        s.moveZeroes(nums);
        assertArrayEquals(result, nums);

        int[] nums_1 = {1};
        int[] result_1 = {1};
        s.moveZeroes(nums_1);
        assertArrayEquals(result_1, nums_1);
    }
}