package eazy;

import listNode.ListNode;

/**
 * @author: WYL
 * 合并两个有序链表
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * @create: 2019-12-05 20:10
 **/
public class NO21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null&&l2!=null){
            return l2;
        }
        if (l1!=null&&l2==null){
            return l1;
        }
        if (l1==null&&l2==null){
            return null;
        }

        ListNode head = null;
        if (l1.val>l2.val){
            head = new ListNode(l2.val);
            l2 = l2.next;
        }else {
            head = new ListNode(l1.val);
            l1 = l1.next;
        }
        ListNode tmp = head;
        while (l1!=null||l2!=null){
            if (l1==null){
                head.next = l2;
                head = head.next;
                l2= l2.next;
                continue;
            }
            if (l2==null){
                head.next = l1;
                head = head.next;
                l1= l1.next;
                continue;
            }

            if (l1.val<l2.val){
                head.next=l1;
                head = head.next;
                l1= l1.next;
                continue;
            }
            if (l1.val>=l2.val){
                head.next=l2;
                head = head.next;
                l2= l2.next;
                continue;
            }
        }

        return tmp;
    }

    public static void main(String[] args) {
        ListNode x1 = new ListNode(1);
        ListNode x2 = new ListNode(2);
        ListNode x3 = new ListNode(4);
        x1.next=x2;
        x2.next=x3;
        ListNode y1 = new ListNode(1);
        ListNode y2 = new ListNode(3);
        ListNode y3 = new ListNode(4);
        y1.next=y2;
        y2.next=y3;
        NO21 no = new NO21();
        no.mergeTwoLists(x1,y1);
    }
}
