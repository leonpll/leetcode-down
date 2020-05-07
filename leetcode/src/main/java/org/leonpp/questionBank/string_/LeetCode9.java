package org.leonpp.questionBank.string_;

/**
 * @program: leetcode-down
 * @description: 回文数
 * @author: LL
 * @create: 2020-04-30 17:24
 *
 *
 *  * 来源：力扣（LeetCode）
 *  * 链接：https://leetcode-cn.com/problems/valid-parentheses
 **/
public class LeetCode9 {

    public static void main(String[] args) {


        System.out.println(isPalindromeNum(12121));
    }


    /**
     * 笨方法
     */
    public static boolean isPalindrome(int x) {

        boolean minus = false;

        String s = x + "";

        if (s.startsWith("-")) {

            return false;
        }

        char[] chars = s.toCharArray();

        int i = chars.length / 2;


        for (int i1 = 0; i1 < i; i1++) {

            if (chars[i1] != chars[chars.length - i1 - 1]) {
                return false;
            }
        }


        return true;
    }


    /**
     * 进阶，数学解法
     *
     * @param x
     * @return
     */
    public static boolean isPalindromeNum(int x) {


        if (x < 0 || (x != 0 && x % 10 == 0)) {

            return false;
        }

        int div = 1;
        // 计算数字位数
        while (x / div >= 10) {
            div *= 10;
        }
        while (x > 0) {
            // 算出首数字
            int left = x / div;
            // 算出尾数字
            int right = x % 10;
            if (left != right) {
                return false;
            }
            x = (x % div) / 10;
            div /= 100;
        }

        return true;
    }

}
