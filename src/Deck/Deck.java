package Deck;
import DoubleLinkedList.DoubleLinkedList;
import DoubleLinkedList.Node;

public class Deck<T> {
    DoubleLinkedList<T> list;

    public Deck() {
        list = new DoubleLinkedList<T>();
    }

    // GET INFO

    public T peekFront() {

        if (list.getStart() != null) {
            return list.getStart().getData();
        }

        throw new EmptyDeckException();
    }

    // EDIT ARRAY

    public void pushFront(T value) {
        list.insertToStart(new Node<T>(value));
    }

    public void popFront() {
        if (list.getSize() - 1 < 0) {
            throw new EmptyDeckException();
        }

        list.popIndex(0);
    }

    public void pushBack(T value) {
        list.append(new Node<T>(value));
    }

    public void popBack() {
        if (list.getSize() - 1 < 0) {
            throw new EmptyDeckException();
        }

        list.popIndex(list.getSize() -1);
    }
}
