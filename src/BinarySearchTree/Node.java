package BinarySearchTree;

public class Node {
    String key;
    Node parentNode;
    Node rightNode;
    Node leftNode;

    public Node() {
        key = null;
        parentNode = null;
        rightNode = null;
        leftNode = null;
    }

    public Node(String key) {
        this.key = key;
        parentNode = null;
        rightNode = null;
        leftNode = null;
    }

    public String getKey() {
        return key;
    }

    public Node getParentNode() {
        return parentNode;
    }

    public boolean isEmpty() {
        if (key == null) {
            return true;
        } else return key.equals("");
    }

    public Node getLeft() {
        return leftNode;
    }

    public Node getRight() {
        return rightNode;
    }

    public int getHeight() {
        if (leftNode == null & rightNode == null) {
            // node has no children

            return 0;
        }

        if (leftNode != null & rightNode == null) {
            // node has left child

            return leftNode.getHeight() + 1;
        }

        if (leftNode == null & rightNode != null) {
            // node has right child

            return rightNode.getHeight() + 1;
        }

        if (leftNode != null & rightNode != null) {
            return Math.max(leftNode.getHeight(), rightNode.getHeight()) + 1;
        }

        return -2;
    }
}
