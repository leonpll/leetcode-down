package org.leonpp.questionBank.LinkedList;

/**
 * @program: leetcode-down
 * @description: 206. 反转链表
 * @author: LL
 * @create: 2020-05-08 14:41
 * <p>
 * <p>
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * <p>
 * * 来源：力扣（LeetCode）
 * * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 **/
public class LeetCode206 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    /**
     * 双指针
     */
    public static ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode cru = head;
        ListNode temp = null;
        while (cru != null) {
            temp = cru.next;
            cru.next = pre;
            pre = cru;
            cru = temp;

        }
        return pre;
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(7);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;

        ListNode listNode = reverseList(l1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
