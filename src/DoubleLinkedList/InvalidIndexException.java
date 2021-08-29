package DoubleLinkedList;

public class InvalidIndexException extends RuntimeException {
    public InvalidIndexException(int index, int maxBound) {
        super("Index " + index + " must be >= 0 and <" + maxBound);
    }
}
