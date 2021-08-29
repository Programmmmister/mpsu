package DynamicArray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DynamicArrayTests {

    // INIT TESTS
    @Test
    public void init_sizeDefault() {
        DynamicArray<Integer> array = new DynamicArray<Integer>();

        int expected = array.DEFAULT_SIZE;
        int actual = array.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void init_SizeCustom() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(10);

        int expected = 10;
        int actual = array.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void init_InvalidSize_ThrowsException() {
        assertThrows(InvalidArraySizeException.class, () -> new DynamicArray<Integer>(-1));
        assertThrows(InvalidArraySizeException.class, () -> new DynamicArray<Integer>(0));
    }

    // GETSIZE TESTS

    @Test
    public void getSize() {
        DynamicArray<Integer> array = new DynamicArray<Integer>(5);

        int expected = 5;
        int actual = array.getSize();
        assertEquals(expected, actual);
    }

    // GET TESTS

    @Test
    public void get() {
        DynamicArray<String> array = new DynamicArray<String>(5);

        array.set(0, "ama here");

        String expected = "ama here";
        String actual = array.get(0);
        assertEquals(expected, actual);
    }

    @Test
    public void get_InvalidIndex_ThrowsException() {
        DynamicArray<String> array = new DynamicArray<String>(5);

        assertThrows(InvalidIndexException.class, () -> array.get(-1));
        assertThrows(InvalidIndexException.class, () -> array.get(5));
    }

}
