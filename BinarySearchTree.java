public class BinarySearchTree {
    class Node {
        int key;
        Node left, right;
        Node(int key) {
            this.key = key;
            left = right = null;
        }
    }
    private Node root;
    BinarySearchTree() {
        root = null;
    }
    void insert(int key) {
        root = insertKey(root, key);
    }
    private Node insertKey(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        } else if (key < root.key) {
            root.left = insertKey(root.left, key);
        } else if (key > root.key) {
            root.right = insertKey(root.right, key);
        }
        return root;
    }

    void inOrder(){
        inOrderTraverse(root);
    }
    private void inOrderTraverse( Node root ){
        if(root == null) return;
        inOrderTraverse(root.left);
        System.out.print(root.key + " ");
        inOrderTraverse(root.right);
    }

    void delete( int key ){
           deleteKey(root , key);
    }
    private void deleteKey(Node root , int key){
           if(root == null) return;
           else if( key < root.key){
             deleteKey(root.left, key);
           } 
    }

    public static void main(String ...args){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(60);
        tree.insert(46);
        tree.insert(12);
        tree.insert(11);
        tree.insert(71);
        tree.insert(54);
        tree.insert(87);
        tree.insert(55);
        tree.insert(62);
        tree.inOrder();
        tree.delete(62);
        System.out.println();
        tree.inOrder();

    }

}
