package me.dccrazyboy.leetcode.q242;

import java.util.HashMap;

/**
 * Created by dongchao on 16/8/7.
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<String, Integer> target = new HashMap<String, Integer>();
        for (char c: s.toCharArray()) {
            String c_str = String.valueOf(c);
            if (!target.containsKey(c_str)) {
                target.put(c_str, 1);
            } else {
                target.put(c_str, target.get(c_str) + 1);
            }
        }

        for (char c: t.toCharArray()) {
            String c_str = String.valueOf(c);
            if (!target.containsKey(c_str)) {
                return false;
            } else {
                if (target.get(c_str) > 1) {
                    target.put(c_str, target.get(c_str) - 1);
                } else {
                    target.remove(c_str);
                }
            }
        }

        if (target.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}