package LeetCode;

/**
 * @author mycclee
 * @createTime 2019/7/9 22:12
 */

import java.util.List;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class AddTwoNumbers {

    public static void main(String[] args) {

    }

    /**
     *
     * @param l1
     * @param l2
     * @return Solution1的升级版，更加简洁
     */
    public ListNode Solution2(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            ListNode node = new ListNode(0);
            int dig = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            node.val = dig % 10;
            carry = dig / 10;
            current.next = node;
            current = current.next;
            l1 = l1.next == null ? l1 : l1.next;
            l2 = l2.next == null ? l2 : l2.next;
        }
        return dummy.next;
    }

    /**
     * @param l1
     * @param l2
     * @return 分两种情况：(约定 进位初始值是0，两个指针，一个是dummy，它是头指针，最后返回"dummy.next"，另一个是current指针，用来连接dummy后的node节点)
     * ①两个list都不为空，加和并且如果有后一位进上来的位就加上，然后本位留下取余值，进位是除以10后的值
     * ②两个list只有一个有值，这个值加上后一位进上来的值，本位留下取余后的值，进位是除以10后的值
     * 最后的最后，两个list都没有值了，但是仍然有进位，那么新建一个节点，值为进位的值
     */
    public ListNode Solution1(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        while (l1 != null && l2 != null) {
            int dig = l1.val + l2.val + carry;
            int val = dig % 10;
            carry = dig / 10;
            ListNode node = new ListNode(val);
            current.next = node;
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int dig = l1.val + carry;
            int val = dig % 10;
            carry = dig / 10;
            ListNode node = new ListNode(val);
            current.next = node;
            current = current.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int dig = l2.val + carry;
            int val = dig % 10;
            carry = dig / 10;
            ListNode node = new ListNode(val);
            current.next = node;
            current = current.next;
            l2 = l2.next;
        }
        if (carry != 0) {
            ListNode node = new ListNode(carry);
            current.next = node;
        }
        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}