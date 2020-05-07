package org.leonpp.questionBank.tree;

/**
 * @program: leetcode-down
 * @description: 给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/subtree-of-another-tree
 * @author: LL
 * @create: 2020-05-07 13:28
 **/
public class LeetCode572 {


    static class TreeNode {


        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    boolean isSubtree(TreeNode s, TreeNode t) {
        if (t == null) {
            return true;
        }
        if (s == null) {
            return false;
        }
        return isSubtree(s.left, t) || isSubtree(s.right, t) || isSameTree(s, t);

    }


    /**
     * 判断两棵树是否相同
     */
    private boolean isSameTree(TreeNode s, TreeNode t) {

        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        if (s.val != t.val) {
            return false;
        }

        return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }


    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(1);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

        TreeNode node6 = new TreeNode(1);
        TreeNode node7 = new TreeNode(1);
        TreeNode node8 = new TreeNode(1);

        node6.left = node7;
        node6.right = node8;


        LeetCode572 le = new LeetCode572();
        System.out.println(le.isSubtree(node1, node6));
    }

    /**
     * 参考https://leetcode-cn.com/problems/subtree-of-another-tree/solution/java-di-gui-ban-by-kelly2018/
     */
}


