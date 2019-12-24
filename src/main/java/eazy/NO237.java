package eazy;

import vo.ListNode;

/**
 * @author: WYL
 * @create: 2019-12-24 21:44
 * 删除链表中的节点
 **/
public class NO237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
