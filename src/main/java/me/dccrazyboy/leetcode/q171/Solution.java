package me.dccrazyboy.leetcode.q171;

/**
 * Created by dongchao on 16/8/7.
 */
public class Solution {
    public int titleToNumber(String s) {
        int ret = 0;
        for (char c: s.toCharArray()){
            ret = ret * 26 + (c - 'A' + 1);
        }
        return ret;
    }
}