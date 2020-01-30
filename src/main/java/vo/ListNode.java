package vo;

/**
 * @author: WYL
 * @create: 2019-11-25 22:09
 **/
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x;next=null;}

    public void Println() {
        System.out.print("{");
        ListNode cur = this;
        while (cur != null) {
            System.out.print(cur.val);
            cur = cur.next;
            if (cur != null) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static ListNode generateNodes(int arr[]) {
        ListNode ret = new ListNode(0);
        ListNode tail = ret;
        for (int v : arr) {
            tail.next = new ListNode(v);
            tail = tail.next;
        }
        return ret.next;
    }
}
