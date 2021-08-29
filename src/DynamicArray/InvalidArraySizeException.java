package DynamicArray;

public class InvalidArraySizeException extends RuntimeException {
    public InvalidArraySizeException() {
        super("Invalid size. It should be greater than 0.");
    }
}
