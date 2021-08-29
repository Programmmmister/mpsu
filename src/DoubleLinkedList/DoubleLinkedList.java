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

    public Node<T> getStart() {
        // returns first node

        return start;
    }

    public Node<T> getEnd() {
        // returns last node

        return end;
    }

    public Node<T> findFirst(T value) {
        // returns the first occurrence of node with a specific value

        Node<T> iterator = start;
        while (iterator != null) {

            if (iterator.getData() != null && iterator.getData().equals(value)) {
                return iterator;
            }

            iterator = iterator.getNext();
        }

        throw new ValueNotFoundException();
    }

    public int findFirstIndex(T value) {
        // returns index of the first occurrence of node with a specific value

        Node<T> iterator = start;
        int index = 0;

        while (iterator != null) {

            if (iterator.getData() != null && iterator.getData().equals(value)) {
                return index;
            }

            index++;
            iterator = iterator.getNext();
        }

        throw new ValueNotFoundException();
    }

    public Node<T> findLast(T value) {

        // returns the last occurrence of node with a specific value

        Node<T> iterator = start;
        Node<T> last = null;


        while (iterator != null) {

            if (iterator.getData() != null && iterator.getData().equals(value)) {
                last = iterator;
            }

            iterator = iterator.getNext();
        }

        if (last != null) {
            return last;
        }

        throw new ValueNotFoundException();
    }

    public int findLastIndex(T value) {

        // returns last index of occurrence of node with a specific value

        Node<T> iterator = start;
        int last = -1;
        int index = 0;

        while (iterator != null) {

            if (iterator.getData() != null && iterator.getData().equals(value)) {
                last = index;
            }

            index++;
            iterator = iterator.getNext();
        }

        if (last != -1) {
            return last;
        }

        throw new ValueNotFoundException();
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
