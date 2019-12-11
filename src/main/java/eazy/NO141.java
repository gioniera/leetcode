package eazy;
import vo.ListNode;

import java.util.HashSet;

/**
 * @author: WYL
 * @create: 2019-12-01 10:34
 *
 **/
public class NO141 {
    /**
     * 快慢指针 一个环 慢指针每次走一步 快指针每次走两步 如果是环 快指针总能追上慢指针
     * @param head
     * @return
     */
    public boolean hasCycle1(ListNode head) {
        if (head==null||head.next==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }

    /**
     * hash 保存head地址 重复就是环
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while (head!=null&&head.next!=null){
            if (!set.add(head)){
                return true;
            }
            head = head.next;
        }
        return false;
    }
}