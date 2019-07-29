package LeetCode;

/**
 * @author mycclee
 * @createTime 2019/7/28 22:00
 */

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 *
 * 给定的 n 保证是有效的。
 *
 * 进阶：
 *
 * 你能尝试使用一趟扫描实现吗？
 *
 */
public class Lession19 {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        ListNode listNode = solution(listNode1,2);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

    public static ListNode solution(ListNode head,int n){
        ListNode first = new ListNode(0);
        first.next = head;
        ListNode slow = first;
        ListNode fast = first;
        for (int i = 0;i < n;i++){
            fast = fast.next;
        }

        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return first.next;
    }
}
