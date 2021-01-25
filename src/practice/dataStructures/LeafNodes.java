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

public class LeafNodes {

    public void findLeafNodes(Node root){
        if(root == null){
            System.out.println("Create a Binary Tree");
        }
        if(root.left == null && root.right == null){
             System.out.println(root.data);
        }
        if(root.left != null){
            findLeafNodes(root.left);
        }
        if(root.right != null){
            findLeafNodes(root.right);
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

        LeafNodes t = new LeafNodes();
        t.findLeafNodes(newNodeRoot);
    }
}