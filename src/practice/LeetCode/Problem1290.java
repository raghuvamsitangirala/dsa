public class Problem1290 {
    public int getDecimalValue(ListNode head) {
        int res = 0;
        while (head != null) {
            res <<= 1;
            res += head.val;
            head = head.next;
        }
        
        return res;
    }

    public static void main(String[] args) {
        Problem1290 p = new Problem1290();
        ListNode node1 = new ListNode(4);
        node1.next = new ListNode(1);
        node1.next.next = new ListNode(8);

        p.getDecimalValue(node1);
    }
}
