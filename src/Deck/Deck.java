package Deck;
import DoubleLinkedList.DoubleLinkedList;

public class Deck<T> {
    DoubleLinkedList<T> list;
    int size = 0;

    public Deck() {
        list = new DoubleLinkedList<T>();
    }
}
