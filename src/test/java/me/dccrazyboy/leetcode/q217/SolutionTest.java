package me.dccrazyboy.leetcode.q217;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dongchao on 16/8/7.
 */
public class SolutionTest {
    @Test
    public void containsDuplicate() throws Exception {
        Solution s = new Solution();
//        int[] nums = {1,2,3,4,5};
//        assertEquals(false, s.containsDuplicate(nums));
//
//        int[] nums_1 = {1,2,3,4,5,1};
//        assertEquals(true, s.containsDuplicate(nums_1));

        int[] nums_2 = new int[30000];
        for (int i =0; i < 30000; i++) {
            nums_2[i] = i;
        }
//        assertEquals(false, s.containsDuplicate(nums_2));
        assertEquals(false, s.containsDuplicate2(nums_2));
    }

}