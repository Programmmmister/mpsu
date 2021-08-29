package DoubleLinkedList;

public class Node<T> {

    private Node<T> prev;
    private Node<T> next;
    private T data;

    public Node() {

    }

    public Node(T data) {
        this.data = data;
    }

    public Node(Node<T> prev, T data, Node<T> next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
