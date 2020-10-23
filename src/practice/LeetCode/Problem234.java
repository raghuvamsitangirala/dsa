public class Problem234 {
    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return true;
     
        ListNode p = head;
        ListNode prev = new ListNode(head.val);
     
        while(p.next != null){
            ListNode temp = new ListNode(p.next.val);
            temp.next = prev;
            prev = temp;
            p = p.next;
        }
     
        ListNode p1 = head;
        ListNode p2 = prev;
     
        while(p1!=null){
            if(p1.val != p2.val)
                return false;
     
            p1 = p1.next;
            p2 = p2.next;
        }
     
        return true;
    }

    public static void main(String[] args) {
        Problem234 p = new Problem234();
        ListNode node1 = new ListNode(4);
        node1.next = new ListNode(1);
        node1.next.next = new ListNode(8);

        p.isPalindrome(node1);
    }
}
