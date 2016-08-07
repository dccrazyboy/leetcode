package me.dccrazyboy.leetcode.q349;

import java.util.HashSet;

/**
 * Created by dongchao on 16/8/7.
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> n1 = new HashSet<Integer>();
        HashSet<Integer> ret = new HashSet<Integer>();
        for (int num: nums1) {
            n1.add(num);
        }
        for (int num: nums2) {
            if (n1.contains(num)) {
                ret.add(num);
            }
        }
        int[] nret = new int[ret.toArray().length];
        int i = 0;
        for (Integer num: ret) {
            nret[i] = num;
            i++;
        }
        return nret;
    }
}
