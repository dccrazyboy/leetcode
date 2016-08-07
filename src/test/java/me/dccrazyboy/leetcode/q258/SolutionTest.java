package me.dccrazyboy.leetcode.q258;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dongchao on 16/8/7.
 */
public class SolutionTest {
    @Test
    public void addDigits() throws Exception {
        Solution s = new Solution();
        assertEquals(2, s.addDigits(38));
        assertEquals(9, s.addDigits(9));
        assertEquals(1, s.addDigits(10));
        assertEquals(0, s.addDigits(0));
    }

}