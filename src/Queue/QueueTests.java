package Queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueTests {

    // INIT TESTS

    @Test
    public void init() {
        Queue<Integer> queue = new Queue<Integer>();

        int expected = 0;
        int actual = queue.getSize();
        assertEquals(expected, actual);
    }

    // PEEK TESTS

    @Test
    public void peek() {
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(1);
        queue.enqueue(1);
        queue.enqueue(3);

        int expected = 1;
        int actual = queue.peek();
        assertEquals(expected, actual);
    }

    @Test
    public void peek_empty_returnNull() {
        Queue<Integer> queue = new Queue<Integer>();

        Object expected = null;
        Object actual = queue.peek();
        assertEquals(expected, actual);
    }

    // GETSIZE TESTS

    @Test
    public void getSize() {
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(1);
        queue.enqueue(1);
        queue.enqueue(1);

        int expected = 3;
        int actual = queue.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void getSize_empty() {
        Queue<Integer> stack = new Queue<Integer>();

        int expected = 0;
        int actual = stack.getSize();
        assertEquals(expected, actual);
    }
}
