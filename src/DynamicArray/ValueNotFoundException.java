package DynamicArray;

public class ValueNotFoundException extends RuntimeException {
    public ValueNotFoundException() {
        super("Value not found");
    }
}
