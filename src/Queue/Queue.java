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

    public void enqueue(T value) {
        queue.append(value);
    }

    public void dequeue(T value) {
        queue.remove(0);
    }

    public T peek() {
        queue.get(0);
    }
}
