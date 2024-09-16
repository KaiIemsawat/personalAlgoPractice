package searchs.binarySearchTree_re;

public class BinarySearchTree {

    Node root;

    // To insert node
    public void insert(Node node) {
        root = insertHelper(root, node);
    }

    // helper method for insert
    private Node insertHelper(Node root, Node node) {

        int data = node.data;
        if (root == null) {
            root = node;
            return root;
        }
        else if (data < root.data) {
            root.leftChild = insertHelper(root.leftChild, node);
        }
        else {
            root.rightChild = insertHelper(root.rightChild, node);
        }
        return root;
    }

    public void display() {
        displayHelper(root);
    }

    // helper method for display
    private void displayHelper(Node root) {
        if (root != null) {
            displayHelper(root.leftChild);
            System.out.println(root.data);
            displayHelper(root.rightChild);
        }
    }

    public boolean search(int data) {
        return searchHelper(root, data);
    }

    // helper method for search
    private boolean searchHelper(Node root, int data) {

        if(root == null) {
            return false;
        }
        else if (root.data == data) {
            return true;
        }
        else if (root.data > data) {
            return searchHelper(root.leftChild, data);
        }
        else {
            return searchHelper(root.rightChild, data);
        }
    }

    public void remove(int data) {
        if(search(data)) {
            removeHelper(root, data);
        }
        else {
            System.out.println(data + " could not be found");
        }
    }

    //helper method for remove
    private Node removeHelper(Node root, int data) {
        if (root == null) {
            return root;
        }
        else if (data < root.data) {
            root.leftChild = removeHelper(root.leftChild, data);
        }
        else if (data > root.data) {
            root.rightChild = removeHelper(root.rightChild, data);
        }
        else {
            if (root.leftChild == null && root.rightChild == null) {
                root = null;
            }
            else if (root.rightChild != null) { // Find a successor to replace this node
                root.data = successor(root);
                root.rightChild = removeHelper(root.rightChild, root.data);
            }
            else { // Find a predecessor to replace this node
                root.data = predecessor(root);
                root.leftChild = removeHelper(root.leftChild, root.data);
            }
        }
        return root;
    }

    private int successor(Node root) { // Find the least value below the right child of this root node
        root = root.rightChild;
        while (root.leftChild != null) {
            root = root.leftChild;
        }
        return root.data;
    }

    private int predecessor(Node root) {
        root = root.leftChild;
        while (root.rightChild != null) {
            root = root.rightChild;
        }
        return root.data;
    }
}
