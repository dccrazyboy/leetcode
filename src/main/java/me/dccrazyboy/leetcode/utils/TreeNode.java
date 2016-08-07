package me.dccrazyboy.leetcode.utils;

/**
 * Created by dongchao on 16/8/7.
 */
public class TreeNode {
    int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (!(obj instanceof TreeNode)) {
            return false;
        } else {
            return this.val == ((TreeNode)obj).val;
        }
    }
}
