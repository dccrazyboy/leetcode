package me.dccrazyboy.leetcode.q104;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dongchao on 16/8/7.
 */
public class SolutionTest {
    @Test
    public void maxDepth() throws Exception {
        TreeNode root = null;
        Solution s = new Solution();
        assertEquals(0, s.maxDepth(root));

        root = new TreeNode(1);
        assertEquals(1, s.maxDepth(root));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        assertEquals(2, s.maxDepth(root));
    }

}