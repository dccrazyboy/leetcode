package me.dccrazyboy.leetcode.q338;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by dongchao on 16/8/6.
 */
public class SolutionTest {
    @Test
    public void countBits() throws Exception {
        Solution s = new Solution();
        int ret_5[] = {0,1,1,2,1,2};
        assertArrayEquals(ret_5, s.countBits(5));
        int ret_0[] = {0};
        assertArrayEquals(ret_0, s.countBits(0));
        int ret_1[] = {0,1};
        assertArrayEquals(ret_1, s.countBits(1));
        int ret_2[] = {0,1,1};
        assertArrayEquals(ret_2, s.countBits(2));
        int ret_4[] = {0,1,1,2,1};
        assertArrayEquals(ret_4, s.countBits(4));
    }

}