package QuadraticSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuadraticSortTests {
    @Test
    public void emptyArray_doNothing()
    {
        int[] actual = new int[0];
        int[] expected = new int[0];
        QuadraticSort sort = new QuadraticSort();
        sort.sort(actual);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void sort_oneElementArray_doNothing()
    {
        int[] actual = { 10 };
        int[] expected = { 10 };
        QuadraticSort sort = new QuadraticSort();
        sort.sort(actual);

        assertArrayEquals(expected, actual);
    }
}
