package lcci;

import vo.ListNode;

/**
 * @author: WYL
 * @create: 2020-03-07 19:34
 * 面试题 02.07. 链表相交
 **/
public class P0207 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null && headB == null) {
            return null;
        }
        ListNode p1 = headA;
        ListNode p2 = headB;
        while (p1 != p2) {
            if (p1 == null ) {
                p1 = headB;
            }else {
                p1 = p1.next;
            }
            if (p2 == null) {
                p2 = headA;
            }else {
                p2 = p2.next;
            }
        }
        return p1;
    }
}
