package org.leonpp.questionBank.string_;

/**
 * @program: leetcode-down
 * @description: 整数饭转
 * @author: LL
 * @create: 2020-04-30 16:23
 *
 *
 *  * 来源：力扣（LeetCode）
 *  * 链接：https://leetcode-cn.com/problems/valid-parentheses
 **/
public class LeetCode7 {


    public static void main(String[] args) {

        System.out.println(reverse(10900));
    }

    /**
     * 笨方法
     * @param x
     * @return
     */
    public static int reverse(int x) {

        String s = x + "";

        int returnInt = 0;

        char[] chars = s.toCharArray();

        // 设置循环边界
        int border = 1;
        if (chars[0] == '-') {
            border++;
        }

        int len = chars.length;
        for (int i = len; i >= border; i--) {

            int digit = Integer.parseInt(String.valueOf(chars[i - 1]));

            if (returnInt > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }

            if (returnInt > 0 || digit != 0) {
                returnInt = returnInt * 10 + digit;
            }

        }

        return border == 1 ? returnInt : - returnInt;
    }


    /**
     * 官方
     * @param x
     * @return
     */
    public int reverse1(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }


}
