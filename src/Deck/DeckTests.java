package Deck;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeckTests {
    @Test
    public void init_sizeTest() {
        Deck<Integer> deck = new Deck<Integer>();

        int expected = 0;
        int actual = deck.getSize();
        assertEquals(expected, actual);
    }

}
