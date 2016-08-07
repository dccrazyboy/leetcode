package me.dccrazyboy.leetcode.q242;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dongchao on 16/8/7.
 */
public class SolutionTest {
    @Test
    public void isAnagram() throws Exception {
        Solution s = new Solution();
        assertEquals(true, s.isAnagram("anagram", "nagaram"));
        assertEquals(false, s.isAnagram("rat", "car"));
    }

}