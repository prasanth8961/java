class Node{
    int key;
    Node left , right;
    Node(int key){
        this.key = key;
        left = right = null;
    }
}

public class BinaryTree {

    private Node  root;
    
     BinaryTree(){
        this.root = null;
     }

     public void insert(int key){
        root = insertNode(root , key);
     }

     private Node insertNode(Node root , int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if(key < root.key){
            root.left = insertNode(root.left, key);
        }else if(key > root.key){
            root.right = insertNode(root.right, key);
        }
        return root;
     }

     public boolean search(int key){
        return searchValue(root , key);
     }

     private boolean searchValue(Node root , int  key){
        if(root == null){
            return false;
        }
        if(root.key == key){
            return true;
        }
        if(key < root.key){
           return  searchValue(root.left, key);
        }else {
           return searchValue(root.right, key);
        }
     }

     public void preorderTraverse(){
         preorder(root);
     }
     
     private void preorder(Node root){
        if(root != null) {
            System.out.println(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
     }
    

    public static void main(String[] args) {
        BinaryTree btree = new BinaryTree();
        btree.insert(10);
        btree.insert(5);
        btree.insert(15);
        btree.insert(20);
        btree.insert(30);
        btree.insert(25);
        btree.preorderTraverse();
        System.out.println();
        if(btree.search(5)){
            System.out.println("Element found");
        }else{
            System.out.println("element not found");
        }

    }
}
