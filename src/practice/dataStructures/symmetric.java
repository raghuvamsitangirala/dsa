public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

class Symmetric {
    
    public void symmetricalTree(TreeNode reverseRoot){
        
        TreeNode temp = reverseRoot;
        
        if(reverseRoot == null){
            return;
        }
        
        temp = reverseRoot.left;
        reverseRoot.left = reverseRoot.right;
        reverseRoot.right = temp;
        
        isSymmetric(reverseRoot.left);
        isSymmetric(reverseRoot.right);
    }
    
    public TreeNode isSymmetric(TreeNode root) {
        
//         TreeNode reverseRoot = root;
        
//         symmetricalTree(reverseRoot);
        
//         System.out.println(reverseRoot);
//         System.out.println(root);
        
//         if(reverseRoot != root){
//             return false;
//         }
               
    
        
        return root;
    }


    public static void main(String[] args) {
        TreeNode newNodeRoot = new TreeNode(10);
        TreeNode newNode1 = new TreeNode(20);
        TreeNode newNode2 = new TreeNode(30);
        TreeNode newNode3 = new TreeNode(40);
        TreeNode newNode4 = new TreeNode(50);
        TreeNode newNode5 = new TreeNode(60);

        newNodeRoot.left = newNode2;
        newNodeRoot.right = newNode4;
        newNode4.left = newNode1;
        newNode4.right = newNode3;
        newNode1.left = newNode5;

        Symmetric s = new Symmetric();
        s.isSymmetric(newNodeRoot);
    }
}
