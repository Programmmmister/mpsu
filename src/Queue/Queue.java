package Queue;
import DynamicArray.DynamicArray;

public class Queue<T> {

    public Queue() {
        DynamicArray<T> queue = new DynamicArray<T>();
    }

    public Queue(int size) {
        DynamicArray<T> queue = new DynamicArray<T>(size);
    }
}
