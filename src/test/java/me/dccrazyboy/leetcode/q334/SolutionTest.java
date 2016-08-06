package me.dccrazyboy.leetcode.q334;

import static org.junit.Assert.*;

/**
 * Created by dongchao on 16/8/4.
 */
public class SolutionTest {
    @org.junit.Test
    public void reverseString() throws Exception {
        Solution s = new Solution();
        assertEquals("", s.reverseString(""));
        assertEquals("123", s.reverseString("321"));
        assertEquals("aabb", s.reverseString("bbaa"));
    }
}
