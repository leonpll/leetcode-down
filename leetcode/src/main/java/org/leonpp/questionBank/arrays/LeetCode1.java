package org.leonpp.questionBank.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: 两数之和
 * @author: LL
 * @create: 2020-04-30 15:13
 *  *  * 来源：力扣（LeetCode）
 *  *  * 链接：https://leetcode-cn.com/problems/valid-parentheses
 **/
public class LeetCode1 {


    public static void main(String[] args) {

        int[] x = {2, 7, 11, 15};

        System.out.println( Arrays.toString( twoSum(x, 9)));
        twoSumByHash(x, 9);
    }

    /**
     * 暴力法
     */
    public static int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];
        for (int i = 0, len = nums.length; i < len; i++) {
            for (int i1 = 0, len1 = nums.length; i1 < len1; i1++) {
                if (target ==  nums[i1] + nums[i]){
                    arr[0] = i;
                    arr[1] = i1;

                    return arr;
                }

            }

        }

        return arr;
    }

    public static int[] twoSumByHash(int[] nums, int target) {

        int[] arr = new int[2];

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement) && map.get(complement) != i) {

                arr[0] = i;
                arr[1] = map.get(complement);
                return new int[]{i, map.get(complement)};
            }
        }
        return arr;
    }

}
