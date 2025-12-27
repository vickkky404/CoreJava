public class BinarySearchTreeCRUD {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    private Node root;

    // CREATE - Insert value
    public void insert(int value) {
        root = insertHelper(root, value);
        System.out.println("Inserted " + value);
    }

    private Node insertHelper(Node node, int value) {
        if (node == null) return new Node(value);
        if (value < node.data) {
            node.left = insertHelper(node.left, value);
        } else if (value > node.data) {
            node.right = insertHelper(node.right, value);
        }
        return node;
    }

    // READ - Search value
    public boolean search(int value) {
        return searchHelper(root, value);
    }

    private boolean searchHelper(Node node, int value) {
        if (node == null) return false;
        if (value == node.data) return true;
        if (value < node.data) return searchHelper(node.left, value);
        return searchHelper(node.right, value);
    }

    // READ - Inorder traversal
    public void inorder() {
        System.out.print("Inorder: ");
        inorderHelper(root);
        System.out.println();
    }

    private void inorderHelper(Node node) {
        if (node != null) {
            inorderHelper(node.left);
            System.out.print(node.data + " ");
            inorderHelper(node.right);
        }
    }

    // UPDATE - Update value (delete and insert)
    public void update(int oldValue, int newValue) {
        if (search(oldValue)) {
            delete(oldValue);
            insert(newValue);
            System.out.println("Updated " + oldValue + " to " + newValue);
        }
    }

    // DELETE - Delete value
    public void delete(int value) {
        root = deleteHelper(root, value);
        System.out.println("Deleted " + value);
    }

    private Node deleteHelper(Node node, int value) {
        if (node == null) return null;
        if (value < node.data) {
            node.left = deleteHelper(node.left, value);
        } else if (value > node.data) {
            node.right = deleteHelper(node.right, value);
        } else {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;
            Node minRight = findMin(node.right);
            node.data = minRight.data;
            node.right = deleteHelper(node.right, minRight.data);
        }
        return node;
    }

    private Node findMin(Node node) {
        while (node.left != null) node = node.left;
        return node;
    }

    public static void main(String[] args) {
        BinarySearchTreeCRUD bst = new BinarySearchTreeCRUD();

        System.out.println("=== Binary Search Tree CRUD Operations ===");
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.inorder();

        System.out.println("Search 40: " + bst.search(40));

        bst.update(40, 45);
        bst.inorder();

        bst.delete(20);
        bst.inorder();
    }
}
