package me.dccrazyboy.leetcode.q136;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dongchao on 16/8/6.
 */
public class SolutionTest {
    @Test
    public void singleNumber() throws Exception {
        Solution s = new Solution();
        int[] l = new int[]{1,2,2,3,3};
        assertEquals(1, s.singleNumber(l));
        l = new int[]{2,2,1,3,3};
        assertEquals(1, s.singleNumber(l));
        l = new int[]{2,1,2,3,3};
        assertEquals(1, s.singleNumber(l));
    }
}