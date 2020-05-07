package org.leonpp.questionBank.string_;

/**
 * @program: leetcode-down
 * @description: 有效括号
 * @author: LL
 * @create: 2020-05-07 11:17
 **/


import java.util.HashMap;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 */
public class LeetCode20 {


    /**
     * 使用栈结构处理
     * @return
     */
    public static boolean isValid(String s) {


        HashMap<Character, Character> mappings = new HashMap<Character, Character>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');
        mappings.get(')');

        // 定义栈结构
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (mappings.containsKey(c)) {
                // 如果字符为闭括号是，栈为空栈，则此字符串一定无效
                if (stack.isEmpty()) {
                    return false;
                }

                // 获取前括号
                char frontElm = stack.pop();

                if (frontElm != mappings.get(c)) {
                    return false;
                }

            } else {
                stack.push(c);
            }


        }

        return stack.isEmpty();
    }


}
