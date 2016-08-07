package me.dccrazyboy.leetcode.q226;

import me.dccrazyboy.leetcode.q104.*;
import me.dccrazyboy.leetcode.utils.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dongchao on 16/8/7.
 */
public class SolutionTest {
    @Test
    public void invertTree() throws Exception {
        Solution s = new Solution();
        TreeNode root = null;
        assertEquals(root, s.invertTree(root));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        TreeNode result = new TreeNode(1);
        result.right = new TreeNode(2);
        assertEquals(result, s.invertTree(root));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        result = new TreeNode(1);
        result.right = new TreeNode(2);
        result.left = new TreeNode(3);
        assertEquals(result, s.invertTree(root));
    }

}