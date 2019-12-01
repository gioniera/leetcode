package medium;

import listNode.ListNode;

import java.util.HashSet;

/**
 * @author: WYL
 * @create: 2019-12-01 12:45
 **/
public class NO142 {
    /**
     * 快慢指针 两轮循环 第一轮判断是否是环链表，是的话找到相遇点，由于设链表头到环入口到距离为f，入口到相遇点到距离为a，相遇点到入口到距离为b，链表总长度为c
     * 则有 2（f+n1(a+b)）= f+n2(a+b)  可以推导出f=b 即慢指针走到f时快指针一定在b
     * 则可以是ptr1指向链表头，ptr2指向相遇点，ptr1==ptr2时则在环入口
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        if (head==null||head.next==null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast){
                ListNode ptr1 = head;
                ListNode ptr2 = slow;
                while (ptr1!=ptr2){
                    ptr1 = ptr1.next;
                    ptr2 = ptr2.next;
                }
                return ptr1;
            }
        }
        return null;
    }

    /**
     * hash set 不可保存重复值法
     * @param head
     * @return
     */
    public ListNode detectCycle2(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while (head!=null){
            if (!set.add(head)){
                return head;
            }
            head = head.next;
        }
        return null;
    }
}
