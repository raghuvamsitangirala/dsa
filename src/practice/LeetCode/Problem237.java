public class Problem237 {
    public void deleteNode(ListNode node) {
        if(node==null||node.next==null) return;
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        int[] input = new int[] { 1, 2, 3, 4, 5 };
		Node head = new Node();
		for (int i = 0; i < input.length; i++) {
			head.next = new Node(input[i]);
			head = head.next;
			System.out.print(head.val + "->");
        }
        ListNode delVal = new ListNode(3);
        Problem237 p = new Problem237();
        p.deleteNode(delVal);
        for (int i = 0; i < input.length; i++) {
			head.next = new Node(input[i]);
			head = head.next;
			System.out.print(head.val + "->");
        }
	}   
}

