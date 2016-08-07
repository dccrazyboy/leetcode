package me.dccrazyboy.leetcode.q169;

import java.util.HashMap;

/**
 * Created by dongchao on 16/8/7.
 */
public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> table = new HashMap<Integer, Integer>();
        for (int num: nums) {
            if (table.containsKey(num)) {
                table.put(num, table.get(num) + 1);
            } else {
                table.put(num, 1);
            }
            if (table.get(num) > nums.length / 2) {
                return num;
            }
        }
        return -1;
    }
}