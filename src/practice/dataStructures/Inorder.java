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

public class Inorder {

    public void preorderTraversal(Node root) {
        if(root == null){
            return ;
        }
        
        System.out.println(root.data);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    
    public void inorderTraversal(Node root) {
            if(root == null){
                return ;
            }
            
            inorderTraversal(root.left);
            System.out.println(root.data);
            inorderTraversal(root.right);
    }

    public void postorderTraversal(Node root) {
        if(root == null){
            return ;
        }
        
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.println(root.data);
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

        Inorder t = new Inorder();
        System.out.println("------------PreOrder------------------");
        t.preorderTraversal(newNodeRoot);
        System.out.println("-------------Inorder-----------------");
        t.inorderTraversal(newNodeRoot);
        System.out.println("--------------PostOrder----------------");
        t.postorderTraversal(newNodeRoot);
    }
}