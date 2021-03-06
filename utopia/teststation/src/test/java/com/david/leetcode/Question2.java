package com.david.leetcode;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * 示例：
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 */
public class Question2 {
    public static void main(String[] args) {
        System.out.println(10 / 10);
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        ListNode listNode = new Solution().addTwoNumbers(l1, l2);
        System.out.println(listNode);
    }

    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static class Solution {

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            //头结点
            ListNode head = new ListNode(-1);
            ListNode curr = head;
            int carrier = 0;
            //两个链表全都遍历结束退出循环
            while (l1 != null || l2 != null) {
                int x = l1 == null ? 0 : l1.val;
                int y = l2 == null ? 0 : l2.val;
                int sum = x + y + carrier;
                carrier = sum / 10;
                //组织结果链表
                curr.next = new ListNode(sum % 10);
                curr = curr.next;
                //迭代
                if (l1 != null) l1 = l1.next;
                if (l2 != null) l2 = l2.next;
            }
            //最后一位有进位的话加一个节点
            if (carrier == 1) curr.next = new ListNode(carrier);

            return head.next;
        }
    }
}
