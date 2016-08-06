package me.dccrazyboy.leetcode.q371;

/**
 * Created by dongchao on 16/8/6.
 */
public class Solution {
    /*
     * http://www.cnblogs.com/Z-Sky/p/5646532.html
     *
     * 1、能用a^b来得到两数和不需要进位的位。　　//^异或（XOR)
     * 2、能用a&b来得到两数和需要进位的位，(a&b)<<1+a^b就是Sum。
     * 3、把(a&b)<<1和a^b作为参数，递归调用getSum，直到参数a等于零，返回两数和。
     *
     * 思路挺好的
     */
    public int getSum(int a, int b) {
        if(a==0)return b;
        return getSum((a&b)<<1, a^b);
    }
}