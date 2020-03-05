package lcci;

import vo.ListNode;

/**
 * @author: WYL
 * @create: 2020-03-05 20:15
 * 面试题 02.02. 返回倒数第 k 个节点
 **/
public class P0202 {

    public int result;

    /**
     * 递归
     *
     * @param head
     * @param k
     * @return
     */
    public int kthToLast(ListNode head, int k) {
        getCount(head, k);
        return result;
    }

    public int getCount(ListNode node, int k) {
        if (node == null) {
            return 0;
        }
        int count = getCount(node.next, k) + 1;
        if (count == k) {
            result = node.val;
        }
        return count;
    }

    /**
     * 迭代
     *
     * @param head
     * @param k
     * @return
     */
    public int kthToLast2(ListNode head, int k) {
        ListNode p1 = head;
        ListNode p2 = head;
        for (int i = 0; i < k; i++) {
            p1 = p1.next;
        }
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2.val;
    }
}
