package me.dccrazyboy.leetcode.q258;

/**
 * Created by dongchao on 16/8/7.
 */
public class Solution {
    /*
     * 1 1
     * 2 2
     * ...
     * 9 9
     * 10 1
     * 11 2
     * 12 3
     * ...
     * 18 9
     * 19 1
     * 20 2
     * 21 3
     */
    public int addDigits(int num) {
        if (num == 0) return 0;
        if (num % 9 == 0) {
            return 9;
        } else {
            return num % 9;
        }
    }
}