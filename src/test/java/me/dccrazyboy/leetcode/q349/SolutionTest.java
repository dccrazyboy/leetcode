package me.dccrazyboy.leetcode.q349;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dongchao on 16/8/7.
 */
public class SolutionTest {
    @Test
    public void intersection() throws Exception {
        Solution s = new Solution();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] ret = {2};
        assertArrayEquals(ret, s.intersection(nums1, nums2));
    }

}