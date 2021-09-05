package Queue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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

        int expected = 3;
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
        Queue<Integer> queue = new Queue<Integer>();

        int expected = 0;
        int actual = queue.getSize();
        assertEquals(expected, actual);
    }

    // ENQUEUE TESTS

    @Test
    public void enqueue_SizeValidation() {
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(1);
        queue.enqueue(228);
        queue.enqueue(228);

        int expected = 3;
        int actual = queue.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void enqueue_ValueValidation() {
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(1);
        queue.enqueue(228);
        queue.enqueue(69);

        int expected = 69;
        int actual = queue.peek();
        assertEquals(expected, actual);
    }

    @Test
    public void enqueue_enqueueNull() {
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(null);
        Object actual = queue.peek();
        assertNull(actual);
    }

    // DEQUEUE TESTS

    @Test
    public void dequeue_ValueValidation() {
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(1);
        queue.enqueue(228);
        queue.enqueue(13);

        queue.dequeue(13);

        int expected = 13;
        int actual = queue.peek();
        assertEquals(expected, actual);
    }

    @Test
    public void dequeue_SizeValidation() {
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(1);
        queue.enqueue(228);
        queue.enqueue(228);

        queue.dequeue(228);

        int expected = 2;
        int actual = queue.getSize();
        assertEquals(expected, actual);
    }
}
