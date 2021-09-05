package Graphs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GraphsTests {

    @Test
    public void init_test() {
        Graph graph = new Graph(1);
    }

    @Test
    public void add_valueTest() {
        Graph graph = new Graph(5);
        graph.add(3, 2);

        int expected = 2;
        int actual = graph.get(3).get(0).getData();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void add_sizeTest() {
        Graph graph = new Graph(5);
        graph.add(3, 2);

        int expected = 1;
        int actual = graph.get_size();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void delete_valueTest() {
        Graph graph = new Graph(5);
        graph.add(3, 2);
        graph.add(1, 1);
        graph.delete(1, 1);

        int expected = 2;
        int actual = graph.get(3).get(0).getData();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void delete_sizeTest() {
        Graph graph = new Graph(5);
        graph.add(3, 2);
        graph.delete(3, 2);

        int expected = 0;
        int actual = graph.get_size();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void get() {
        Graph graph = new Graph(5);
        graph.add(3, 2);

        int expected = 2;
        int actual = graph.get(3).get(0).getData();
        Assertions.assertEquals(expected, actual);
    }

}
