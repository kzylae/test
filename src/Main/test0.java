package Main;

public class test0 {

    public ListNode ReverseList(ListNode head) {

        if (head == null)
            return null;

        ListNode l = null;
        ListNode p = null;
        while (head != null) {

//             l = p;
//             p = head.next;
//             head = p;
//             p = l;


            p = head.next;
            head.next = l;
            l = head;
            head = p;


        }
        return l;
    }
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
