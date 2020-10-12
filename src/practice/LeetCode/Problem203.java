public class Problem203 {

    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        
        // Keep deleting nodes until you see a number other than val
        
        while(head!=null && head.val == val)
        {
            head = head.next;
        }
        
        if(head == null)
            return head;
        
        // After this keep deleting all the vals from the remaining list
        ListNode temp = head;
        while(temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Problem203 p = new Problem203();
        int[] input = new int[] { 1, 2, 3, 4, 5 };
		ListNode head = new ListNode();
		for (int i = 0; i < input.length; i++) {
			head.next = new ListNode(input[i]);
			head = head.next;
			System.out.print(head.val + "->");
		}
        p.removeElements(head, 6);
    }
}

/*
    1. void return type = return;
        data type return type = return [data type value]
        
    2. Initialized value will not be the final value
  
  */
