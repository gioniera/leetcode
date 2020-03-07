package lcci;

import vo.ListNode;

/**
 * @author: WYL
 * @create: 2020-03-06 11:53
 * 面试题 02.04. 分割链表
 **/
public class P0204 {
    public ListNode partition(ListNode head, int x) {
        ListNode n1 = new ListNode(-1);
        ListNode n2 = new ListNode(-1);
        ListNode ans1 = n1;
        ListNode ans2 = n2;
        while (head != null) {
            if (head.val < x) {
                n1.next = head;
                n1 = n1.next;
            } else {
                n2.next = head;
                n2 = n2.next;
            }
            head = head.next;
        }
        n2.next = null;
        n1.next = ans2.next;
        return ans1.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(4);
        n1.next.next = new ListNode(3);
        n1.next.next.next = new ListNode(2);
        n1.next.next.next.next = new ListNode(5);
        n1.next.next.next.next.next = new ListNode(4);

        P0204 p = new P0204();
        p.partition(n1,3);
    }
}
