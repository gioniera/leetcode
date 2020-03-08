package lcci;

import vo.ListNode;

/**
 * @author: WYL
 * @create: 2020-03-07 20:06
 **/
public class P0208 {
    public ListNode detectCycle(ListNode head) {
        if (head!=null&&head.next==null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                while (fast != head) {
                    fast = fast.next;
                    head = head.next;
                }
                break;
            }
        }
        return fast;
    }
}
