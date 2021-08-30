package Stack;
import DoubleLinkedList.DoubleLinkedList;
import DoubleLinkedList.Node;

public class Stack<T> {
    DoubleLinkedList<T> list;

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
        return list.getEnd();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean isFull() {
        return list.isFull();
    }

    // EDIT STACK

    public void push(Node<T> node) {
        list.append(node);
    }

    public void pushValue(T data) {
        list.appendValue(data);
    }

    public void pop() {
        list.pop(list.getEnd());
    }

    // DEV METHODS

    public void printAll() {
        list.printAll();
    }
}

