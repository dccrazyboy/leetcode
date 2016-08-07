package me.dccrazyboy.leetcode.q104;

/**
 * Created by dongchao on 16/8/7.
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }

    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
