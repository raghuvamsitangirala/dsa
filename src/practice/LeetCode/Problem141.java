public class Problem141 {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
 
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
 
            if(slow == fast)
                return true;
        }
 
        return false;
    }

    public static void main(String[] args) {
        Problem141 p = new Problem141();
        ListNode node1 = new ListNode(4);
        node1.next = new ListNode(1);
        node1.next.next = new ListNode(8);

        p.hasCycle(node1);
    }
}
