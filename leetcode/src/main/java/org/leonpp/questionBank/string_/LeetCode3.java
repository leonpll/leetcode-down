package org.leonpp.questionBank.string_;

import java.util.HashMap;

/**
 * @program: leetcode-down
 * @description: 无重复字符串最常串
 * @author: LL
 * @create: 2020-04-29 10:51
 **/
public class LeetCode3 {

    public static void main(String[] args) {

        System.out.println(lengthOfLongest("leleol"));
    }



    /**
     * 滑动窗口
     */
    public static int lengthOfLongest(String s) {

        if (s.length() == 0) {
            return 0;
        }

        // 记录每个字母最新出现的下标
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        int max = 0;
        int start = 0;
        for (int i = 0, len = s.length(); i < len; i++) {

            char c = s.charAt(i);

            if (map.containsKey(c)) {
                start = Math.max(start, map.get(c) + 1);
            }
            map.put(c, i);
            max = Math.max(max, i - start + 1);
        }
        return max;

        /**
         * s= leleol
         * i = 0 c = l  max =Math.max(0, 1) = 1 ;
         * i = 1 c = e  max =Math.max(1, 2) = 2;
         * i = 2, c = l start = 0 -> 1, max = Math.max(2, 2)  = 2;
         * i = 3, c = e start = 1 -> 2, max = Math.max(2, 3 - 2 + 1)  =2 ;
         * i = 4, c = o start = 2 , max = Math.max(2, 4 - 2 + 1)  = 3;
         * i = 5, c = l start = 3 , max = Math.max(2, 5 - 3 + 1)  = 3;
         */

    }

}
