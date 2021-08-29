package DoubleLinkedList;

public class DoubleLinkedList<T> {
    public Node<T> start;
    public Node<T> end;

    public DoubleLinkedList() {
        start = new Node<T>();
        start.setPrev(start);
        end = start;
    }

    public DoubleLinkedList(T value) {
        start = new Node<T>();
        start.setData(value);

        end = start;
    }


}
