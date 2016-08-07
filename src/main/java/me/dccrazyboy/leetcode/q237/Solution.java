package me.dccrazyboy.leetcode.q237;

import me.dccrazyboy.leetcode.utils.ListNode;

/**
 * Created by dongchao on 16/8/7.
 */
public class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}