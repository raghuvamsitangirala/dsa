class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }

    Node(int data, Node left, Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

public class Trees {

    public int findSum(Node root){
        if(root == null){
            return 0;
        }
        else{
            // System.out.println(root.data);
            return root.data + findSum(root.left) + findSum(root.right);
        }

    }

    public static void main(String[] args) {
        Node newNodeRoot = new Node(10);
        Node newNode1 = new Node(20);
        Node newNode2 = new Node(30);
        Node newNode3 = new Node(40);
        Node newNode4 = new Node(50);
        Node newNode5 = new Node(60);

        newNodeRoot.left = newNode2;
        newNodeRoot.right = newNode4;
        newNode4.left = newNode1;
        newNode4.right = newNode3;
        newNode1.left = newNode5;

        Trees t = new Trees();
        int sum = t.findSum(newNodeRoot);
        System.out.println(sum);
    }
}