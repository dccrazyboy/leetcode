package me.dccrazyboy.leetcode.q371;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dongchao on 16/8/6.
 */
public class SolutionTest {
    @Test
    public void getSum() throws Exception {
        Solution s = new Solution();
        assertEquals(1+2, s.getSum(1, 2));
        assertEquals(98753+23452, s.getSum(98753, 23452));
        assertEquals((-1)+(-1), s.getSum(-1, -1));
        assertEquals((-2)+(-2), s.getSum(-2, -2));
        assertEquals((-1)+(3), s.getSum(-1, 3));
        assertEquals((-1)+(334), s.getSum(-1, 334));
        assertEquals((-98753)+(-23452), s.getSum(-98753, -23452));
    }
}