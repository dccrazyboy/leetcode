package me.dccrazyboy.leetcode.q350;

import java.util.*;

/**
 * Created by dongchao on 16/8/7.
 */
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> n1 = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> ret = new HashMap<Integer, Integer>();
        for (int num: nums1) {
            Integer num_count = n1.get(num);
            if (num_count == null) {
                num_count = 0;
            }
            n1.put(num, num_count + 1);
        }
        for (int num: nums2) {
            Integer num_count = n1.get(num);
            if (num_count != null) {
                Integer ret_count = ret.get(num);
                if (ret_count == null) {
                    ret_count = 0;
                }
                ret.put(num, ret_count + 1);

                num_count -= 1;
                if (num_count == 0) {
                    n1.remove(num);
                } else {
                    n1.put(num, num_count);
                }
            }
        }

        ArrayList<Integer> aret = new ArrayList<Integer>();
        for (Map.Entry<Integer, Integer> item: ret.entrySet()) {
            for (int i=0; i < item.getValue(); i++) {
                aret.add(item.getKey());
            }
        }

        int[] nret = new int[aret.size()];
        int i = 0;
        for (Integer num: aret) {
            nret[i] = num;
            i++;
        }
        return nret;
    }
}
