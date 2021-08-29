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

    // GET INFO

    public int getSize() {

        // returns number of elements in the list

        return list.length;
    }

    public T get(int index) {
        validateIndex(index);

        // returns list element by index

        return list[index];
    }

    public int findFirst(T value) {

        // returns first search result

        for (int i=0; i < getSize(); i++) {
            if (get(i) != null && get(i).equals(value)) {
                return i;
            }
        }

        throw new ValueNotFoundException();
    }

    public int findLast(T value) {

        // returns last search result

        int last_index = -1;

        for (int i=0; i < getSize(); i++) {
            if (get(i).equals(value)) {
                last_index = i;
            }
        }

        if (last_index >= 0) {
            return last_index;
        }

        throw new ValueNotFoundException();
    }

    // EDIT ARRAY

    public void set(int index, T value) {
        validateIndex(index);
        list[index] = value;
    }

    public void resize(int newSize) {

        // copies list elements into another list with different size

        if (newSize < 1) {
            throw new InvalidArraySizeException();
        }

        T[] newList = (T[]) new Object[newSize];

        int UpperBound = newSize;
        if (newSize > getSize()) {
            UpperBound = getSize();
        }

        System.arraycopy(list, 0, newList, 0, UpperBound);

        list = newList;
    }

    public void append(T value) {
        // adds new element to the end of the list

        resize(getSize() + 1);
        set(getSize() - 1,  value);
    }

    // DEV METHODS

    public void printAll() {
        System.out.print("[");
        for (int i = 0; i < getSize() - 1; i++) {
            System.out.print(get(i) + ", ");
        }
        System.out.println(get(getSize() - 1) + "]");
    }

    private void validateIndex(int index) {

        int listSize = getSize();

        if (index < 0 || index >= listSize) {
            throw new InvalidIndexException(index, listSize);
        }
    }
}