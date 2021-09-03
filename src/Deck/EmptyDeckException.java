package Deck;

public class EmptyDeckException extends RuntimeException {
    public EmptyDeckException() {
        super("The deck is empty.");
    }
}
