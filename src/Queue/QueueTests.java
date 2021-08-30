package Queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueTests {

    // INIT TESTS

    @Test
    public void init() {
        Queue<Integer> queue = new Queue<Integer>();

        int expected = 1;
        int actual = queue.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void init_CustomValue() {
        Queue<Integer> queue = new Queue<Integer>();

        int expected = 1;
        int actual = queue.getSize();
        assertEquals(expected, actual);

        expected = 5;
        actual = queue.peek();
        assertEquals(expected, actual);
    }
}
