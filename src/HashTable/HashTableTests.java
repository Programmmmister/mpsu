package HashTable;

import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashTableTests {

    @Test
    public void init_test() {
        HashTable table = new HashTable();
    }

    @Test
    public void insert() {
        HashTable table = new HashTable();
        table.input("a");
        table.input("b");
        table.input("c");

        String expected = "c";
        String actual = table.get(99).get(0).getData().data;
        assertEquals(expected, actual);
    }

    @Test
    public void insert_collision() {
        HashTable table = new HashTable();
        table.input("a");
        table.input("b");
        table.input("c");
        table.input("d");
        table.input("e");
        table.input("f");
        table.input("g");
        table.input("Some long string");
        table.input("Another long string");
        table.input("Other long string");

        String expected = "Some long string";
        String actual = table.get(1563).get(1).getData().data;
        assertEquals(expected, actual);
    }

    @Test
    public void insert_stressTesting() {
        HashTable table = new HashTable();
        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            table.input(Integer.toString(rand.nextInt(255)));
        }
    }

    @Test
    public void get_normal() {
        HashTable table = new HashTable();
        table.input("a");
        table.input("b");
        table.input("c");

        String expected = "c";
        String actual = table.get(99).get(0).getData().data;
        assertEquals(expected, actual);
    }

    @Test
    public void remove_normal() {
        HashTable table = new HashTable();
        table.input("a");
        table.input("b");
        table.input("c");

        table.remove(99);

        boolean expected = true;
        boolean actual = table.get(0).isEmpty();
        assertEquals(expected, actual);
    }
}
