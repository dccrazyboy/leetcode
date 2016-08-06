package me.dccrazyboy.leetcode.q334;

import java.util.Arrays;

/**
 * Created by dongchao on 16/8/4.
 */
public class Solution {
    public String reverseString(String s) {
        char c[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            c[i] = s.charAt(s.length() - i - 1);
        }
        return String.valueOf(c);
    }
}
