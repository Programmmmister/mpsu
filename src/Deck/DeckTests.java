package Deck;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeckTests {
    @Test
    public void init_sizeTest() {
        Deck<Integer> deck = new Deck<Integer>();

        int expected = 2;
        int actual = deck.getSize();
        assertEquals(expected, actual);
    }

    // pushFront tests

    @Test
    public void pushFront_sizeTest() {
        Deck<Integer> deck = new Deck<Integer>();

        deck.pushFront(1);
        deck.pushFront(1);
        deck.pushFront(1);
        deck.pushFront(1);
        deck.pushFront(1);

        int expected = 7;
        int actual = deck.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void pushFront_dataTest() {
        Deck<Integer> deck = new Deck<Integer>();

        deck.pushFront(1);
        deck.pushFront(2);
        deck.pushFront(3);
        deck.pushFront(4);
        deck.pushFront(5);

        int expected = 5;
        int actual = deck.peekFront();
        assertEquals(expected, actual);
    }

    // popFront tests

    @Test
    public void popFront_sizeTest() {
        Deck<Integer> deck = new Deck<Integer>();

        deck.pushBack(1);
        deck.pushBack(2);
        deck.pushBack(3);

        deck.popFront();

        int expected = 2;
        int actual = deck.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void popFront_sizeTest_negativeSize() {
        Deck<Integer> deck = new Deck<Integer>();

        deck.pushBack(1);
        deck.pushBack(2);
        deck.pushBack(3);

        deck.popFront();
        deck.popFront();
        deck.popFront();
        deck.popFront();

        int expected = 1;
        int actual = deck.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void popFront_dataTest() {
        Deck<Integer> deck = new Deck<Integer>();

        deck.pushBack(1);
        deck.pushBack(2);
        deck.pushBack(3);

        int expected = 1;
        int actual = deck.peekFront();
        assertEquals(expected, actual);
    }

    // peekFront tests

    @Test
    public void peekFront_emptyDeck_throwsException() {
        Deck<Integer> deck = new Deck<Integer>();

        deck.pushBack(1);
        deck.pushBack(2);
        deck.pushBack(3);

        deck.popFront();
        deck.popFront();
        deck.popFront();

        deck.peekFront();
    }

    // pushBack tests

    @Test
    public void pushBack_sizeTest() {
        Deck<Integer> deck = new Deck<Integer>();

        deck.pushBack(1);
        deck.pushBack(1);
        deck.pushBack(1);

        int expected = 3;
        int actual = deck.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void pushBack_dataTest() {
        Deck<Integer> deck = new Deck<Integer>();

        deck.pushBack(1);
        deck.pushBack(2);
        deck.pushBack(3);

        int expected = 1;
        int actual = deck.peekFront();
        assertEquals(expected, actual);
    }

    // popBack tests

    @Test
    public void popBack_sizeTest() {
        Deck<Integer> deck = new Deck<Integer>();

        deck.pushBack(1);
        deck.pushBack(2);
        deck.pushBack(3);

        deck.popBack();

        int expected = 2;
        int actual = deck.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void popBack_sizeTest_negativeSize() {
        Deck<Integer> deck = new Deck<Integer>();

        deck.pushBack(1);
        deck.pushBack(2);
        deck.pushBack(3);

        deck.popBack();
        deck.popBack();
        deck.popBack();
        deck.popBack();

        int expected = 1;
        int actual = deck.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void popBack_dataTest() {
        Deck<Integer> deck = new Deck<Integer>();

        deck.pushBack(1);
        deck.pushBack(2);
        deck.pushBack(3);

        deck.popBack();

        int expected = 2;
        int actual = deck.peekBack();
        assertEquals(expected, actual);
    }

    // peekBack tests

    @Test
    public void peeekBack_normalTest() {
        Deck<Integer> deck = new Deck<Integer>();

        deck.pushBack(1);
        deck.pushBack(2);
        deck.pushBack(3);

        int expected = 3;
        int actual = deck.peekBack();
        assertEquals(expected, actual);
    }

    @Test
    public void peekBack_emptyDeck_throwsException() {
        Deck<Integer> deck = new Deck<Integer>();

        deck.pushBack(1);
        deck.pushBack(2);
        deck.pushBack(3);

        deck.popFront();
        deck.popFront();
        deck.popFront();

        deck.peekBack();
    }
}
