package lcci;

import vo.ListNode;

/**
 * @author: WYL
 * @create: 2020-03-07 18:08
 * 面试题 02.05. 链表求和
 **/
public class P0205 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0;
        ListNode ansNode = null;
        ListNode tmp = new ListNode(0);
        ansNode = tmp;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                tmp.next = new ListNode((l2.val + c) % 10);
                if (l2.val + c > 9) {
                    c = 1;
                } else {
                    c = 0;
                }
                l2 = l2.next;

            } else if (l2 == null) {
                tmp.next = new ListNode((l1.val + c) % 10);
                if (l1.val + c > 9) {
                    c = 1;
                } else {
                    c = 0;
                }
                l1 = l1.next;

            } else {
                tmp.next = new ListNode((l1.val + l2.val + c) % 10);
                if (l1.val + l2.val + c > 9) {
                    c = 1;
                } else {
                    c = 0;
                }
                l1 = l1.next;
                l2 = l2.next;
            }

            tmp = tmp.next;
        }
        if (c == 1) {
            tmp.next = new ListNode(1);
        }
        return ansNode.next;
    }
}
