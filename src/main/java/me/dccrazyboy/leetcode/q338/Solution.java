package me.dccrazyboy.leetcode.q338;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by dongchao on 16/8/6.
 */
public class Solution {
    /*
     * 0 0 0
     * 1 1 1
     *
     * 2 10 1
     * 3 11 2
     *
     * 4 100 1
     * 5 101 2
     * 6 110 2
     * 7 111 3
     *
     * 8 1000 1
     * 9 1001 2
     * 10 1010 2
     * 11 1011 3
     * 12 1100 2
     * 13 1101 3
     * 14 1110 3
     * 15 1111 4
     *
     *
     */
    public int[] countBits(int num) {
        int[] base = {0,1,1,2};
        int[] ret = new int[num+1];
        if (num < 4) {
            for (int i=0; i <= num; i++) {
                ret[i] = base[i];
            }
            return ret;
        } else {
            for (int i=0; i < 4; i++) {
                ret[i] = base[i];
            }
            int last_start = 2;
            int last_end = 3;
            int last_now;
            int now = 4;
            while (true) {
                for (last_now = last_start; last_now <= last_end; now++, last_now++){
                    if (now > num) return ret;
                    ret[now] = ret[last_now];
//                    System.out.print(Arrays.toString(ret));

                }

                for (last_now = last_start; last_now <= last_end; now++, last_now++){
                    if (now > num) return ret;
                    ret[now] = ret[last_now] + 1;
//                    System.out.print(Arrays.toString(ret));
                }
                last_start = last_start * 2;
                last_end = last_start * 2 - 1;
            }
        }
    }
}
