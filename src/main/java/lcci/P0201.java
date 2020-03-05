package lcci;

import vo.ListNode;

import java.util.HashSet;

/**
 * @author: WYL
 * @create: 2020-03-05 19:08
 * 面试题 02.01. 移除重复节点
 **/
public class P0201 {
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode ans = head;
        HashSet<Integer> map = new HashSet<>();
        while (head.next != null) {
            map.add(head.val);
            ListNode n = head.next;
            if (map.contains(n.val)) {
                head.next = n.next;
            } else {
                map.add(n.val);
                head = head.next;
            }

        }
        return ans;
    }
}
