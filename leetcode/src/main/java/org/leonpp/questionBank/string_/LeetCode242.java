package org.leonpp.questionBank.string_;

/**
 * @program: leetcode-down
 * @description: 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词
 * @author: LL
 * @create: 2020-04-27 13:24
 *
 *
 *  * 来源：力扣（LeetCode）
 *  * 链接：https://leetcode-cn.com/problems/valid-parentheses
 **/
public class LeetCode242 {


    public static void main(String[] args) {

        System.out.println(isAnagram("abc","cba"));
    }

    /**
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];

        // 以26个字母定义数组，s字符串将遇见的字母值+1, t则-1
        for (int i = 0, len = s.length(); i < len; i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        // 若最后数组值都为0，则可以判断是否为异味字母
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
