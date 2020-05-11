package org.leonpp.questionBank.arrays;

/**
 * @program: leetcode-down
 * @description: 删除排序数组中的重复项/移除元素
 * @author: LL
 * @create: 2020-05-11 11:32
 * <p>
 * 26
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * <p>
 *  
 * 27
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array4
 * <p>
 * <p>
 * <p>
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * <p>
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-element
 **/
public class LeetCode26_27 {


    /**
     * 27题
     *
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {

        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }

    public static void main(String[] args) {

        int[] s = new int[]{1, 2, 4, 5, 1, 2};
        System.out.println(removeElement(s, 2));
        for (int i : s) {
            System.out.println(i);
        }
    }


    /**
     * 27题
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j]) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }

}
