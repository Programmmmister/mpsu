package NLogNSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NLogNSortTest {

    @Test
    public void emptyArray_doNothing()
    {
        int[] actual = new int[0];
        int[] expected = new int[0];
        NLogNSort sort = new NLogNSort();
        sort.sort(actual);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void oneElementArray_doNothing()
    {
        int[] actual = { 10 };
        int[] expected = { 10 };
        NLogNSort sort = new NLogNSort();
        sort.sort(actual);

        assertArrayEquals(expected, actual);
    }
}
