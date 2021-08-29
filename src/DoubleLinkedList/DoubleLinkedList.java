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

    // GET INFO

    public int getSize() {

        // returns number of nodes

        Node<T> iterator = start;
        int size = 1;

        if (start == null) {
            return 0;
        }

        while (iterator.getNext() != null) {
            size++;
            iterator = iterator.getNext();
        }

        return size;
    }

    public Node<T> get(int index) {
        validateIndex(index);

        // returns node by its index

        Node<T> iterator = start;

        for (int i = 0; i < index; i++) {
            iterator = iterator.getNext();
        }

        return iterator;
    }



    // DEV METHODS

    public void printAll() {
        Node<T> iterator = start;

        System.out.print("(");
        while (iterator.getNext() != null) {
            System.out.print(iterator.getData() + ", ");
            iterator = iterator.getNext();
        }

        System.out.println(iterator.getData() + ")");
    }

    private void validateIndex(int index) {

        int listSize = getSize();

        if (index < 0 || index >= listSize) {
            throw new InvalidIndexException(index, listSize);
        }
    }

}
