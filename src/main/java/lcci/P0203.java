package lcci;

import vo.ListNode;

/**
 * @author: WYL
 * @create: 2020-03-05 22:08
 * 面试题 02.03. 删除中间节点
 **/
public class P0203 {

    ListNode p;

    public P0203(ListNode p) {
        this.p = p;
    }

    public void deleteNode(ListNode node) {
        while (node.next != null && node.next.next != null) {
            node.val = node.next.val;
            node = node.next;
        }

        if (node.next != null) {
            node.val = node.next.val;
        }
        node.next = null;

    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(2);
        n1.next.next = new ListNode(3);
        n1.next.next.next = new ListNode(4);
        ;
        P0203 p = new P0203(n1);
        p.deleteNode(n1.next);

    }
}
