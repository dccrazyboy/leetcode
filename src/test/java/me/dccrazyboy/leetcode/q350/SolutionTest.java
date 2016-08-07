package me.dccrazyboy.leetcode.q350;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dongchao on 16/8/7.
 */
public class SolutionTest {
    @Test
    public void intersect() throws Exception {
        Solution s = new Solution();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] ret = {2, 2};
        assertArrayEquals(ret, s.intersect(nums1, nums2));

        int[] nums1_1 = {1};
        int[] nums2_1 = {1,1};
        int[] ret_1 = {1};
        assertArrayEquals(ret_1, s.intersect(nums1_1, nums2_1));
    }

}