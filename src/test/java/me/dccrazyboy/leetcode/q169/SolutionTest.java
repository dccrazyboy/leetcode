package me.dccrazyboy.leetcode.q169;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dongchao on 16/8/7.
 */
public class SolutionTest {
    @Test
    public void majorityElement() throws Exception {
        Solution s = new Solution();
        int[] nums = {1,2,3,1,1,1};
        assertEquals(1, s.majorityElement(nums));

        int[] nums_1 = {1};
        assertEquals(1, s.majorityElement(nums_1));
    }

}