package lcci;

import vo.ListNode;

/**
 * @author: WYL
 * @create: 2020-03-07 18:43
 * 面试题 02.06. 回文链表
 * 翻转链表
 **/
public class P0206 {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = null;

        while (fast != null && fast.next != null) {
            ListNode old = slow;
            slow = slow.next;
            fast = fast.next.next;
            old.next = pre;
            pre = old;

        }
        //链表为奇数
        if (fast != null) {
            slow = slow.next;
        }
        while (slow != null) {
            if (slow.val != pre.val) {
                return false;
            }
            slow = slow.next;
            pre = pre.next;
        }
        return true;
    }
}
