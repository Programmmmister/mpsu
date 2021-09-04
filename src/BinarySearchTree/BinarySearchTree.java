package BinarySearchTree;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = new Node();
    }

    public BinarySearchTree(String key) {
        root = new Node(key);
    }

    // EDIT

    public void insert(String key) {
        if (root.key == null) {
            root = new Node(key);
            return;
        }
        insertRec(key, root);
    }

    private static void insertRec(String key, Node focusNode) {
        if (key.compareTo(focusNode.key) > 0) {
            // if the node is to be placed on the right
            // (if new key is greater than the focusNode key)

            if (focusNode.rightNode == null) {
                focusNode.rightNode = new Node(key);
                focusNode.rightNode.parentNode = focusNode;
                return;
            } else {
                // if the right child does exist
                insertRec(key, focusNode.rightNode);
            }
        }

        if (key.compareTo(focusNode.key) <= 0) {
            // if the node is to be placed on the left
            // (if new key is lesser than the focusNode key)

            if (focusNode.leftNode == null) {
                focusNode.leftNode = new Node(key);
                focusNode.leftNode.parentNode = focusNode;
            } else {

                // if the left child does exist
                insertRec(key, focusNode.leftNode);
            }
        }
    }

}
