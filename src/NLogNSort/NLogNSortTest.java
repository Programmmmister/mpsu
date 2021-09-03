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

    @Test
    public void allElenemtsEquals_doNothing()
    {
        int[] actual = { 10, 10, 10, 10, 10 };
        int[] expected = { 10, 10, 10, 10, 10 };
        NLogNSort sort = new NLogNSort();
        sort.sort(actual);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void allElementsDifferent_correctSorting()
    {
        int[] actual = { 10, 1, 5, 11, 2, 6, 8, 4, 9, 3, 7 };
        int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        NLogNSort sort = new NLogNSort();
        sort.sort(actual);

        assertArrayEquals(expected, actual);
    }
}
