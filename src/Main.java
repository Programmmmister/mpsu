import DoubleLinkedList.*;

public class Main {

    public static void main(String[] args) {
        DoubleLinkedList<Integer> linky = new DoubleLinkedList<Integer>(1);

        linky.insertToStart(new Node<Integer>(3));

        linky.printAll();
    }
}
