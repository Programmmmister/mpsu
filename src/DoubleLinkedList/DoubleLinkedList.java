package DoubleLinkedList;

public class DoubleLinkedList<T> {

    public Node<T> start;
    public Node<T> end;

    public DoubleLinkedList() {
        start = new Node<T>();
        end = start;
    }

    public DoubleLinkedList(T value) {
        start = new Node<T>();

        end = start;
    }

}
