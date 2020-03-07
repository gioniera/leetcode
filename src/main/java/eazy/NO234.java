package eazy;

import vo.ListNode;

import java.util.Stack;

/**
 * @author: WYL
 * @create: 2020-01-06 22:00
 * 回文链表
 * 使用栈
 **/
public class NO234 {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        Stack<Integer> stack = new Stack<>();

        while (fast != null && fast.next != null) {
            stack.push(slow.val);
            fast = fast.next.next;
            slow = slow.next;
        }
        //链表为奇数
        if (fast != null) {
            slow = slow.next;
        }
        while (slow != null) {
            if (stack.pop() != slow.val) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }
}
