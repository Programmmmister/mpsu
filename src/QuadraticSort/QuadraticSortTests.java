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
    public void oneElementArray_doNothing()
    {
        int[] actual = { 10 };
        int[] expected = { 10 };
        QuadraticSort sort = new QuadraticSort();
        sort.sort(actual);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void allElenemtsEquals_doNothing()
    {
        int[] actual = { 10, 10, 10, 10, 10 };
        int[] expected = { 10, 10, 10, 10, 10 };
        QuadraticSort sort = new QuadraticSort();
        sort.sort(actual);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void allElementsDifferent_correctSorting()
    {
        int[] actual = { 10, 1, 5, 11, 2, 6, 8, 4, 9, 3, 7 };
        int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        QuadraticSort sort = new QuadraticSort();
        sort.sort(actual);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void containsSomeEquals_correctSorting()
    {
        int[] actual = { 10, 1, 5, 5, 11, 2, 5, 6, 8, 1, 4, 2, 10, 9, 3, 7, 10, 1, 2 };
        int[] expected = { 1, 1, 1, 2, 2, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10, 10, 10, 11 };
        QuadraticSort sort = new QuadraticSort();
        sort.sort(actual);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void alreadySorted_doNothing()
    {
        int[] actual = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        QuadraticSort sort = new QuadraticSort();
        sort.sort(actual);

        assertArrayEquals(expected, actual);
    }
}
