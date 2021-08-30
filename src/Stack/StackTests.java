package Stack;

import DoubleLinkedList.DoubleLinkedList;
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

    // GETSIZE TESTS

    @Test
    public void getSize() {
        Stack<Integer> stack = new Stack<Integer>();

        stack.pushValue(1);
        stack.pushValue(1);
        stack.pushValue(1);

        int expected = 4;
        int actual = stack.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void getSize_empty() {
        Stack<Integer> stack = new Stack<Integer>();

        int expected = 1;
        int actual = stack.getSize();
        assertEquals(expected, actual);
    }

    // PEEK TESTS

    @Test
    public void peek() {
        Stack<Integer> stack = new Stack<>(5);

        stack.pushValue(1);
        stack.pushValue(1);
        stack.pushValue(3);

        int expected = 3;
        int actual = stack.peek().getData();
        assertEquals(expected, actual);
    }
}
