package Stack;
import DoubleLinkedList.DoubleLinkedList;
import DoubleLinkedList.Node;

public class Stack<T> {
    protected DoubleLinkedList<T> list;

    public Stack() {
        list = new DoubleLinkedList<T>();
    }

    public Stack(T value) {
        list = new DoubleLinkedList<T>(value);
    }

    // GET INFO

    public int getSize() {
        return list.getSize();
    }

    public Node<T> peek() {
        return list.getStart();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean isFull() {
        return list.isFull();
    }

    // EDIT STACK

    public void push(Node<T> node) {
        list.insertBefore(list.getStart(), node);
    }

    public void pushValue(T data) {
        list.insertBefore(list.getStart(), new Node<T>(data));
    }

    public void pop() {
        list.pop(list.getStart());
    }

    // DEV METHODS

    public void printAll() {
        list.printAll();
    }
}

