package sort;

import vo.ListNode;
/**
 * @author: WYL
 * @create: 2020-01-30 15:58
 * 对链表进行插入排序
 * 输入: 4->2->1->3
 * 输出: 1->2->3->4
 **/
public class NO147 {
    public ListNode insertionSortList(ListNode head) {
        ListNode current = head;
        ListNode next = null;
        ListNode pre = new ListNode(0);
        while (current!=null){
            next = current.next;
            ListNode temp = pre;
            while (temp.next!=null&&temp.next.val<current.val){
                temp = temp.next;
            }
            insertNode(temp,current);
            current = next;
        }
        return pre.next;
    }

    public void insertNode(ListNode pre, ListNode node){
        node.next = pre.next;
        pre.next = node;
    }

    public static void main(String[] args) {
        NO147 solution = new NO147();
        System.out.println(solution.insertionSortList(null));
        solution.insertionSortList(ListNode.generateNodes(new int[] { 1 })).Println();
        solution.insertionSortList(ListNode.generateNodes(new int[] { 3, 2, 1 })).Println();
        solution.insertionSortList(ListNode.generateNodes(new int[] { 4, 3, 2, 1 })).Println();
        solution.insertionSortList(ListNode.generateNodes(new int[] { 5, 2, 4, 1, 3 })).Println();
        solution.insertionSortList(ListNode.generateNodes(new int[] { 1, 5, 4, 2, 3 })).Println();
    }
}
