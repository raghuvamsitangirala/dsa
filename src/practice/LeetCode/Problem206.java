public class Problem206 {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head, prev = null, temp = null;
        while(curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;     
            curr = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        Problem206 p = new Problem206();
        ListNode node1 = new ListNode(4);
        node1.next = new ListNode(1);
        node1.next.next = new ListNode(8);

        p.reverseList(node1);
    }
}
