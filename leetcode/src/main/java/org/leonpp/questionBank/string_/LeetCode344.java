package org.leonpp.questionBank.string_;

/**
 * @program: leetcode-down
 * @description: 反转字符串
 * @author: LL
 * @create: 2020-05-08 13:43
 * <p>
 * <p>
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * <p>
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * <p>
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-string
 **/
public class LeetCode344 {


    public static char[] reverseString(char[] s) {

        int rightIndex = s.length - 1, leftIndex = 0;

        while (leftIndex < rightIndex) {


            char temp = s[rightIndex];
            s[rightIndex--] = s[leftIndex];
            s[leftIndex++] = temp;
        }

        return s;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("hello".toCharArray()));
    }
}
