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
}
