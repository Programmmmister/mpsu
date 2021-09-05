package DoubleLinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DoubleLinkedListTests {

    // INIT TESTS
    @Test
    public void init() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();

        int expected = 1;
        int actual = list.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void init_CustomValue() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(5);

        int expected = 1;
        int actual = list.getSize();
        assertEquals(expected, actual);

        expected = 5;
        actual = list.get(0).getData();
        assertEquals(expected, actual);
    }

    // GETSIZE TESTS

    @Test
    public void getSize() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();

        list.appendValue(1);
        list.appendValue(1);
        list.appendValue(1);

        int expected = 3;
        int actual = list.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void getSize_empty() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();

        int expected = 2;
        int actual = list.getSize();
        assertEquals(expected, actual);
    }

    // GET TESTS

    @Test
    public void get() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(0);

        list.appendValue(1);
        list.appendValue(2);
        list.appendValue(3);

        int expected = 2;
        int actual = list.get(2).getData();
        assertEquals(expected, actual);
    }

    @Test
    public void get_InvalidIndex_ThrowsException() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();

        assertThrows(InvalidIndexException.class, () -> list.get(-1));
        assertThrows(InvalidIndexException.class, () -> list.get(5));
    }

    // GETSTART TESTS

    @Test
    public void getStart() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(228);

        list.appendValue(1);
        list.appendValue(2);
        list.appendValue(3);

        int expected = 228;
        int actual = list.getStart().getData();
        assertEquals(expected, actual);
    }

    // GETEND TESTS

    @Test
    public void getEnd() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(228);

        list.appendValue(1);
        list.appendValue(2);
        list.appendValue(3);

        int expected = 3;
        int actual = list.getEnd().getData();
        assertEquals(expected, actual);
    }

    // FINDFIRST TESTS

    @Test
    public void findFirst() {
        DoubleLinkedList<Integer> beginning = new DoubleLinkedList<>(228);

        beginning.appendValue(1);
        beginning.appendValue(2);
        beginning.appendValue(3);

        int expected = 228;
        int actual = beginning.findFirst(228).getData();
        assertEquals(expected, actual);

        DoubleLinkedList<Integer> middle = new DoubleLinkedList<>(0);

        middle.appendValue(1);
        middle.appendValue(228);
        middle.appendValue(3);
        middle.appendValue(4);

        expected = 228;
        actual = middle.findFirst(228).getData();
        assertEquals(expected, actual);

        DoubleLinkedList<Integer> last = new DoubleLinkedList<Integer>();

        last.appendValue(1);
        last.appendValue(2);
        last.appendValue(3);
        last.appendValue(228);

        expected = 228;
        actual = last.findFirst(228).getData();
        assertEquals(expected, actual);
    }

    @Test
    public void findFirst_multipleOccurrences() {
        DoubleLinkedList<Integer> beginning = new DoubleLinkedList<>(228);

        beginning.appendValue(1);
        beginning.appendValue(228);
        beginning.appendValue(228);

        int expected = 228;
        int actual = beginning.findFirst(228).getData();
        assertEquals(expected, actual);
    }

    @Test
    public void findFirst_ValueNotFound_ThrowsException() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        assertThrows(ValueNotFoundException.class, () -> list.findFirst(228));
    }

    // FINDFIRSTINDEX TESTS

    @Test
    public void findFirstIndex() {
        DoubleLinkedList<Integer> beginning = new DoubleLinkedList<>(228);

        beginning.appendValue(1);
        beginning.appendValue(2);
        beginning.appendValue(3);

        int expected = 0;
        int actual = beginning.findFirstIndex(228);
        assertEquals(expected, actual);

        DoubleLinkedList<Integer> middle = new DoubleLinkedList<>(0);

        middle.appendValue(1);
        middle.appendValue(228);
        middle.appendValue(3);
        middle.appendValue(4);

        expected = 2;
        actual = middle.findFirstIndex(228);
        assertEquals(expected, actual);

        DoubleLinkedList<Integer> last = new DoubleLinkedList<Integer>();

        last.appendValue(1);
        last.appendValue(2);
        last.appendValue(3);
        last.appendValue(228);

        expected = 3;
        actual = last.findFirstIndex(228);
        assertEquals(expected, actual);
    }

    @Test
    public void findFirstIndex_multipleOccurrences() {
        DoubleLinkedList<Integer> beginning = new DoubleLinkedList<>(228);

        beginning.appendValue(1);
        beginning.appendValue(228);
        beginning.appendValue(228);

        int expected = 0;
        int actual = beginning.findFirstIndex(228);
        assertEquals(expected, actual);
    }

    @Test
    public void findFirstIndex_ValueNotFound_ThrowsException() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        assertThrows(ValueNotFoundException.class, () -> list.findFirstIndex(228));
    }

    // FINDLAST TESTS

    @Test
    public void findLast() {
        DoubleLinkedList<Integer> beginning = new DoubleLinkedList<>(228);

        beginning.appendValue(1);
        beginning.appendValue(2);
        beginning.appendValue(3);

        int expected = 228;
        int actual = beginning.findLast(228).getData();
        assertEquals(expected, actual);

        DoubleLinkedList<Integer> middle = new DoubleLinkedList<>(0);

        middle.appendValue(1);
        middle.appendValue(228);
        middle.appendValue(3);
        middle.appendValue(4);

        expected = 228;
        actual = middle.findLast(228).getData();
        assertEquals(expected, actual);

        DoubleLinkedList<Integer> last = new DoubleLinkedList<Integer>();

        last.appendValue(1);
        last.appendValue(2);
        last.appendValue(3);
        last.appendValue(228);

        expected = 228;
        actual = last.findLast(228).getData();
        assertEquals(expected, actual);
    }

    @Test
    public void findLast_multipleOccurrences() {
        DoubleLinkedList<Integer> beginning = new DoubleLinkedList<>(228);

        beginning.appendValue(1);
        beginning.appendValue(228);
        beginning.appendValue(228);

        int expected = 228;
        int actual = beginning.findLast(228).getData();
        assertEquals(expected, actual);
    }

    @Test
    public void findLast_ValueNotFound_ThrowsException() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        assertThrows(ValueNotFoundException.class, () -> list.findLast(228));
    }

    // FINDLASTINDEX TESTS

    @Test
    public void findLastIndex() {
        DoubleLinkedList<Integer> beginning = new DoubleLinkedList<>(228);

        beginning.appendValue(1);
        beginning.appendValue(2);
        beginning.appendValue(3);

        int expected = 0;
        int actual = beginning.findLastIndex(228);
        assertEquals(expected, actual);

        DoubleLinkedList<Integer> middle = new DoubleLinkedList<>(0);

        middle.appendValue(1);
        middle.appendValue(228);
        middle.appendValue(3);
        middle.appendValue(4);

        expected = 2;
        actual = middle.findLastIndex(228);
        assertEquals(expected, actual);

        DoubleLinkedList<Integer> last = new DoubleLinkedList<Integer>();

        last.appendValue(1);
        last.appendValue(2);
        last.appendValue(3);
        last.appendValue(228);

        expected = 3;
        actual = last.findLastIndex(228);
        assertEquals(expected, actual);
    }

    @Test
    public void findLastIndex_multipleOccurrences() {
        DoubleLinkedList<Integer> beginning = new DoubleLinkedList<>(228);

        beginning.appendValue(1);
        beginning.appendValue(228);
        beginning.appendValue(228);

        int expected = 3;
        int actual = beginning.findLastIndex(228);
        assertEquals(expected, actual);
    }

    @Test
    public void findLastIndex_ValueNotFound_ThrowsException() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        assertThrows(ValueNotFoundException.class, () -> list.findLastIndex(228));
    }

    // ISEMPTY TESTS

    @Test
    public void isEnpty_EmptyList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();

        boolean expected = true;
        boolean actual = list.isEmpty();
        assertEquals(expected, actual);
    }

    @Test
    public void isEnpty_NotEmptyList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();

        list.appendValue(1);
        list.appendValue(1);
        list.appendValue(1);

        boolean expected = false;
        boolean actual = list.isEmpty();
        assertEquals(expected, actual);
    }

    @Test
    public void isEnpty_FullList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(4);

        list.appendValue(1);
        list.appendValue(3);
        list.appendValue(1);

        boolean expected = false;
        boolean actual = list.isEmpty();
        assertEquals(expected, actual);
    }

    // ISFULL TESTS

    @Test
    public void isFull_EmptyList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();

        boolean expected = false;
        boolean actual = list.isFull();
        assertEquals(expected, actual);
    }

    @Test
    public void isFull_NotEmptyList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();

        list.appendValue(1);
        list.appendValue(1);
        list.appendValue(1);

        boolean expected = true;
        boolean actual = list.isFull();
        assertEquals(expected, actual);
    }

    @Test
    public void isFull_FullList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(4);

        list.appendValue(1);
        list.appendValue(3);
        list.appendValue(1);

        boolean expected = true;
        boolean actual = list.isFull();
        assertEquals(expected, actual);
    }

    // CONTAINS TESTS

    @Test
    public void contains_ValueExists() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(4);

        list.appendValue(1);
        list.appendValue(3);
        list.appendValue(1);

        boolean expected = true;
        boolean actual = list.contains(4);
        assertEquals(expected, actual);
    }

    @Test
    public void contains_ValueNotExists() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(4);

        list.appendValue(1);
        list.appendValue(3);
        list.appendValue(1);

        boolean expected = false;
        boolean actual = list.contains(228);
        assertEquals(expected, actual);
    }

    // APPENDVALUE TESTS

    @Test
    public void appendValue_SizeValidation() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(228);

        list.appendValue(1);
        list.appendValue(228);
        list.appendValue(228);

        int expected = 4;
        int actual = list.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void appendValue_ValueValidation() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(228);

        list.appendValue(1);
        list.appendValue(228);
        list.appendValue(69);

        int expected = 69;
        int actual = list.getEnd().getData();
        assertEquals(expected, actual);
    }

    @Test
    public void appendValue_IntegrityValidation() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(0);

        for (int i = 1; i < 10; i++) {
            list.appendValue(i);
        }

        for (int i = 1; i < 10; i++) {
            assertEquals(i, list.get(i).getData());
        }
    }

    @Test
    public void appendValue_AppendNull() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(228);

        list.appendValue(null);
        Object actual = list.getEnd().getData();
        assertNull(actual);
    }

    // APPEND TESTS

    @Test
    public void append_SizeValidation() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(228);

        list.append(new Node<>(1));
        list.append(new Node<>(228));
        list.append(new Node<>(228));

        int expected = 4;
        int actual = list.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void append_ValueValidation() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(228);

        list.append(new Node<>(1));
        list.append(new Node<>(228));
        list.append(new Node<>(69));

        int expected = 69;
        int actual = list.getEnd().getData();
        assertEquals(expected, actual);
    }

    @Test
    public void append_IntegrityValidation() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(0);

        for (int i = 1; i < 10; i++) {
            list.append(new Node<>(i));
        }

        for (int i = 1; i < 10; i++) {
            assertEquals(i, list.get(i).getData());
        }
    }

    // POP TESTS

    @Test
    public void pop_PopFirst() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(228);

        list.appendValue(1);
        list.appendValue(228);
        list.appendValue(228);

        list.pop(list.get(0));

        int expected = 3;
        int actual = list.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void pop_PopLast() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(228);

        list.appendValue(1);
        list.appendValue(228);
        list.appendValue(228);

        list.pop(list.get(3));

        int expected = 3;
        int actual = list.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void pop_SizeValidation() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(228);

        list.appendValue(1);
        list.appendValue(228);
        list.appendValue(228);

        list.pop(list.get(3));

        int expected = 3;
        int actual = list.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void pop_IntegrityValidation() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(0);

        for (int i = 1; i < 10; i++) {
            list.appendValue(i);
        }

        list.pop(list.get(4));

        for (int i = 1; i < 4; i++) {
            assertEquals(i, list.get(i).getData());
        }

        for (int i = 4; i < 9; i++) {
            assertEquals(i + 1, list.get(i).getData());
        }
    }

    @Test
    public void pop_ValueNotFound_ThrowsException() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(228);

        list.appendValue(1);
        list.appendValue(228);
        list.appendValue(228);

        int expected = 4;
        int actual = list.getSize();
        assertEquals(expected, actual);
    }

    // POPINDEX TESTS

    @Test
    public void popIndex_PopFirst() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(228);

        list.appendValue(1);
        list.appendValue(228);
        list.appendValue(228);

        list.popIndex(0);

        int expected = 3;
        int actual = list.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void popIndex_PopLast() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(228);

        list.appendValue(1);
        list.appendValue(228);
        list.appendValue(228);

        list.popIndex(3);

        int expected = 3;
        int actual = list.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void popIndex_SizeValidation() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(228);

        list.appendValue(1);
        list.appendValue(228);
        list.appendValue(228);

        list.popIndex(3);

        int expected = 3;
        int actual = list.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void popIndex_IntegrityValidation() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(0);

        for (int i = 1; i < 10; i++) {
            list.appendValue(i);
        }

        list.popIndex(4);

        for (int i = 1; i < 4; i++) {
            assertEquals(i, list.get(i).getData());
        }

        for (int i = 4; i < 9; i++) {
            assertEquals(i + 1, list.get(i).getData());
        }
    }

    @Test
    public void popIndex_InvalidIndex_ThrowsException() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(228);

        assertThrows(InvalidIndexException.class, () -> list.popIndex(-1));
        assertThrows(InvalidIndexException.class, () -> list.popIndex(5));
    }

    // INSERTAFTER TESTS

    @Test
    public void insertAfter_SizeValidation() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(0);

        list.appendValue(1);
        list.appendValue(2);
        list.appendValue(3);

        Node<Integer> one = new Node<>(null, 228, null);
        Node<Integer> two = new Node<Integer>(one, 1337, null);
        one.setNext(two);
        Node<Integer> three = new Node<Integer>(two, 420, null);
        two.setNext(three);
        Node<Integer> four = new Node<Integer>(three, 69, null);
        three.setNext(four);

        list.insertAfter(list.findFirst(2), four);

        int expected = 8;
        int actual = list.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void insertAfter_IntegrityValidation() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(0);

        list.appendValue(1);
        list.appendValue(2);
        list.appendValue(7);

        Node<Integer> three = new Node<>(null, 3, null);
        Node<Integer> four = new Node<Integer>(three, 4, null);
        three.setNext(four);
        Node<Integer> five = new Node<Integer>(four, 5, null);
        four.setNext(five);
        Node<Integer> six = new Node<Integer>(four, 6, null);
        five.setNext(six);

        list.insertAfter(list.findFirst(2), four);

        for (int i = 0; i < 8; i++) {
            assertEquals(i, list.get(i).getData());
        }
    }

    // INSERTBEFORE TESTS

    @Test
    public void insertBefore_SizeValidation() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(0);

        list.appendValue(1);
        list.appendValue(2);
        list.appendValue(3);

        Node<Integer> one = new Node<>(null, 228, null);
        Node<Integer> two = new Node<Integer>(one, 1337, null);
        one.setNext(two);
        Node<Integer> three = new Node<Integer>(two, 420, null);
        two.setNext(three);
        Node<Integer> four = new Node<Integer>(three, 69, null);
        three.setNext(four);

        list.insertBefore(list.findFirst(2), four);

        int expected = 8;
        int actual = list.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void insertBefore_IntegrityValidation() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>(0);

        list.appendValue(1);
        list.appendValue(2);
        list.appendValue(7);

        Node<Integer> three = new Node<>(null, 3, null);
        Node<Integer> four = new Node<Integer>(three, 4, null);
        three.setNext(four);
        Node<Integer> five = new Node<Integer>(four, 5, null);
        four.setNext(five);
        Node<Integer> six = new Node<Integer>(four, 6, null);
        five.setNext(six);

        list.insertBefore(list.findFirst(7), three);

        for (int i = 0; i < 8; i++) {
            assertEquals(i, list.get(i).getData());
        }
    }
}
