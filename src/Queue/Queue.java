package Queue;
import DynamicArray.DynamicArray;

public class Queue<T> {

    protected DynamicArray<T> queue;

    public Queue() {
        queue = new DynamicArray<T>();
    }

    // GET INFO

    public T peek() {
        if (queue.getSize() == 0) {
            return null;
        }

        return queue.get(getSize() - 1);
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
