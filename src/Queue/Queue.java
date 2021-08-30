package Queue;
import DynamicArray.DynamicArray;

public class Queue<T> {

    protected DynamicArray<T> queue;

    public Queue() {
        queue = new DynamicArray<T>();
    }

    public Queue(int size) {
        queue = new DynamicArray<T>(size);
    }

    // GET INFO

    public T peek() {
        return queue.get(0);
    }

    public int getSize() {
        return queue.getSize();
    }

    // EDIT QUEUE

    public void enqueue(T value) {
        queue.append(value);
    }

    public void dequeue(T value) {
        queue.remove(0);
    }

    // DEV METHODS

    public void printAll() {
        queue.printAll();
    }
}
