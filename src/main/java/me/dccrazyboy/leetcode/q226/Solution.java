package me.dccrazyboy.leetcode.q226;

import me.dccrazyboy.leetcode.utils.TreeNode;

/**
 * Created by dongchao on 16/8/7.
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        } else {
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;

            invertTree(root.left);
            invertTree(root.right);
            return root;
        }
    }
}
