package BinarySearchTree;
import java.util.Objects;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = new Node();
    }

    public BinarySearchTree(String key) {
        root = new Node(key);
    }

    // GET INFO

    public Node search(String key) {
        return searchRec(key, root);
    }

    private static Node searchRec(String key, Node focusNode) {
        if (focusNode == null) {
            // if last node and not found
            return null;
        }

        if (key.equals(focusNode.key)) {
            // if node is found
            return focusNode;
        }

        // if node is not found

        if (key.compareTo(focusNode.key) > 0) {
            return searchRec(key, focusNode.rightNode);
        }

        else if (key.compareTo(focusNode.key) < 0) {
            return searchRec(key, focusNode.leftNode);
        }
        return null;
    }

    public Node getMin() {
        Node focusNode = root;
        while (nodeExists(focusNode, "left")) {
            focusNode = focusNode.leftNode;
        }

        return focusNode;
    }

    public Node getMax() {
        Node focusNode = root;
        while (nodeExists(focusNode, "right")) {
            focusNode = focusNode.rightNode;
        }

        return focusNode;
    }

    public Node getPredecessor(Node focusNode) {
        return getPredecessorRec(focusNode);
    }

    private static Node getPredecessorRec(Node focusNode) {
        if (nodeExists(focusNode, "left")) {
            focusNode = focusNode.leftNode;
            while (nodeExists(focusNode, "right")) {
                focusNode = focusNode.rightNode;
            }
            return focusNode;
        } else {
            // if left node doesn't exist

            while (nodeExists(focusNode, "parent")) {
                Node focusNodeParent = focusNode.parentNode;
                if (focusNodeParent.rightNode == focusNode) {
                    // if parent element has a right child
                    // and this left child is the focus node

                    return focusNodeParent;
                } else {
                    // if right node isn't the focus node
                    focusNode = focusNodeParent;
                }
            }
            return null;
        }
    }

    public Node getSuccessor(Node focusNode) {
        return getSuccessorRec(focusNode);
    }

    private static Node getSuccessorRec(Node focusNode) {
        if (nodeExists(focusNode, "right")) {
            focusNode = focusNode.rightNode;
            while (focusNode.leftNode != null) {
                focusNode = focusNode.leftNode;
            }
            return focusNode;
        } else {
            // if the right node doesn't exist
            while (nodeExists(focusNode, "parent")) {
                Node focusNodeParent = focusNode.parentNode;
                if (focusNodeParent.leftNode == focusNode) {
                    // if parent element has a left child
                    // and this left child is the focus node
                    return focusNodeParent;
                } else {
                    focusNode = focusNodeParent;
                }
            }

            return null;
        }
    }

    private static int countChildren(Node focusNode) {
        int count = 0;
        if (nodeExists(focusNode, "left")) {
            count++;
        }

        if (nodeExists(focusNode, "right")) {
            count++;
        }
        return count;
    }

    private static boolean nodeExists(Node focusNode, String whatNode) {
        boolean doesExist;

        switch (whatNode) {
            case "right" -> {
                try {
                    // if rightNode exists, returns true
                    doesExist = focusNode.rightNode != null;
                } catch (Exception NullPointerException) {
                    doesExist = false;
                }
                return doesExist;
            }

            case "left" -> {
                try {
                    // if leftNode exists, returns true
                    doesExist = focusNode.leftNode != null;
                } catch (Exception NullPointerException) {
                    doesExist = false;
                }
                return doesExist;
            }

            case "parent" -> {
                try {
                    // if parentNode exists, returns true
                    doesExist = focusNode.parentNode != null;
                } catch (Exception NullPointerException) {
                    doesExist = false;
                }
                return doesExist;
            }
            default -> throw new InvalidNameException();
        }
    }

    private Node getHighest() {
        Node firstNode = getMin();
        while (firstNode.parentNode != null) {
            firstNode = firstNode.parentNode;
        }

        return firstNode;
    }

    // EDIT

    public void delete(Node node) {
        if (node == null) {
            return;
        }

        deleteRec(node);
    }

    private Node deleteRec(Node focusNode) {
        // returns the replacement of focusNode

        if (focusNode.parentNode == null) {
            focusNode.parentNode = new Node();
            focusNode.parentNode.leftNode = focusNode;
        }
        boolean isleftNodeChild = focusNode.parentNode.leftNode == focusNode;

        if (focusNode.leftNode == null & focusNode.rightNode == null) {
            // NO CHILDREN - has no children

            if (isleftNodeChild) {
                // if focusNode is leftNode child

                focusNode.parentNode.leftNode = null;
            } else {
                // if focusNode is rightNode child

                focusNode.parentNode.rightNode = null;
            }
            if (root.leftNode == null & root.rightNode == null) {
                // if root is the node to be deleted

                root = null;
            }
        }

        else if (focusNode.leftNode != null & focusNode.rightNode == null) {
            // ONE CHILD  - only has leftNode child

            if (isleftNodeChild) {
                focusNode.parentNode.leftNode = focusNode.leftNode; // linking focusNode.parentNode to the new child
            } else {
                // is rightNode child
                focusNode.parentNode.rightNode = focusNode.leftNode;
            }

            focusNode.leftNode.parentNode = focusNode.parentNode; // link the new child to focusNode.parentNode

            if (focusNode == root) {
                // if root is the node to be deleted
                root = focusNode.leftNode;
            }
        }

        else if (focusNode.leftNode == null & focusNode.rightNode != null) {
            // ONE CHILD  - only has rightNode child

            if (isleftNodeChild) {
                focusNode.parentNode.leftNode = focusNode.rightNode; // linking focusNode.parentNode to the new child
            } else {
                // is rightNode child
                focusNode.parentNode.rightNode = focusNode.rightNode;
            }

            focusNode.rightNode.parentNode = focusNode.parentNode; // link the new child to focusNode.parentNode

            if (focusNode == root) {
                // if root is the node to be deleted
                root = focusNode.rightNode;
            }
        }

        else {
            // TWO CHILDREN - has two children
            Node successorNode = getSuccessor(focusNode);


            // replacing successorNode with its rightNode child
            successorNode.parentNode.leftNode = successorNode.rightNode;
            if (successorNode.rightNode != null) {
                successorNode.rightNode.parentNode = successorNode.parentNode;
            }

            // attaching focusNode's rightNode node to successorNode's rightNode node
            successorNode.rightNode = focusNode.rightNode;
            focusNode.rightNode.parentNode = successorNode;

            // linking successorNode with focusNode's parentNode and vise-versa
            successorNode.parentNode = focusNode.parentNode;
            if (isleftNodeChild) {
                focusNode.parentNode.leftNode = successorNode;
            } else {
                focusNode.parentNode.rightNode = successorNode;
            }

            // attaching focusNode's leftNode node to successorNode's leftNode node
            successorNode.leftNode = focusNode.leftNode;
            successorNode.leftNode.parentNode = successorNode;

            focusNode.parentNode = null;
            focusNode.leftNode = null;
            focusNode.rightNode = null;
            focusNode.key = null;

            if (root.key == null) {
                root = successorNode;
                root.parentNode = null;
            }

            return successorNode;
        }

        return focusNode;
    }

    public void insert(String key) {
        if (root.key == null) {
            root = new Node(key);
            return;
        }
        balance(Objects.requireNonNull(insertRec(key, root)).parentNode);
    }

    private static Node insertRec(String key, Node focusNode) {
        if (key.compareTo(focusNode.key) > 0) {
            // if the node is to be placed on the right
            // (if new key is greater than the focusNode key)

            if (focusNode.rightNode == null) {
                focusNode.rightNode = new Node(key);
                focusNode.rightNode.parentNode = focusNode;
                return focusNode.rightNode;
            } else {
                // if the right child does exist
                return insertRec(key, focusNode.rightNode);
            }
        }

        else if (key.compareTo(focusNode.key) <= 0) {
            // if the node is to be placed on the left
            // (if new key is lesser than the focusNode key)

            if (focusNode.leftNode == null) {
                focusNode.leftNode = new Node(key);
                focusNode.leftNode.parentNode = focusNode;
                return focusNode.leftNode;
            } else {
                // if the left child does exist
                return insertRec(key, focusNode.leftNode);
            }
        }

        return null;
    }

    private Node rotateRight(Node focusNode) {
        Node parentNode = focusNode.parentNode;
        Node leftChild = focusNode.leftNode;
        focusNode.leftNode = leftChild.rightNode;
        if (leftChild.rightNode != null) {
            leftChild.rightNode.parentNode = leftChild;
        }

        leftChild.rightNode = focusNode;
        focusNode.parentNode = leftChild;
        leftChild.parentNode = parentNode;

        if (parentNode != null) {
            if (parentNode.leftNode == focusNode) {
                parentNode.leftNode = leftChild;
            } else {
                parentNode.rightNode = leftChild;
            }
        }

        root = getHighest();
        return leftChild;
    }

    private Node rotateLeft(Node focusNode) {
        Node parentNode = focusNode.parentNode;
        Node rightChild = focusNode.rightNode;
        focusNode.rightNode = rightChild.leftNode;

        if (rightChild.rightNode != null) {
            rightChild.rightNode.parentNode = rightChild;
        }

        rightChild.leftNode = focusNode;
        focusNode.parentNode = rightChild;
        rightChild.parentNode = parentNode;

        if (parentNode != null) {
            if (parentNode.leftNode == focusNode) {
                parentNode.leftNode = rightChild;
            } else {
                parentNode.rightNode = rightChild;
            }
        }

        root = getHighest();
        return rightChild;
    }

    private void rotateLeftRight(Node focusNode) {
        focusNode.leftNode = rotateLeft(focusNode.leftNode);
        focusNode = rotateRight(focusNode);
    }

    private void rotateRightLeft(Node focusNode) {
        focusNode.rightNode = rotateRight(focusNode.rightNode);
        focusNode = rotateLeft(focusNode);
    }

    public void balance(Node focusNode) {
        while (focusNode != null) {

            if (focusNode.getBalance() > 1) {
                // if left-heavy

                if (focusNode.leftNode.getBalance() > 0) {
                    // left-left case

                    focusNode = rotateRight(focusNode);
                } else {
                    // left-right case

                    rotateLeftRight(focusNode);
                }
            }

            else if (focusNode.getBalance() < -1) {
                // if right-heavy

                if (focusNode.rightNode.getBalance() < 0) {
                    // right-right case

                    focusNode = rotateRight(focusNode);
                } else {
                    // right-left case

                    rotateRightLeft(focusNode);
                }
            }

            focusNode = focusNode.parentNode;
        }
    }

    // DEV METHODS

    public void printAll(boolean reversed) {
        // reversed - from min to max
        // normal - max to min

        reversed = !reversed;

        if (reversed) {
            printAllRec(getMax(), reversed);
        } else {
            printAllRec(getMin(), reversed);
        }
    }

    private static void printAllRec(Node focusNode, boolean reversed){
        if (focusNode == null) {
            return;
        }

        System.out.println(focusNode.key);

        Node nextNode;
        if (reversed) {
            nextNode = getPredecessorRec(focusNode);
        } else {
            nextNode = getSuccessorRec(focusNode);
        }
        printAllRec(nextNode, reversed);
    }

}
