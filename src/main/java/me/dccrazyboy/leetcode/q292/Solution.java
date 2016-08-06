package me.dccrazyboy.leetcode.q292;

/**
 * Created by dongchao on 16/8/6.
 */
public class Solution {
    /*
     * 自己需要1-3,则需要给对手4
     * 若需要给对手4,则需要对手给自己5-7
     * 自己需要5-7,则需要给对手8
     * 若需要给对手8,则需要对手给自己9-11
     * 。。。
     */
    public boolean canWinNim(int n) {
        if (n % 4 == 0) {
            return false;
        } else {
            return true;
        }
    }
}