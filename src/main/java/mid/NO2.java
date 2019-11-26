package mid;

/**
 * @author: WYL
 * @create: 2019-11-25 22:08
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 **/
public class NO2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val = l1.val + l2.val;
        int x = 0;
        if (val>9){
            val = val%10;
            x =1;
        }
        ListNode head = new ListNode(val);
        ListNode tmp = head;
        while (true){
            if (l1.next==null&&l2.next==null){
                break;
            }
            int val1 = 0;
            if (l1.next!=null){
                l1 = l1.next;
                val1 = l1.val;
            }
            int val2 = 0;
            if (l2.next!=null){
                l2 = l2.next;
                val2 = l2.val;
            }
            int next = val1 + val2 + x;
            if (next>9){
                next = next%10;
                x=1;
            }else {
                x =0;
            }

            ListNode nextNode = new ListNode(next);
            head.next = nextNode;
            head=nextNode;
        }
        if (x==1){
            ListNode nextNode = new ListNode(1);
            head.next = nextNode;
        }
        return tmp;
    }

    public static void main(String[] args) {
        ListNode x1 = new ListNode(5);
//        ListNode x2 = new ListNode(4);
//        ListNode x3 = new ListNode(3);
//        x1.next=x2;
//        x2.next=x3;
        ListNode y1 = new ListNode(5);
//        ListNode y2 = new ListNode(6);
//        ListNode y3 = new ListNode(4);
//        y1.next=y2;
//        y2.next=y3;

        NO2 no = new NO2();
        no.addTwoNumbers(x1,y1);
    }
}
