package Stack;
import DoubleLinkedList.DoubleLinkedList;
import DoubleLinkedList.Node;

public class Stack<T> {
    DoubleLinkedList<T> list;

    public Stack() {
        list = new DoubleLinkedList<T>();
    }

    public void push(T data) {
        list.appendValue(data);
    }

    public void pop(T value) {
        list.pop(list.findFirst(value));
    }

    public Node<T> peek() {
        return list.getEnd();
    }
}

