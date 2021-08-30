package Stack;

import DoubleLinkedList.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTests {
    // INIT TESTS
    @Test
    public void init() {
        Stack<Integer> stack = new Stack<Integer>();

        int expected = 1;
        int actual = stack.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void init_CustomValue() {
        Stack<Integer> stack = new Stack<>(5);

        int expected = 1;
        int actual = stack.getSize();
        assertEquals(expected, actual);

        expected = 5;
        actual = stack.peek().getData();
        assertEquals(expected, actual);
    }
}
