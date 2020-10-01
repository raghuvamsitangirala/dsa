public class LinkedLists {
	public static void main(String[] args) {
		int[] input = new int[] { 1, 2, 3, 4, 5 };
		Node head = new Node();

		for (int i = 0; i < input.length; i++) {
			head.next = new Node(input[i]);
			head = head.next;
			System.out.println(head.val);
		}
	}
}

class Node {
	int val;
	Node next;

	public Node() {
	}

	public Node(int val) {
		this.val = val;
	}
}
