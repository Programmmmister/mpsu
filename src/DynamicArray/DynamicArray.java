package DynamicArray;

public class DynamicArray<T> {
    private T[] list;
    protected int DEFAULT_SIZE = 0;

    public DynamicArray() {
        list = (T[]) new Object[DEFAULT_SIZE];
    }

    public DynamicArray(int size) {
        if (size < 1) {
            throw new InvalidArraySizeException();
        }

        list = (T[]) new Object[size];
    }
}
