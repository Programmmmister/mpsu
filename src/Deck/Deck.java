package Deck;
import DoubleLinkedList.DoubleLinkedList;

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
        list.appendValue(value);
    }

    public void popFront() {
        if (list.getSize() - 1 < 0) {
            throw new EmptyDeckException();
        }

        list.popIndex(0);
    }
}
